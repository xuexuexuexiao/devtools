package work.devtools.common.utils;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import work.devtools.common.domain.web.constants.Constants;
import work.devtools.modules.DEV.pojo.po.ColumDO;
import work.devtools.modules.DEV.pojo.po.TableInfoDO;

import java.io.*;
import java.util.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 代码生成工具类
 * @create: 2019-04-23
 **/
@Slf4j
public class GeneratorUtils {




    public static List<String> getTemplates() {
        List<String> templates = new ArrayList<String>();
        templates.add("templates/domain.java.vm");
        templates.add("templates/Dao.java.vm");
        templates.add("templates/Service.java.vm");
        templates.add("templates/ServiceImpl.java.vm");
        templates.add("templates/Controller.java.vm");
        //templates.add("templates/common/generator/menu.sql.vm");
        return templates;
    }

    /**
     * 生成代码
     * @param table
     * @param columns
     */
    public static  void generateCode(Map<String, String> table, List<Map<String, String>> columns){
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ZipOutputStream zip = new ZipOutputStream(outputStream);

        Configuration config = getConfig();
        //表信息
        TableInfoDO tableInfoDO = new TableInfoDO();
        tableInfoDO.setTableName(table.get("dbtable01"));
        tableInfoDO.setComments(table.get("dbtable02"));

        //表名换成java名  t_table -->T_table
        String className= StringUtil.toUpperCaseFirstOne(tableInfoDO.getTableName());
        tableInfoDO.setClassName(className);
        tableInfoDO.setName(className.substring(2));
        tableInfoDO.setClassname(tableInfoDO.getTableName());

        //列信息
        List<ColumDO> columDOList = new ArrayList<>();

        for (Map<String, String> column : columns) {
            ColumDO columnDO = new ColumDO();
            //列名
            columnDO.setColumnName(column.get("dbfield02"));
            //数据类型
            columnDO.setDataType(column.get("dbfield03"));
            //列备注  国际化  TODO 需要在前面做查询
//            columnDO.setComments(column.get("dbfield"));

            //列名转换成Java属性名
            String attrName =columnDO.getColumnName();
            columnDO.setAttrName(attrName);
            columnDO.setAttrname(StringUtils.uncapitalize(attrName));

            //列的数据类型，转换成Java类型
            String attrType = config.getString(columnDO.getDataType(), "unknowType");
            columnDO.setAttrType(attrType);

            //是否主键
            if ("Y".equalsIgnoreCase(column.get("dbfield05")) && tableInfoDO.getPk() == null) {
                tableInfoDO.setPk(columnDO);
            }

            columDOList.add(columnDO);
        }
        tableInfoDO.setColumns(columDOList);


        //没主键，则第一个字段为主键
        if (tableInfoDO.getPk() == null) {
            tableInfoDO.setPk(tableInfoDO.getColumns().get(0));
        }

        //设置velocity资源加载器
        Properties prop = new Properties();
        prop.put("file.resource.loader.class", "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
        Velocity.init(prop);

        //封装模板数据
        Map<String, Object> map = new HashMap<>(16);
        map.put("tableName", tableInfoDO.getTableName());
        map.put("comments", tableInfoDO.getComments());
        map.put("pk", tableInfoDO.getPk());
        map.put("className", tableInfoDO.getClassName());
        map.put("classname", tableInfoDO.getClassname());
        map.put("name",tableInfoDO.getName());
        map.put("pathName", config.getString("package").substring(config.getString("package").lastIndexOf(".") + 1));
        map.put("columns", tableInfoDO.getColumns());
        map.put("package", config.getString("package"));
        map.put("author", config.getString("author"));
        map.put("email", config.getString("email"));
        map.put("datetime", DateUtils.date2String(new Date(), DateUtils.DATE__TIME_PATTERN));
        //存放模板数据内容的容器
        VelocityContext context = new VelocityContext(map);

        //获取模板列表
        List<String> templates = getTemplates();
        for (String template : templates) {
            //渲染模板
            StringWriter sw = new StringWriter();
            Template tpl = Velocity.getTemplate(template, "UTF-8");
            tpl.merge(context, sw);

            log.info("模板:  ================= "+sw.toString());
            try {
                IOUtils.write(sw.toString(),new FileOutputStream(getFileName(template, tableInfoDO.getClassname(), tableInfoDO.getClassName(), config.getString("package"))));
                IOUtils.closeQuietly(sw);

                zip.closeEntry();
            }catch (FileNotFoundException e){
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


    public static Configuration getConfig() {
        try {
            return new PropertiesConfiguration("generator.properties");
        } catch (ConfigurationException e) {
            //TODO  获取配置文件失败
            e.printStackTrace();
//            throw new Exception("获取配置文件失败，", e);
        }
        return  null;
    }



    /**
     * 获取文件名
     */
    public static String getFileName(String template, String classname, String className, String packageName) {
        String packagePath = Constants.PROJECT_PATH.DEV_PATH;
        if (org.apache.commons.lang.StringUtils.isNotBlank(packageName)) {
            packagePath += packageName.replace(".", File.separator) + File.separator;
        }

        if (template.contains("domain.java.vm")) {
            return packagePath + "pojo" + File.separator + "po" + File.separator + className + ".java";
        }

        if (template.contains("Dao.java.vm")) {
            return packagePath + "dao" + File.separator + className + "Dao.java";
        }


        if (template.contains("Service.java.vm")) {
            return packagePath + "service" + File.separator + className + "Service.java";
        }

        if (template.contains("ServiceImpl.java.vm")) {
            return packagePath + "service" + File.separator + "impl" + File.separator + className + "ServiceImpl.java";
        }

        if (template.contains("Controller.java.vm")) {
            return packagePath + "web" + File.separator + className + "Controller.java";
        }

        return null;
    }
}
