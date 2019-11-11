package work.devtools.modules.DEV.service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import work.devtools.modules.DEV.pojo.dto.Dev_group;
import work.devtools.modules.DEV.pojo.po.T_group;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 组织service接口
 * @create: 2019-03-31
 **/
public interface Dev_groupService {
    /**
     * 列表分页查询
     * @param pageRequest
     * @param dev_group
     * @return
     */
    Page<Dev_group> dynamicPageQuery(PageRequest pageRequest, Dev_group dev_group);

    /**
     * 保存或者更新业务组
     * @param dev_group
     * @return
     */
    Dev_group save(Dev_group dev_group) throws SQLException, IOException, ClassNotFoundException;

    /**
     * 根据业务组编号查找业务
     * @param group01
     * @return
     */
    T_group findByGroup01(String group01);

    /**
     * 删除业务组
     * @param group01
     */
    void delete(String group01);
}
