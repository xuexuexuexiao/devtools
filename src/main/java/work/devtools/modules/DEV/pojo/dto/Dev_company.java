package work.devtools.modules.DEV.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Date;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: companyDto
 * @create: 2019-03-29
 **/
@Data
public class Dev_company {

    private String company01;//公司编号
    private String company02;//公司名称
    private String company03;//公司名称2
    private String company04;//公司法人
    private String company05;//公司电话
    private String company06;//公司传真
    private String company07;//公司邮箱
    private String company08;//公司地址
    private String company09;//归属法人编号,取自t_legal的legal01编号
    private String  legal02;//法人名称

    private String company60;//nouse
    private String company61;//nouse
    private String company62;//nouse
    private String company63;//nouse
    private String company64;//nouse
    private String company65;//nouse
    private String company66;//nouse
    private String company67;//nouse
    private String company68;//nouse
    private String company69;//nouse
    private String company70;//nouse
    private String company71;//nouse
    private String company72;//nouse
    private String company73;//nouse
    private String company74;//nouse
    private String company75;//nouse
    private String company76;//nouse
    private String company77;//nouse
    private String company78;//nouse
    private String company79;//nouse
    private String company80;//nouse
    private String company81;//nouse
    private String company82;//nouse
    private String company83;//nouse
    private String company84;//nouse
    private Date company85 ;//nouse
    private Date company86;//nouse
    private Date company87;//nouse
    private Date company88;//nouse
    private Date company89;//nouse
    private Date company90;//nouse

    private String companystatus;//基础资料状况码
    private String companyauthcode;//细颗粒权限码
    private String companycreu;//创建人
    private Date companycred;//创建时间
    private String companymodu;//更新人
    private Date companymodd;//更新时间
    private String companylegal;//法人
    private String companycompany;//公司
    private String companylang01;//国际化多语言1
    private String companylang02;//国际化多语言2
    private String companylang03;//国际化多语言3
    private String companylang04;//国际化多语言4
    private String companylang05;//国际化多语言5
    private String companylang06;//国际化多语言6
    private String companylang07;//国际化多语言7
    private String companylang08;//国际化多语言8
    private String companylang09;//国际化多语言9
    private String companylang10;//国际化多语言10
    private String companylang11;//国际化多语言11
    private String companylang12;//国际化多语言12
    private String companylang13;//国际化多语言13
    private String companylang14;//国际化多语言14
    private String companylang15;//国际化多语言15
    private String companylang16;//国际化多语言16
    private String companylang17;//国际化多语言17
    private String companylang18;//国际化多语言18
    private String companylang19;//国际化多语言19
    private String companylang20;//国际化多语言20


    @Override
    public String toString() {
        return "Dev_company{" +
                "company01='" + company01 + '\'' +
                ", company02='" + company02 + '\'' +
                ", company03='" + company03 + '\'' +
                ", company04='" + company04 + '\'' +
                ", company05='" + company05 + '\'' +
                ", company06='" + company06 + '\'' +
                ", company07='" + company07 + '\'' +
                ", company08='" + company08 + '\'' +
                ", company09='" + company09 + '\'' +
                ", legal02='" + legal02 + '\'' +
                ", company60='" + company60 + '\'' +
                ", company61='" + company61 + '\'' +
                ", company62='" + company62 + '\'' +
                ", company63='" + company63 + '\'' +
                ", company64='" + company64 + '\'' +
                ", company65='" + company65 + '\'' +
                ", company66='" + company66 + '\'' +
                ", company67='" + company67 + '\'' +
                ", company68='" + company68 + '\'' +
                ", company69='" + company69 + '\'' +
                ", company70='" + company70 + '\'' +
                ", company71='" + company71 + '\'' +
                ", company72='" + company72 + '\'' +
                ", company73='" + company73 + '\'' +
                ", company74='" + company74 + '\'' +
                ", company75='" + company75 + '\'' +
                ", company76='" + company76 + '\'' +
                ", company77='" + company77 + '\'' +
                ", company78='" + company78 + '\'' +
                ", company79='" + company79 + '\'' +
                ", company80='" + company80 + '\'' +
                ", company81='" + company81 + '\'' +
                ", company82='" + company82 + '\'' +
                ", company83='" + company83 + '\'' +
                ", company84='" + company84 + '\'' +
                ", company85=" + company85 +
                ", company86=" + company86 +
                ", company87=" + company87 +
                ", company88=" + company88 +
                ", company89=" + company89 +
                ", company90=" + company90 +
                ", companystatus='" + companystatus + '\'' +
                ", companyauthcode='" + companyauthcode + '\'' +
                ", companycreu='" + companycreu + '\'' +
                ", companycred=" + companycred +
                ", companymodu='" + companymodu + '\'' +
                ", companymodd=" + companymodd +
                ", companylegal='" + companylegal + '\'' +
                ", companycompany='" + companycompany + '\'' +
                ", companylang01='" + companylang01 + '\'' +
                ", companylang02='" + companylang02 + '\'' +
                ", companylang03='" + companylang03 + '\'' +
                ", companylang04='" + companylang04 + '\'' +
                ", companylang05='" + companylang05 + '\'' +
                ", companylang06='" + companylang06 + '\'' +
                ", companylang07='" + companylang07 + '\'' +
                ", companylang08='" + companylang08 + '\'' +
                ", companylang09='" + companylang09 + '\'' +
                ", companylang10='" + companylang10 + '\'' +
                ", companylang11='" + companylang11 + '\'' +
                ", companylang12='" + companylang12 + '\'' +
                ", companylang13='" + companylang13 + '\'' +
                ", companylang14='" + companylang14 + '\'' +
                ", companylang15='" + companylang15 + '\'' +
                ", companylang16='" + companylang16 + '\'' +
                ", companylang17='" + companylang17 + '\'' +
                ", companylang18='" + companylang18 + '\'' +
                ", companylang19='" + companylang19 + '\'' +
                ", companylang20='" + companylang20 + '\'' +
                '}';
    }
}
