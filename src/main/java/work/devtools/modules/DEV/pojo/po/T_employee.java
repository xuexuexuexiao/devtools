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
 * 员工表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_employee")
public class T_employee implements Serializable {

	/**
	 * 员工编号
	 */
	@Id
	private String employee01;

	/**
	 * 员工名称
	 */
	private String employee02;

	/**
	 * 员工名称2
	 */
	private String employee03;

	/**
	 * 归属业务组编号
	 */
	private String employee04;

	/**
	 * 在职状态
	 */
	private String employee05;

	/**
	 * nouse
	 */
	private String employee60;

	/**
	 * nouse
	 */
	private String employee61;

	/**
	 * nouse
	 */
	private String employee62;

	/**
	 * nouse
	 */
	private String employee63;

	/**
	 * nouse
	 */
	private String employee64;

	/**
	 * nouse
	 */
	private String employee65;

	/**
	 * nouse
	 */
	private String employee66;

	/**
	 * nouse
	 */
	private BigDecimal employee67;

	/**
	 * nouse
	 */
	private BigDecimal employee68;

	/**
	 * nouse
	 */
	private BigDecimal employee69;

	/**
	 * nouse
	 */
	private BigDecimal employee70;

	/**
	 * nouse
	 */
	private BigDecimal employee71;

	/**
	 * nouse
	 */
	private BigDecimal employee72;

	/**
	 * nouse
	 */
	private BigDecimal employee73;

	/**
	 * nouse
	 */
	private BigDecimal employee74;

	/**
	 * nouse
	 */
	private String employee75;

	/**
	 * nouse
	 */
	private String employee76;

	/**
	 * nouse
	 */
	private String employee77;

	/**
	 * nouse
	 */
	private String employee78;

	/**
	 * nouse
	 */
	private String employee79;

	/**
	 * nouse
	 */
	private String employee80;

	/**
	 * nouse
	 */
	private String employee81;

	/**
	 * nouse
	 */
	private String employee82;

	/**
	 * nouse
	 */
	private String employee83;

	/**
	 * nouse
	 */
	private String employee84;

	/**
	 * nouse
	 */
	private Date employee85;

	/**
	 * nouse
	 */
	private Date employee86;

	/**
	 * nouse
	 */
	private Date employee87;

	/**
	 * nouse
	 */
	private Date employee88;

	/**
	 * nouse
	 */
	private Date employee89;

	/**
	 * nouse
	 */
	private Date employee90;

	/**
	 * 基础资料状况码
	 */
	private String employeestatus;

	/**
	 * 细颗粒权限码
	 */
	private String employeeauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String employeecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date employeecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String employeemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date employeemodd;

	/**
	 * 法人
	 */
	private String employeelegal;

	/**
	 * 公司
	 */
	private String employeecompany;

	/**
	 * 国际化多语言1
	 */
	private String employeelang01;

	/**
	 * 国际化多语言2
	 */
	private String employeelang02;

	/**
	 * 国际化多语言3
	 */
	private String employeelang03;

	/**
	 * 国际化多语言4
	 */
	private String employeelang04;

	/**
	 * 国际化多语言5
	 */
	private String employeelang05;

	/**
	 * 国际化多语言6
	 */
	private String employeelang06;

	/**
	 * 国际化多语言7
	 */
	private String employeelang07;

	/**
	 * 国际化多语言8
	 */
	private String employeelang08;

	/**
	 * 国际化多语言9
	 */
	private String employeelang09;

	/**
	 * 国际化多语言10
	 */
	private String employeelang10;

	/**
	 * 国际化多语言11
	 */
	private String employeelang11;

	/**
	 * 国际化多语言12
	 */
	private String employeelang12;

	/**
	 * 国际化多语言13
	 */
	private String employeelang13;

	/**
	 * 国际化多语言14
	 */
	private String employeelang14;

	/**
	 * 国际化多语言15
	 */
	private String employeelang15;

	/**
	 * 国际化多语言16
	 */
	private String employeelang16;

	/**
	 * 国际化多语言17
	 */
	private String employeelang17;

	/**
	 * 国际化多语言18
	 */
	private String employeelang18;

	/**
	 * 国际化多语言19
	 */
	private String employeelang19;

	/**
	 * 国际化多语言20
	 */
	private String employeelang20;

}
