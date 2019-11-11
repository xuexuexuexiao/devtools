package work.devtools.common.domain.po;

import lombok.Data;
import work.devtools.common.domain.web.QueryParams;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 查询条件
 * @create: 2019-04-17
 **/
@Data
public class QueryCondition {

    private String queryCode;

    private QueryParams queryParams;


    public QueryCondition(String queryCode){
        this.queryCode = queryCode;
    }

    public QueryCondition(String queryCode,QueryParams params){
        this.queryCode = queryCode;
        this.queryParams = params;
    }
}
