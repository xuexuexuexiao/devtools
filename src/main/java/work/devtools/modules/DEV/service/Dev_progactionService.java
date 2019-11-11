package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.pojo.dto.Dev_prog;
import work.devtools.modules.DEV.pojo.dto.Dev_progaction;
import work.devtools.modules.DEV.pojo.dto.Dev_progactionlang;

import java.util.List;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_progactionService
 * @Description:
 * @date 2019/04/28
 */
public interface Dev_progactionService {

    /**
     * 删除
     * @param ids
     */
    void delete(List<String> ids);

    /**
     * 查询程序所有按钮
     * @param progCode
     */
    List<Dev_progaction> queryProgAction(String progCode);

    /**
     * 查询按钮国际化名称
     * @param progCode
     */
    List<Dev_progactionlang> queryProgActionLang(String progCode,String actionCode);

    /**
     * 修改按钮国际化
     * @param dev_progactionlang
     * @return
     */
    Dev_progaction update(Dev_progactionlang dev_progactionlang);

    /**
     * 批量修改按钮国际化
     * @param dev_progactionlang
     * @return
     */
    List<Dev_progactionlang> updateBatch(List<Dev_progactionlang> dev_progactionlang);
}
