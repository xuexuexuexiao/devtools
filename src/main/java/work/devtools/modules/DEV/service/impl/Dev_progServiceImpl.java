package work.devtools.modules.DEV.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.common.utils.ClassUtil;
import work.devtools.common.utils.ExceptionUtil;
import work.devtools.common.utils.QueryUtil;
import work.devtools.common.utils.StringUtil;
import work.devtools.modules.DEV.dao.*;
import work.devtools.modules.DEV.mappers.Dev_progMapper;
import work.devtools.modules.DEV.mappers.Dev_progactionlangMapper;
import work.devtools.modules.DEV.mappers.Dev_proglangMapper;
import work.devtools.modules.DEV.pojo.dto.*;
import work.devtools.modules.DEV.pojo.enums.ResourcesTypeEnum;
import work.devtools.modules.DEV.pojo.po.*;
import work.devtools.modules.DEV.service.Dev_progService;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Collectors;

/**
* @Description:
* @Author: CPQ
* @date: 2019/4/18 0018 上午 10:27
* @Version: 1.0
*/
@Slf4j
@Service
public class Dev_progServiceImpl implements Dev_progService {

    @Autowired
    private T_progDao t_progDao;
    @Autowired
    private T_proglangDao t_proglangDao;
    @Autowired
    private T_moduleDao t_moduleDao;
    @Autowired
    private T_progactionDao t_progactionDao;
    @Autowired
    private T_langDao t_langDao;
    @Autowired
    private T_progactionlangDao t_progactionlangDao;
    @Autowired
    private T_resourcesDao t_resourcesDao;
    @Autowired
    private T_actionresourcesDao t_actionresourcesDao;
    @Autowired
    private T_progresourcesDao t_progresourcesDao;


    @Override
    public Page<Dev_prog> query(String queryCode, QueryParams queryParams) {
        Page<Dev_prog> list = QueryUtil.query(queryCode,queryParams);
        return list;
    }

    @Transactional
    @Override
    public Dev_prog insert(Dev_prog dto) {

        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库
        T_prog t_prog = t_progDao.saveAndFlush(Dev_progMapper.INSTANCE.Dev_progToT_prog(dto));

        List<T_lang> langs = t_langDao.findAll();
        langs.stream().forEach(t_lang -> {
            T_proglang t_proglang = new T_proglang();
            t_proglang.setProglang01(t_prog.getProg01());
            t_proglang.setProglang02(t_lang.getLang01());
            t_proglangDao.saveAndFlush(t_proglang);
        });

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }

    @Override
    public Dev_prog update(Dev_prog dto) {
        // 1.dto 业务逻辑计算

        // 2.数据insert到数据库
        T_prog t_prog = t_progDao.saveAndFlush(Dev_progMapper.INSTANCE.Dev_progToT_prog(dto));

        //3. dto 业务逻辑返回值处理（set数据给dto返回给前端）
        return dto;
    }

    @Override
    public void delete(List<String> ids) {
        // 1.dto 业务逻辑计算
        for (String id: ids ) {
            // 2.删除数据库数据
            t_progDao.deleteById(id);
            //删除程序语言
            t_proglangDao.deleteByProglang01(id);


            //删除按钮
            t_progactionDao.deleteByProgaction01(id);
            //删除按钮语言
            t_progactionlangDao.deleteByProgactionlang01(id);
            //删除资源
            List<T_actionresources> t_actionresourcesList = t_actionresourcesDao.findByActionresources01(id);
            t_actionresourcesList.stream().forEach(t_actionresources->{
                t_resourcesDao.deleteById(t_actionresources.getActionresources03());
            });

            List<T_progresources> t_progresourcesList = t_progresourcesDao.findByProgresources01(id);
            t_progresourcesList.stream().forEach(t_progresources->{
                t_resourcesDao.deleteById(t_progresources.getProgresources02());
            });

            //删除按钮资源
            t_actionresourcesDao.deleteByActionresources01(id);
            //删除程序资源
            t_progresourcesDao.deleteByProgresources01(id);
        }

    }

