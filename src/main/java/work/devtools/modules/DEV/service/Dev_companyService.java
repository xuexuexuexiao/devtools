package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.po.T_company;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 公司资料service
 * @create: 2019-03-29
 **/
@Service
public interface Dev_companyService {
    /**
     * 更新或者保存
     * @param dev_company
     * @return
     */
    T_company save(Dev_company dev_company) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 删除公司资料
     * @param t_company
     * @return
     */
    void delete(T_company t_company);

    /**
     * 根据公司编号查询公司资料
     * @param company01
     * @return
     */
    T_company findByCompany01(String company01);

    /**
     * 分页查询
     * @param dev_company
     * @param pageable
     * @return
     */
    Page<Dev_company> query(Dev_company dev_company, Pageable pageable);

    Page<Dev_company> dynamicPageQuery(Pageable pageable, Dev_company dev_company);
}
