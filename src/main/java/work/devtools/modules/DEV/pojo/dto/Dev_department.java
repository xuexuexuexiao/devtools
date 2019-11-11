package work.devtools.modules.DEV.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import work.devtools.modules.DEV.pojo.po.T_department;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 部门dto
 * @create: 2019-03-31
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dev_department extends T_department {
}
