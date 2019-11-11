package work.devtools.modules.DEV.pojo.enums;

import lombok.Getter;

@Getter
public enum ResourcesTypeEnum {
    PROG("1"),//程序
    ACTION("2");//按钮


    private String value;
    ResourcesTypeEnum(String value) {
        this.value = value;
    }


}
