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
 * 错误信息表
 *
<<<<<<< HEAD
 * @author huxxiaoxue
 * @date 2019-04-15
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_error")
@IdClass(T_errorPK.class)
public class T_error implements Serializable {

	/**
	 * 信息编号
	 */
	@Id
	private String error01;

	/**
	 * 国际化语言编号
	 */
	@Id
	private String error02;

	/**
	 * 信息内容
	 */
	private String error03;

	/**
	 * 强制弹窗否
	 */
	private String error04;

	/**
	 * nouse
	 */
	private String error60;

	/**
	 * nouse
	 */
	private String error61;

	/**
	 * nouse
	 */
	private String error62;

	/**
	 * nouse
	 */
	private String error63;

	/**
	 * nouse
	 */
	private String error64;

	/**
	 * nouse
	 */
	private String error65;

	/**
	 * nouse
	 */
	private String error66;

	/**
	 * nouse
	 */
	private BigDecimal error67;

	/**
	 * nouse
	 */
	private BigDecimal error68;

	/**
	 * nouse
	 */
	private BigDecimal error69;

	/**
	 * nouse
	 */
	private BigDecimal error70;

	/**
	 * nouse
	 */
	private BigDecimal error71;

	/**
	 * nouse
	 */
	private BigDecimal error72;

	/**
	 * nouse
	 */
	private BigDecimal error73;

	/**
	 * nouse
	 */
	private BigDecimal error74;

	/**
	 * nouse
	 */
	private String error75;

	/**
	 * nouse
	 */
	private String error76;

	/**
	 * nouse
	 */
	private String error77;

	/**
	 * nouse
	 */
	private String error78;

	/**
	 * nouse
	 */
	private String error79;

	/**
	 * nouse
	 */
	private String error80;

	/**
	 * nouse
	 */
	private String error81;

	/**
	 * nouse
	 */
	private String error82;

	/**
	 * nouse
	 */
	private String error83;

	/**
	 * nouse
	 */
	private String error84;

	/**
	 * nouse
	 */
	private Date error85;

	/**
	 * nouse
	 */
	private Date error86;

	/**
	 * nouse
	 */
	private Date error87;

	/**
	 * nouse
	 */
	private Date error88;

	/**
	 * nouse
	 */
	private Date error89;

	/**
	 * nouse
	 */
	private Date error90;

	/**
	 * 基础资料状况码
	 */
	private String errorstatus;

	/**
	 * 细颗粒权限码
	 */
	private String errorauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String errorcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date errorcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String errormodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date errormodd;

	/**
	 * 法人
	 */
	private String errorlegal;

	/**
	 * 公司
	 */
	private String errorcompany;

	/**
	 * 国际化多语言1
	 */
	private String errorlang01;

	/**
	 * 国际化多语言2
	 */
	private String errorlang02;

	/**
	 * 国际化多语言3
	 */
	private String errorlang03;

	/**
	 * 国际化多语言4
	 */
	private String errorlang04;

	/**
	 * 国际化多语言5
	 */
	private String errorlang05;

	/**
	 * 国际化多语言6
	 */
	private String errorlang06;

	/**
	 * 国际化多语言7
	 */
	private String errorlang07;

	/**
	 * 国际化多语言8
	 */
	private String errorlang08;

	/**
	 * 国际化多语言9
	 */
	private String errorlang09;

	/**
	 * 国际化多语言10
	 */
	private String errorlang10;

	/**
	 * 国际化多语言11
	 */
	private String errorlang11;

	/**
	 * 国际化多语言12
	 */
	private String errorlang12;

	/**
	 * 国际化多语言13
	 */
	private String errorlang13;

	/**
	 * 国际化多语言14
	 */
	private String errorlang14;

	/**
	 * 国际化多语言15
	 */
	private String errorlang15;

	/**
	 * 国际化多语言16
	 */
	private String errorlang16;

	/**
	 * 国际化多语言17
	 */
	private String errorlang17;

	/**
	 * 国际化多语言18
	 */
	private String errorlang18;

	/**
	 * 国际化多语言19
	 */
	private String errorlang19;

	/**
	 * 国际化多语言20
	 */
	private String errorlang20;

}
