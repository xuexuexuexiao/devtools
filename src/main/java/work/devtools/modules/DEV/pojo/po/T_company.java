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
 * 公司表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_company")
public class T_company implements Serializable {

	/**
	 * 公司编号
	 */
	@Id
	private String company01;

	/**
	 * 公司名称
	 */
	private String company02;

	/**
	 * 公司名称2
	 */
	private String company03;

	/**
	 * 公司法人
	 */
	private String company04;

	/**
	 * 公司电话
	 */
	private String company05;

	/**
	 * 公司传真
	 */
	private String company06;

	/**
	 * 公司邮箱
	 */
	private String company07;

	/**
	 * 公司地址
	 */
	private String company08;

	/**
	 * 归属法人编号
	 */
	private String company09;

	/**
	 * nouse
	 */
	private String company60;

	/**
	 * nouse
	 */
	private String company61;

	/**
	 * nouse
	 */
	private String company62;

	/**
	 * nouse
	 */
	private String company63;

	/**
	 * nouse
	 */
	private String company64;

	/**
	 * nouse
	 */
	private String company65;

	/**
	 * nouse
	 */
	private String company66;

	/**
	 * nouse
	 */
	private BigDecimal company67;

	/**
	 * nouse
	 */
	private BigDecimal company68;

	/**
	 * nouse
	 */
	private BigDecimal company69;

	/**
	 * nouse
	 */
	private BigDecimal company70;

	/**
	 * nouse
	 */
	private BigDecimal company71;

	/**
	 * nouse
	 */
	private BigDecimal company72;

	/**
	 * nouse
	 */
	private BigDecimal company73;

	/**
	 * nouse
	 */
	private BigDecimal company74;

	/**
	 * nouse
	 */
	private String company75;

	/**
	 * nouse
	 */
	private String company76;

	/**
	 * nouse
	 */
	private String company77;

	/**
	 * nouse
	 */
	private String company78;

	/**
	 * nouse
	 */
	private String company79;

	/**
	 * nouse
	 */
	private String company80;

	/**
	 * nouse
	 */
	private String company81;

	/**
	 * nouse
	 */
	private String company82;

	/**
	 * nouse
	 */
	private String company83;

	/**
	 * nouse
	 */
	private String company84;

	/**
	 * nouse
	 */
	private Date company85;

	/**
	 * nouse
	 */
	private Date company86;

	/**
	 * nouse
	 */
	private Date company87;

	/**
	 * nouse
	 */
	private Date company88;

	/**
	 * nouse
	 */
	private Date company89;

	/**
	 * nouse
	 */
	private Date company90;

	/**
	 * 基础资料状况码
	 */
	private String companystatus;

	/**
	 * 细颗粒权限码
	 */
	private String companyauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String companycreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date companycred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String companymodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date companymodd;

	/**
	 * 法人
	 */
	private String companylegal;

	/**
	 * 公司
	 */
	private String companycompany;

	/**
	 * 国际化多语言1
	 */
	private String companylang01;

	/**
	 * 国际化多语言2
	 */
	private String companylang02;

	/**
	 * 国际化多语言3
	 */
	private String companylang03;

	/**
	 * 国际化多语言4
	 */
	private String companylang04;

	/**
	 * 国际化多语言5
	 */
	private String companylang05;

	/**
	 * 国际化多语言6
	 */
	private String companylang06;

	/**
	 * 国际化多语言7
	 */
	private String companylang07;

	/**
	 * 国际化多语言8
	 */
	private String companylang08;

	/**
	 * 国际化多语言9
	 */
	private String companylang09;

	/**
	 * 国际化多语言10
	 */
	private String companylang10;

	/**
	 * 国际化多语言11
	 */
	private String companylang11;

	/**
	 * 国际化多语言12
	 */
	private String companylang12;

	/**
	 * 国际化多语言13
	 */
	private String companylang13;

	/**
	 * 国际化多语言14
	 */
	private String companylang14;

	/**
	 * 国际化多语言15
	 */
	private String companylang15;

	/**
	 * 国际化多语言16
	 */
	private String companylang16;

	/**
	 * 国际化多语言17
	 */
	private String companylang17;

	/**
	 * 国际化多语言18
	 */
	private String companylang18;

	/**
	 * 国际化多语言19
	 */
	private String companylang19;

	/**
	 * 国际化多语言20
	 */
	private String companylang20;

}
