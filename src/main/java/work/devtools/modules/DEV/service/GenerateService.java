package work.devtools.modules.DEV.service;

import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:产生代码
 * @create: 2019-04-23
 **/
public interface GenerateService {
    /**
     * 产生代码
     * @param table
     */
    void generateCode(String table);

    List<Map<String,String>> findTableInfo(String table);
}
