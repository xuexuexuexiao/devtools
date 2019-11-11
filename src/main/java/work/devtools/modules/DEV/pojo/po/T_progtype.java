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
 * 程序类型
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_progtype")
public class T_progtype implements Serializable {

	/**
	 * 程序类型
	 */
	@Id
	private String progtype01;

	/**
	 * 程序类型名称
	 */
	private String progtype02;

	/**
	 * 程序类型名称2
	 */
	private String progtype03;

	/**
	 * nouse
	 */
	private String progtype60;

	/**
	 * nouse
	 */
	private String progtype61;

	/**
	 * nouse
	 */
	private String progtype62;

	/**
	 * nouse
	 */
	private String progtype63;

	/**
	 * nouse
	 */
	private String progtype64;

	/**
	 * nouse
	 */
	private String progtype65;

	/**
	 * nouse
	 */
	private String progtype66;

	/**
	 * nouse
	 */
	private BigDecimal progtype67;

	/**
	 * nouse
	 */
	private BigDecimal progtype68;

	/**
	 * nouse
	 */
	private BigDecimal progtype69;

	/**
	 * nouse
	 */
	private BigDecimal progtype70;

	/**
	 * nouse
	 */
	private BigDecimal progtype71;

	/**
	 * nouse
	 */
	private BigDecimal progtype72;

	/**
	 * nouse
	 */
	private BigDecimal progtype73;

	/**
	 * nouse
	 */
	private BigDecimal progtype74;

	/**
	 * nouse
	 */
	private String progtype75;

	/**
	 * nouse
	 */
	private String progtype76;

	/**
	 * nouse
	 */
	private String progtype77;

	/**
	 * nouse
	 */
	private String progtype78;

	/**
	 * nouse
	 */
	private String progtype79;

	/**
	 * nouse
	 */
	private String progtype80;

	/**
	 * nouse
	 */
	private String progtype81;

	/**
	 * nouse
	 */
	private String progtype82;

	/**
	 * nouse
	 */
	private String progtype83;

	/**
	 * nouse
	 */
	private String progtype84;

	/**
	 * nouse
	 */
	private Date progtype85;

	/**
	 * nouse
	 */
	private Date progtype86;

	/**
	 * nouse
	 */
	private Date progtype87;

	/**
	 * nouse
	 */
	private Date progtype88;

	/**
	 * nouse
	 */
	private Date progtype89;

	/**
	 * nouse
	 */
	private Date progtype90;

	/**
	 * 基础资料状况码
	 */
	private String progtypestatus;

	/**
	 * 细颗粒权限码
	 */
	private String progtypeauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progtypecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progtypecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progtypemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progtypemodd;

	/**
	 * 法人
	 */
	private String progtypelegal;

	/**
	 * 公司
	 */
	private String progtypecompany;

	/**
	 * 国际化多语言1
	 */
	private String progtypelang01;

	/**
	 * 国际化多语言2
	 */
	private String progtypelang02;

	/**
	 * 国际化多语言3
	 */
	private String progtypelang03;

	/**
	 * 国际化多语言4
	 */
	private String progtypelang04;

	/**
	 * 国际化多语言5
	 */
	private String progtypelang05;

	/**
	 * 国际化多语言6
	 */
	private String progtypelang06;

	/**
	 * 国际化多语言7
	 */
	private String progtypelang07;

	/**
	 * 国际化多语言8
	 */
	private String progtypelang08;

	/**
	 * 国际化多语言9
	 */
	private String progtypelang09;

	/**
	 * 国际化多语言10
	 */
	private String progtypelang10;

	/**
	 * 国际化多语言11
	 */
	private String progtypelang11;

	/**
	 * 国际化多语言12
	 */
	private String progtypelang12;

	/**
	 * 国际化多语言13
	 */
	private String progtypelang13;

	/**
	 * 国际化多语言14
	 */
	private String progtypelang14;

	/**
	 * 国际化多语言15
	 */
	private String progtypelang15;

	/**
	 * 国际化多语言16
	 */
	private String progtypelang16;

	/**
	 * 国际化多语言17
	 */
	private String progtypelang17;

	/**
	 * 国际化多语言18
	 */
	private String progtypelang18;

	/**
	 * 国际化多语言19
	 */
	private String progtypelang19;

	/**
	 * 国际化多语言20
	 */
	private String progtypelang20;

}
