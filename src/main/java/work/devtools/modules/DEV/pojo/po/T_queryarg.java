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
@Table(name = "t_queryarg")
@EntityListeners(AuditingEntityListener.class)
public class T_queryarg  implements Serializable {

	/**
	 * 动态查询编号
	 */
	@Id
	private String queryarg01;

	/**
	 * 测试参数
	 */
	private String queryarg02;

	/**
	 * 测试内容
	 */
	private String queryarg03;

	/**
	 * nouse
	 */
	private String queryarg60;

	/**
	 * nouse
	 */
	private String queryarg61;

	/**
	 * nouse
	 */
	private String queryarg62;

	/**
	 * nouse
	 */
	private String queryarg63;

	/**
	 * nouse
	 */
	private String queryarg64;

	/**
	 * nouse
	 */
	private String queryarg65;

	/**
	 * nouse
	 */
	private String queryarg66;

	/**
	 * nouse
	 */
	private BigDecimal queryarg67;

	/**
	 * nouse
	 */
	private BigDecimal queryarg68;

	/**
	 * nouse
	 */
	private BigDecimal queryarg69;

	/**
	 * nouse
	 */
	private BigDecimal queryarg70;

	/**
	 * nouse
	 */
	private BigDecimal queryarg71;

	/**
	 * nouse
	 */
	private BigDecimal queryarg72;

	/**
	 * nouse
	 */
	private BigDecimal queryarg73;

	/**
	 * nouse
	 */
	private BigDecimal queryarg74;

	/**
	 * nouse
	 */
	private String queryarg75;

	/**
	 * nouse
	 */
	private String queryarg76;

	/**
	 * nouse
	 */
	private String queryarg77;

	/**
	 * nouse
	 */
	private String queryarg78;

	/**
	 * nouse
	 */
	private String queryarg79;

	/**
	 * nouse
	 */
	private String queryarg80;

	/**
	 * nouse
	 */
	private String queryarg81;

	/**
	 * nouse
	 */
	private String queryarg82;

	/**
	 * nouse
	 */
	private String queryarg83;

	/**
	 * nouse
	 */
	private String queryarg84;

	/**
	 * nouse
	 */
	private Date queryarg85;

	/**
	 * nouse
	 */
	private Date queryarg86;

	/**
	 * nouse
	 */
	private Date queryarg87;

	/**
	 * nouse
	 */
	private Date queryarg88;

	/**
	 * nouse
	 */
	private Date queryarg89;

	/**
	 * nouse
	 */
	private Date queryarg90;

	/**
	 * 基础资料状况码
	 */
	private String queryargstatus;

	/**
	 * 细颗粒权限码
	 */
	private String queryargauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String queryargcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date queryargcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String queryargmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date queryargmodd;

	/**
	 * 法人
	 */
	private String queryarglegal;

	/**
	 * 公司
	 */
	private String queryargcompany;

	/**
	 * 国际化多语言1
	 */
	private String queryarglang01;

	/**
	 * 国际化多语言2
	 */
	private String queryarglang02;

	/**
	 * 国际化多语言3
	 */
	private String queryarglang03;

	/**
	 * 国际化多语言4
	 */
	private String queryarglang04;

	/**
	 * 国际化多语言5
	 */
	private String queryarglang05;

	/**
	 * 国际化多语言6
	 */
	private String queryarglang06;

	/**
	 * 国际化多语言7
	 */
	private String queryarglang07;

	/**
	 * 国际化多语言8
	 */
	private String queryarglang08;

	/**
	 * 国际化多语言9
	 */
	private String queryarglang09;

	/**
	 * 国际化多语言10
	 */
	private String queryarglang10;

	/**
	 * 国际化多语言11
	 */
	private String queryarglang11;

	/**
	 * 国际化多语言12
	 */
	private String queryarglang12;

	/**
	 * 国际化多语言13
	 */
	private String queryarglang13;

	/**
	 * 国际化多语言14
	 */
	private String queryarglang14;

	/**
	 * 国际化多语言15
	 */
	private String queryarglang15;

	/**
	 * 国际化多语言16
	 */
	private String queryarglang16;

	/**
	 * 国际化多语言17
	 */
	private String queryarglang17;

	/**
	 * 国际化多语言18
	 */
	private String queryarglang18;

	/**
	 * 国际化多语言19
	 */
	private String queryarglang19;

	/**
	 * 国际化多语言20
	 */
	private String queryarglang20;

}
