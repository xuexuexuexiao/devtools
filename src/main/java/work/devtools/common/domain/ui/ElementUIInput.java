package work.devtools.common.domain.ui;

import lombok.Data;

/**
 * @author Lero
 * @version V1.0
 * @ClassName:UIInput
 * @Description:
 * @date 2018/12/28
 */

@Data
public class ElementUIInput {

    private String id ;      // 栏位编号
    private String label ;    // 栏位 名称
    private String dataType;  //栏位 po 类型
    private String noEntry;  //可录否
    private String required; //必录否
    private String hidden;   //隐藏否
    private String picture;  //显示 图标
    private String comment;  // 提示信息


}