    /**
     *  获取程序国际化列表
     * @param progCode
     * @return
     */
    public List<Dev_proglang> queryProgLang(String progCode){
        return t_proglangDao.queryProgLang(progCode);
    }

    @Override
    public Dev_proglang updateProgLang(Dev_proglang dev_proglang) {
        t_proglangDao.saveAndFlush(Dev_proglangMapper.INSTANCE.Dev_proglangToT_proglang(dev_proglang));
        return null;
    }

    @Override
    public List<Dev_proglang> updateProgLangBatch(List<Dev_proglang> dev_proglangs) {
        t_proglangDao.saveAll(Dev_proglangMapper.INSTANCE.Dev_proglangListToT_proglangList(dev_proglangs));
        return null;
    }

    /**
     * 处理按钮清单
     * @param progCode
     */
    @Transactional
    @Override
    public void handleProgActionList(String progCode) {

        if(StringUtil.isEmpty(progCode)){
            ExceptionUtil.singleException("001");//001:程序编号不能为空,001取的是表t_error表的error01
        }
        //获取模块编号
        String moduleCode = null;
        //获取controller类名
        String controllerName = null;
        T_prog t_prog = t_progDao.getOne(progCode);
        if(t_prog==null){
            ExceptionUtil.singleException("002");//002:程序不存在,002取的是表t_error表的error01
        }
        moduleCode = t_prog.getProg02();
        controllerName = t_prog.getProg06();


        //获取模块的controller路径
        String controllerPath = t_moduleDao.findControllerPath(moduleCode);

        if(StringUtil.isEmpty(controllerPath) || StringUtil.isEmpty(controllerName)){
            ExceptionUtil.singleException("003");//003:Controller路径或类名不存在,003取的是表t_error表的error01
        }

        //获取controller类路径

        String path =  controllerPath + "." + controllerName;

        //获取Controller类
        Class cl = ClassUtil.loadClass(path);
        //获取方法
        Method[] methods = cl.getDeclaredMethods();
        //获取所有url及对应方法名
        List<Dev_action> annotationValueList = this.getAnnotationValue(methods);

        //获取所有方法名
        List<String> list = annotationValueList.stream().map(dev_action ->
            dev_action.getAction()
        ).collect(Collectors.toList());


        List<String> methodList = this.getMethodResources(list);
        List<String> progList = this.getProgResources(list);
        List<String> actionList = this.getActionResources(methodList);
        //4、插入t_progaction,t_progactionlang,t_progresources,t_actionresources,t_resources
        this.insertAction(progCode,actionList);
        this.insertActionLang(progCode,actionList);
        this.insertProgResources(progCode,progList);
        this.insertActionResources(progCode,methodList,actionList);
        this.insertResources(progCode,annotationValueList);


    }

    /*
     * 获取controller上方法请求注解的value值
     */
    private List<Dev_action> getAnnotationValue(Method[] methods){
        List<Dev_action> list = new ArrayList<>();
        for (Method method : methods) {

            String methodName = method.getName();

            String[] values = null;
            GetMapping getRequestMothed = (GetMapping) method.getAnnotation(GetMapping.class);
            PutMapping putRequestMothed = (PutMapping) method.getAnnotation(PutMapping.class);
            PostMapping postRequestMothed = (PostMapping) method.getAnnotation(PostMapping.class);
            DeleteMapping deleteRequestMothed = (DeleteMapping)method.getAnnotation(DeleteMapping.class);
            if(getRequestMothed!=null){
                values = getRequestMothed.value().length>1?new String[getRequestMothed.value().length]:new String[0];
                values = getRequestMothed.value();

            }else if(putRequestMothed!=null){
                values = putRequestMothed.value().length>1?new String[putRequestMothed.value().length]:new String[0];
                values = putRequestMothed.value();
            }else if(postRequestMothed!=null){
                values = postRequestMothed.value().length>1?new String[postRequestMothed.value().length]:new String[0];
                values = postRequestMothed.value();

            }else if(deleteRequestMothed!=null){
                values = deleteRequestMothed.value().length>1?new String[deleteRequestMothed.value().length]:new String[0];
                values = deleteRequestMothed.value();
            }
            for (String value: values) {
                Dev_action action = new Dev_action();
                action.setAction(methodName);
                action.setUrl(value);
                list.add(action);
            }

        }
        return list;

    }

