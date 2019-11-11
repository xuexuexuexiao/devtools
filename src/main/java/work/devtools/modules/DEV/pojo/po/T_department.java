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
 * 部门表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_department")
public class T_department implements Serializable {

	/**
	 * 部门编号
	 */
	@Id
	private String department01;

	/**
	 * 部门名称
	 */
	private String department02;

	/**
	 * 部门名称2
	 */
	private String department03;

	/**
	 * 归属公司编号
	 */
	private String department04;

	/**
	 * nouse
	 */
	private String department60;

	/**
	 * nouse
	 */
	private String department61;

	/**
	 * nouse
	 */
	private String department62;

	/**
	 * nouse
	 */
	private String department63;

	/**
	 * nouse
	 */
	private String department64;

	/**
	 * nouse
	 */
	private String department65;

	/**
	 * nouse
	 */
	private String department66;

	/**
	 * nouse
	 */
	private BigDecimal department67;

	/**
	 * nouse
	 */
	private BigDecimal department68;

	/**
	 * nouse
	 */
	private BigDecimal department69;

	/**
	 * nouse
	 */
	private BigDecimal department70;

	/**
	 * nouse
	 */
	private BigDecimal department71;

	/**
	 * nouse
	 */
	private BigDecimal department72;

	/**
	 * nouse
	 */
	private BigDecimal department73;

	/**
	 * nouse
	 */
	private BigDecimal department74;

	/**
	 * nouse
	 */
	private String department75;

	/**
	 * nouse
	 */
	private String department76;

	/**
	 * nouse
	 */
	private String department77;

	/**
	 * nouse
	 */
	private String department78;

	/**
	 * nouse
	 */
	private String department79;

	/**
	 * nouse
	 */
	private String department80;

	/**
	 * nouse
	 */
	private String department81;

	/**
	 * nouse
	 */
	private String department82;

	/**
	 * nouse
	 */
	private String department83;

	/**
	 * nouse
	 */
	private String department84;

	/**
	 * nouse
	 */
	private Date department85;

	/**
	 * nouse
	 */
	private Date department86;

	/**
	 * nouse
	 */
	private Date department87;

	/**
	 * nouse
	 */
	private Date department88;

	/**
	 * nouse
	 */
	private Date department89;

	/**
	 * nouse
	 */
	private Date department90;

	/**
	 * 基础资料状况码
	 */
	private String departmentstatus;

	/**
	 * 细颗粒权限码
	 */
	private String departmentauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String departmentcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date departmentcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String departmentmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date departmentmodd;

	/**
	 * 法人
	 */
	private String departmentlegal;

	/**
	 * 公司
	 */
	private String departmentcompany;

	/**
	 * 国际化多语言1
	 */
	private String departmentlang01;

	/**
	 * 国际化多语言2
	 */
	private String departmentlang02;

	/**
	 * 国际化多语言3
	 */
	private String departmentlang03;

	/**
	 * 国际化多语言4
	 */
	private String departmentlang04;

	/**
	 * 国际化多语言5
	 */
	private String departmentlang05;

	/**
	 * 国际化多语言6
	 */
	private String departmentlang06;

	/**
	 * 国际化多语言7
	 */
	private String departmentlang07;

	/**
	 * 国际化多语言8
	 */
	private String departmentlang08;

	/**
	 * 国际化多语言9
	 */
	private String departmentlang09;

	/**
	 * 国际化多语言10
	 */
	private String departmentlang10;

	/**
	 * 国际化多语言11
	 */
	private String departmentlang11;

	/**
	 * 国际化多语言12
	 */
	private String departmentlang12;

	/**
	 * 国际化多语言13
	 */
	private String departmentlang13;

	/**
	 * 国际化多语言14
	 */
	private String departmentlang14;

	/**
	 * 国际化多语言15
	 */
	private String departmentlang15;

	/**
	 * 国际化多语言16
	 */
	private String departmentlang16;

	/**
	 * 国际化多语言17
	 */
	private String departmentlang17;

	/**
	 * 国际化多语言18
	 */
	private String departmentlang18;

	/**
	 * 国际化多语言19
	 */
	private String departmentlang19;

	/**
	 * 国际化多语言20
	 */
	private String departmentlang20;

}
