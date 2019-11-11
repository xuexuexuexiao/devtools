package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;
import work.devtools.modules.DEV.pojo.po.T_legal;

/**
 * @author Hxx
 * @version V1.0
 * @ClassName
 * @desc: legalService
 * @create: 2019-03-28
 **/
public interface Dev_legalService {
    /**
     * 查询法人资料
     * @param legal 查询的legal参数
     * @return
     */
    Page<Dev_legal> query(Dev_legal legal, Pageable pageable);

    /**
     * 新增保存
     * @param dev_legal
     * @return
     */
    T_legal save(Dev_legal dev_legal);

    /**
     * 根据法人编号查找法人资料信息
     * @param legal01
     * @return
     */
    T_legal findOne(String legal01);
}
