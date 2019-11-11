package work.devtools.modules.DEV.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import work.devtools.modules.DEV.dao.T_legalDao;
import work.devtools.modules.DEV.mappers.Dev_legalMapper;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.pojo.po.T_legal;
import work.devtools.modules.DEV.service.Dev_legalService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 法人ServiceImpl
 * @create: 2019-03-28
 **/
@Service
public class Dev_legalServiceImpl implements Dev_legalService{

    @Autowired
    private T_legalDao t_legalDao;


    @Override
    public Page<Dev_legal> query(Dev_legal legal, Pageable pageable) {
        T_legal t_legal = Dev_legalMapper.INSTANCE.dev_legalToT_Legal(legal);
        Example ex = Example.of(t_legal);
        Page<T_legal> list = t_legalDao.findAll(ex,pageable);
        //po 转DTo
        List<Dev_legal> legalDtoList = new ArrayList<>();
        for(T_legal t_legal1: list){
            legalDtoList.add(Dev_legalMapper.INSTANCE.t_legalToDev_legal(t_legal1));
        }
        return new PageImpl<>(legalDtoList, pageable, list.getTotalElements());
    }

    @Override
    @Transactional
    public T_legal save(Dev_legal dev_legal) {
        T_legal t_legal = Dev_legalMapper.INSTANCE.dev_legalToT_Legal(dev_legal);
        return  t_legalDao.save(t_legal);
    }

    @Override
    public T_legal findOne(String legal01) {
        return null;
    }
}
