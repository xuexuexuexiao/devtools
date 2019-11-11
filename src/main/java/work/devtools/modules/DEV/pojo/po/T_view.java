package work.devtools.modules.DEV.pojo.po;


import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author xxx
 * @date 2019-04-11
 */
@Entity
@Data
@Table(name = "t_view")
@EntityListeners(AuditingEntityListener.class)
public class T_view  implements Serializable {

	/**
	 * 界面编号
	 */
	@Id
	private String view01;

	/**
	 * 界面名称
	 */
	private String view02;

	/**
	 * 归属程序编号
	 */
	private String view03;

	/**
	 * 对应类路径
	 */
	private String view04;

	/**
	 * nouse
	 */
	private String view60;

	/**
	 * nouse
	 */
	private String view61;

	/**
	 * nouse
	 */
	private String view62;

	/**
	 * nouse
	 */
	private String view63;

	/**
	 * nouse
	 */
	private String view64;

	/**
	 * nouse
	 */
	private String view65;

	/**
	 * nouse
	 */
	private String view66;

	/**
	 * nouse
	 */
	private BigDecimal view67;

	/**
	 * nouse
	 */
	private BigDecimal view68;

	/**
	 * nouse
	 */
	private BigDecimal view69;

	/**
	 * nouse
	 */
	private BigDecimal view70;

	/**
	 * nouse
	 */
	private BigDecimal view71;

	/**
	 * nouse
	 */
	private BigDecimal view72;

	/**
	 * nouse
	 */
	private BigDecimal view73;

	/**
	 * nouse
	 */
	private BigDecimal view74;

	/**
	 * nouse
	 */
	private String view75;

	/**
	 * nouse
	 */
	private String view76;

	/**
	 * nouse
	 */
	private String view77;

	/**
	 * nouse
	 */
	private String view78;

	/**
	 * nouse
	 */
	private String view79;

	/**
	 * nouse
	 */
	private String view80;

	/**
	 * nouse
	 */
	private String view81;

	/**
	 * nouse
	 */
	private String view82;

	/**
	 * nouse
	 */
	private String view83;

	/**
	 * nouse
	 */
	private String view84;

	/**
	 * nouse
	 */
	private Date view85;

	/**
	 * nouse
	 */
	private Date view86;

	/**
	 * nouse
	 */
	private Date view87;

	/**
	 * nouse
	 */
	private Date view88;

	/**
	 * nouse
	 */
	private Date view89;

	/**
	 * nouse
	 */
	private Date view90;

	/**
	 * 基础资料状况码
	 */
	private String viewstatus;

	/**
	 * 细颗粒权限码
	 */
	private String viewauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String viewcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date viewcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String viewmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date viewmodd;

	/**
	 * 法人
	 */
	private String viewlegal;

	/**
	 * 公司
	 */
	private String viewcompany;

	/**
	 * 国际化多语言1
	 */
	private String viewlang01;

	/**
	 * 国际化多语言2
	 */
	private String viewlang02;

	/**
	 * 国际化多语言3
	 */
	private String viewlang03;

	/**
	 * 国际化多语言4
	 */
	private String viewlang04;

	/**
	 * 国际化多语言5
	 */
	private String viewlang05;

	/**
	 * 国际化多语言6
	 */
	private String viewlang06;

	/**
	 * 国际化多语言7
	 */
	private String viewlang07;

	/**
	 * 国际化多语言8
	 */
	private String viewlang08;

	/**
	 * 国际化多语言9
	 */
	private String viewlang09;

	/**
	 * 国际化多语言10
	 */
	private String viewlang10;

	/**
	 * 国际化多语言11
	 */
	private String viewlang11;

	/**
	 * 国际化多语言12
	 */
	private String viewlang12;

	/**
	 * 国际化多语言13
	 */
	private String viewlang13;

	/**
	 * 国际化多语言14
	 */
	private String viewlang14;

	/**
	 * 国际化多语言15
	 */
	private String viewlang15;

	/**
	 * 国际化多语言16
	 */
	private String viewlang16;

	/**
	 * 国际化多语言17
	 */
	private String viewlang17;

	/**
	 * 国际化多语言18
	 */
	private String viewlang18;

	/**
	 * 国际化多语言19
	 */
	private String viewlang19;

	/**
	 * 国际化多语言20
	 */
	private String viewlang20;

}
