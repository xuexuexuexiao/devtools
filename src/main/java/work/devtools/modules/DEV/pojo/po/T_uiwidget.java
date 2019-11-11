package work.devtools.modules.DEV.pojo.po;


import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 前端界面
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_uiwidget")
@IdClass(T_uiwidgetPK.class)
public class T_uiwidget implements Serializable {

	/**
	 * 前端框架
	 */
	@Id
	private String uiwidget01;

	/**
	 * 控件
	 */
	@Id
	private String uiwidget02;

	/**
	 * 控件名称
	 */
	private String uiwidget03;

	/**
	 * 类路径
	 */
	private String uiwidget04;

	/**
	 * nouse
	 */
	private String uiwidget60;

	/**
	 * nouse
	 */
	private String uiwidget61;

	/**
	 * nouse
	 */
	private String uiwidget62;

	/**
	 * nouse
	 */
	private String uiwidget63;

	/**
	 * nouse
	 */
	private String uiwidget64;

	/**
	 * nouse
	 */
	private String uiwidget65;

	/**
	 * nouse
	 */
	private String uiwidget66;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget67;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget68;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget69;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget70;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget71;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget72;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget73;

	/**
	 * nouse
	 */
	private BigDecimal uiwidget74;

	/**
	 * nouse
	 */
	private String uiwidget75;

	/**
	 * nouse
	 */
	private String uiwidget76;

	/**
	 * nouse
	 */
	private String uiwidget77;

	/**
	 * nouse
	 */
	private String uiwidget78;

	/**
	 * nouse
	 */
	private String uiwidget79;

	/**
	 * nouse
	 */
	private String uiwidget80;

	/**
	 * nouse
	 */
	private String uiwidget81;

	/**
	 * nouse
	 */
	private String uiwidget82;

	/**
	 * nouse
	 */
	private String uiwidget83;

	/**
	 * nouse
	 */
	private String uiwidget84;

	/**
	 * nouse
	 */
	private Date uiwidget85;

	/**
	 * nouse
	 */
	private Date uiwidget86;

	/**
	 * nouse
	 */
	private Date uiwidget87;

	/**
	 * nouse
	 */
	private Date uiwidget88;

	/**
	 * nouse
	 */
	private Date uiwidget89;

	/**
	 * nouse
	 */
	private Date uiwidget90;

	/**
	 * 基础资料状况码
	 */
	private String uiwidgetstatus;

	/**
	 * 细颗粒权限码
	 */
	private String uiwidgetauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String uiwidgetcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date uiwidgetcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String uiwidgetmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date uiwidgetmodd;

	/**
	 * 法人
	 */
	private String uiwidgetlegal;

	/**
	 * 公司
	 */
	private String uiwidgetcompany;

	/**
	 * 国际化多语言1
	 */
	private String uiwidgetlang01;

	/**
	 * 国际化多语言2
	 */
	private String uiwidgetlang02;

	/**
	 * 国际化多语言3
	 */
	private String uiwidgetlang03;

	/**
	 * 国际化多语言4
	 */
	private String uiwidgetlang04;

	/**
	 * 国际化多语言5
	 */
	private String uiwidgetlang05;

	/**
	 * 国际化多语言6
	 */
	private String uiwidgetlang06;

	/**
	 * 国际化多语言7
	 */
	private String uiwidgetlang07;

	/**
	 * 国际化多语言8
	 */
	private String uiwidgetlang08;

	/**
	 * 国际化多语言9
	 */
	private String uiwidgetlang09;

	/**
	 * 国际化多语言10
	 */
	private String uiwidgetlang10;

	/**
	 * 国际化多语言11
	 */
	private String uiwidgetlang11;

	/**
	 * 国际化多语言12
	 */
	private String uiwidgetlang12;

	/**
	 * 国际化多语言13
	 */
	private String uiwidgetlang13;

	/**
	 * 国际化多语言14
	 */
	private String uiwidgetlang14;

	/**
	 * 国际化多语言15
	 */
	private String uiwidgetlang15;

	/**
	 * 国际化多语言16
	 */
	private String uiwidgetlang16;

	/**
	 * 国际化多语言17
	 */
	private String uiwidgetlang17;

	/**
	 * 国际化多语言18
	 */
	private String uiwidgetlang18;

	/**
	 * 国际化多语言19
	 */
	private String uiwidgetlang19;

	/**
	 * 国际化多语言20
	 */
	private String uiwidgetlang20;

}