    /**
     * 获取方法列表
     * @param annotationValueList
     * @return
     */
    private List<String> getMethodResources(List<String> annotationValueList){
        List<String> list = annotationValueList.stream().filter(value-> !value.toLowerCase().contains("open") && !value.toLowerCase().contains("close")).collect(Collectors.toList());
        return list;

    }

    /**
     * 获取按钮列表
     * @param annotationValueList
     * @return
     */
    private List<String> getActionResources(List<String> annotationValueList){
        //获取方法名第一个大写前面的字符串
        List<String> list = annotationValueList.stream().map(value-> StringUtil.upperCaseFirst(value)).distinct().collect(Collectors.toList());
        return list;

    }

    /**
     * 获取有请求注解的程序方法列表
     * @param annotationValueList
     * @return
     */
    private List<String> getProgResources(List<String> annotationValueList){
        List<String> list = annotationValueList.stream().filter(value-> value.toLowerCase().contains("open") || value.toLowerCase().contains("close")).collect(Collectors.toList());
        return list;

    }

    /**
     * 插入按钮清单
     * @param progCode
     * @param actionList
     */
    private void insertAction(String progCode,List<String> actionList){
        actionList.stream().forEach(actionCode -> {
            T_progaction t_progaction = new T_progaction();
            t_progaction.setProgaction01(progCode);
            t_progaction.setProgaction02(actionCode);
            t_progactionDao.saveAndFlush(t_progaction);
        });
    }

    /**
     * 插入按钮国际化
     * @param progCode
     * @param actionList
     */
    private void insertActionLang(String progCode,List<String> actionList){
        List<T_lang> list = t_langDao.findAll();
        actionList.stream().forEach(actionCode->{
            for (T_lang lang: list ) {
                T_progactionlang t_progactionlang = new T_progactionlang();
                t_progactionlang.setProgactionlang01(progCode);
                t_progactionlang.setProgactionlang02(actionCode);
                t_progactionlang.setProgactionlang03(lang.getLang01());
                t_progactionlangDao.saveAndFlush(t_progactionlang);
            }
        });
    }

    /**
     * 插入程序资源表
     * @param progCode
     * @param progList
     */
    private void insertProgResources(String progCode,List<String> progList){
        progList.stream().forEach(actionCode -> {
            T_progresources t_progresources = new T_progresources();
            t_progresources.setProgresources01(progCode);
            t_progresources.setProgresources02(progCode+"_"+actionCode);
            t_progresourcesDao.saveAndFlush(t_progresources);
        });
    }

    /**
     * 插入按钮资源表
     * @param progCode
     * @param methodList
     */
    private void insertActionResources(String progCode,List<String> methodList,List<String> actionList){
        methodList.stream().forEach(methodCode -> {
            T_actionresources t_actionresources = new T_actionresources();
            t_actionresources.setActionresources01(progCode);
            actionList.stream().forEach(actionCode->{
                if(methodCode.contains(actionCode)){
                    t_actionresources.setActionresources02(actionCode);
                    return;
                }
            });

            t_actionresources.setActionresources03(progCode+"_"+methodCode);
            t_actionresourcesDao.saveAndFlush(t_actionresources);
        });
    }

    /**
     * 插入资源表
     * @param progCode
     * @param annotationValueList
     */
    private void insertResources(String progCode,List<Dev_action> annotationValueList){

        annotationValueList.stream().forEach(action -> {
            T_resources t_resources = new T_resources();
            t_resources.setResources01(progCode+"_"+action.getAction());
            if(action.getAction().toLowerCase().contains("open") || action.getAction().toLowerCase().contains("close")){
                t_resources.setResources02(ResourcesTypeEnum.PROG.getValue());
            }else{
                t_resources.setResources02(ResourcesTypeEnum.ACTION.getValue());
            }
            t_resources.setResources03("/"+progCode+action.getUrl());
            t_resourcesDao.saveAndFlush(t_resources);
        });


    }




}
