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
 * 法人表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_legal")
public class T_legal implements Serializable {

	/**
	 * 法人编号
	 */
	@Id
	private String legal01;

	/**
	 * 法人名称
	 */
	private String legal02;

	/**
	 * 法人名称2
	 */
	private String legal03;

	/**
	 * nouse
	 */
	private String legal60;

	/**
	 * nouse
	 */
	private String legal61;

	/**
	 * nouse
	 */
	private String legal62;

	/**
	 * nouse
	 */
	private String legal63;

	/**
	 * nouse
	 */
	private String legal64;

	/**
	 * nouse
	 */
	private String legal65;

	/**
	 * nouse
	 */
	private String legal66;

	/**
	 * nouse
	 */
	private BigDecimal legal67;

	/**
	 * nouse
	 */
	private BigDecimal legal68;

	/**
	 * nouse
	 */
	private BigDecimal legal69;

	/**
	 * nouse
	 */
	private BigDecimal legal70;

	/**
	 * nouse
	 */
	private BigDecimal legal71;

	/**
	 * nouse
	 */
	private BigDecimal legal72;

	/**
	 * nouse
	 */
	private BigDecimal legal73;

	/**
	 * nouse
	 */
	private BigDecimal legal74;

	/**
	 * nouse
	 */
	private String legal75;

	/**
	 * nouse
	 */
	private String legal76;

	/**
	 * nouse
	 */
	private String legal77;

	/**
	 * nouse
	 */
	private String legal78;

	/**
	 * nouse
	 */
	private String legal79;

	/**
	 * nouse
	 */
	private String legal80;

	/**
	 * nouse
	 */
	private String legal81;

	/**
	 * nouse
	 */
	private String legal82;

	/**
	 * nouse
	 */
	private String legal83;

	/**
	 * nouse
	 */
	private String legal84;

	/**
	 * nouse
	 */
	private Date legal85;

	/**
	 * nouse
	 */
	private Date legal86;

	/**
	 * nouse
	 */
	private Date legal87;

	/**
	 * nouse
	 */
	private Date legal88;

	/**
	 * nouse
	 */
	private Date legal89;

	/**
	 * nouse
	 */
	private Date legal90;

	/**
	 * 基础资料状况码
	 */
	private String legalstatus;

	/**
	 * 细颗粒权限码
	 */
	private String legalauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String legalcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date legalcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String legalmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date legalmodd;

	/**
	 * 法人
	 */
	private String legallegal;

	/**
	 * 公司
	 */
	private String legalcompany;

	/**
	 * 国际化多语言1
	 */
	private String legallang01;

	/**
	 * 国际化多语言2
	 */
	private String legallang02;

	/**
	 * 国际化多语言3
	 */
	private String legallang03;

	/**
	 * 国际化多语言4
	 */
	private String legallang04;

	/**
	 * 国际化多语言5
	 */
	private String legallang05;

	/**
	 * 国际化多语言6
	 */
	private String legallang06;

	/**
	 * 国际化多语言7
	 */
	private String legallang07;

	/**
	 * 国际化多语言8
	 */
	private String legallang08;

	/**
	 * 国际化多语言9
	 */
	private String legallang09;

	/**
	 * 国际化多语言10
	 */
	private String legallang10;

	/**
	 * 国际化多语言11
	 */
	private String legallang11;

	/**
	 * 国际化多语言12
	 */
	private String legallang12;

	/**
	 * 国际化多语言13
	 */
	private String legallang13;

	/**
	 * 国际化多语言14
	 */
	private String legallang14;

	/**
	 * 国际化多语言15
	 */
	private String legallang15;

	/**
	 * 国际化多语言16
	 */
	private String legallang16;

	/**
	 * 国际化多语言17
	 */
	private String legallang17;

	/**
	 * 国际化多语言18
	 */
	private String legallang18;

	/**
	 * 国际化多语言19
	 */
	private String legallang19;

	/**
	 * 国际化多语言20
	 */
	private String legallang20;

}
