package work.devtools.modules.DEV.service;


import org.springframework.stereotype.Service;
import work.devtools.modules.DEV.pojo.dto.Dev_dbfieldlang;
import work.devtools.modules.DEV.web.Dev_dbfieldlangCondition;

import java.util.List;

/**
 * @author Amy_Wang
 * @version V1.0
 * @ClassName:Dev_dbfieldlangService
 * @Description:
 * @date 2018/12/28
 */
public interface Dev_dbfieldlangService {

    /**
     * 查询
     * @param dev_dbfieldlangQueryCondition 查询参数
     */
    List<Dev_dbfieldlang> query(Dev_dbfieldlangCondition dev_dbfieldlangQueryCondition);

    /**
     * 添加
     * @param dto
     * @return
     */
    Dev_dbfieldlang insert(Dev_dbfieldlang dto);

    /**
     * 删除
     * @param dto
     * @return
     */
    Dev_dbfieldlang delete(Dev_dbfieldlang dto);

    /**
     * 更新
     * @param dto
     * @return
     */
    Dev_dbfieldlang update(Dev_dbfieldlang dto);
}
