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
 * 多语言表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_lang")
public class T_lang implements Serializable {

	/**
	 * 语言编号
	 */
	@Id
	private String lang01;

	/**
	 * 语言名称
	 */
	private String lang02;

	/**
	 * nouse
	 */
	private String lang60;

	/**
	 * nouse
	 */
	private String lang61;

	/**
	 * nouse
	 */
	private String lang62;

	/**
	 * nouse
	 */
	private String lang63;

	/**
	 * nouse
	 */
	private String lang64;

	/**
	 * nouse
	 */
	private String lang65;

	/**
	 * nouse
	 */
	private String lang66;

	/**
	 * nouse
	 */
	private BigDecimal lang67;

	/**
	 * nouse
	 */
	private BigDecimal lang68;

	/**
	 * nouse
	 */
	private BigDecimal lang69;

	/**
	 * nouse
	 */
	private BigDecimal lang70;

	/**
	 * nouse
	 */
	private BigDecimal lang71;

	/**
	 * nouse
	 */
	private BigDecimal lang72;

	/**
	 * nouse
	 */
	private BigDecimal lang73;

	/**
	 * nouse
	 */
	private BigDecimal lang74;

	/**
	 * nouse
	 */
	private String lang75;

	/**
	 * nouse
	 */
	private String lang76;

	/**
	 * nouse
	 */
	private String lang77;

	/**
	 * nouse
	 */
	private String lang78;

	/**
	 * nouse
	 */
	private String lang79;

	/**
	 * nouse
	 */
	private String lang80;

	/**
	 * nouse
	 */
	private String lang81;

	/**
	 * nouse
	 */
	private String lang82;

	/**
	 * nouse
	 */
	private String lang83;

	/**
	 * nouse
	 */
	private String lang84;

	/**
	 * nouse
	 */
	private Date lang85;

	/**
	 * nouse
	 */
	private Date lang86;

	/**
	 * nouse
	 */
	private Date lang87;

	/**
	 * nouse
	 */
	private Date lang88;

	/**
	 * nouse
	 */
	private Date lang89;

	/**
	 * nouse
	 */
	private Date lang90;

	/**
	 * 基础资料状况码
	 */
	private String langstatus;

	/**
	 * 细颗粒权限码
	 */
	private String langauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String langcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date langcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String langmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date langmodd;

	/**
	 * 法人
	 */
	private String langlegal;

	/**
	 * 公司
	 */
	private String langcompany;

	/**
	 * 国际化多语言1
	 */
	private String langlang01;

	/**
	 * 国际化多语言2
	 */
	private String langlang02;

	/**
	 * 国际化多语言3
	 */
	private String langlang03;

	/**
	 * 国际化多语言4
	 */
	private String langlang04;

	/**
	 * 国际化多语言5
	 */
	private String langlang05;

	/**
	 * 国际化多语言6
	 */
	private String langlang06;

	/**
	 * 国际化多语言7
	 */
	private String langlang07;

	/**
	 * 国际化多语言8
	 */
	private String langlang08;

	/**
	 * 国际化多语言9
	 */
	private String langlang09;

	/**
	 * 国际化多语言10
	 */
	private String langlang10;

	/**
	 * 国际化多语言11
	 */
	private String langlang11;

	/**
	 * 国际化多语言12
	 */
	private String langlang12;

	/**
	 * 国际化多语言13
	 */
	private String langlang13;

	/**
	 * 国际化多语言14
	 */
	private String langlang14;

	/**
	 * 国际化多语言15
	 */
	private String langlang15;

	/**
	 * 国际化多语言16
	 */
	private String langlang16;

	/**
	 * 国际化多语言17
	 */
	private String langlang17;

	/**
	 * 国际化多语言18
	 */
	private String langlang18;

	/**
	 * 国际化多语言19
	 */
	private String langlang19;

	/**
	 * 国际化多语言20
	 */
	private String langlang20;

}
