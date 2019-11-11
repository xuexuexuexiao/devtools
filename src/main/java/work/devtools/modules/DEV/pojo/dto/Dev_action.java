package work.devtools.modules.DEV.pojo.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:Dev_action
 * @Description:
 * @date 2019/04/25
 */
@Data
public class Dev_action implements Serializable {

    private String url;
    private String action;
}
