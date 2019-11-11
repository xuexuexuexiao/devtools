package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import work.devtools.common.domain.web.QueryParams;
import work.devtools.modules.DEV.pojo.dto.Dev_error;
import work.devtools.modules.DEV.pojo.po.T_error;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-15
 **/
public interface Dev_errorService {
    Page<Dev_error> query(String error01, QueryParams queryParams);

    T_error save(Dev_error dev_error);

    T_error findByError01(String error01);

    void delete(T_error t_error);
}
