package work.devtools.modules.DEV.service;

import org.springframework.data.domain.Page;
import work.devtools.common.domain.web.QueryParams;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-17
 **/
public interface BaseService<T> {

    public Page<T> query(String queryCode, QueryParams queryParams);
}
