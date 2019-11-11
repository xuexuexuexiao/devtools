package work.devtools.common.utils;

import work.devtools.common.domain.web.DevToolsResponse;

/**
 * 统一返回
 * @author Lero
 * @date 2019-03-28 14:37
 * @version 1.0
 */

public class ResultUtil {

    public static DevToolsResponse success(String code, String message,Object object){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        return devToolsResponse;
    }

    public static DevToolsResponse error(String code, String message) {
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        devToolsResponse.setCode(code);
        devToolsResponse.setMessage(message);
        return devToolsResponse;
    }

    public static DevToolsResponse error(String code,String message,Object object){
        DevToolsResponse devToolsResponse = new DevToolsResponse();
        devToolsResponse.setCode(code);
        devToolsResponse.setMessage(message);
        return devToolsResponse;
    }



}
