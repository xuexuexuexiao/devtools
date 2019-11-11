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
 * 用户表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_user")
public class T_user implements Serializable {


	/**
	 * 用户编号
	 */
	@Id
	private String user01;

	/**
	 * 所属员工编号
	 */
	private String user02;

	/**
	 * 密码
	 */
	private String user03;

	/**
	 * 账号有效期
	 */
	private Date user04;

	/**
	 * 锁定账号否
	 */
	private String user05;

	/**
	 * 可试误次数
	 */
	private Integer user06;

	/**
	 * 已试误次数
	 */
	private Integer user07;

	/**
	 * 账户有效否
	 */
	private String user08;

	/**
	 * 强制修改密码否
	 */
	private String user09;

	/**
	 * 邮箱
	 */
	private String user10;

	/**
	 * 默认国际化语言
	 */
	private String user11;

	/**
	 * nouse
	 */
	private String user60;

	/**
	 * nouse
	 */
	private String user61;

	/**
	 * nouse
	 */
	private String user62;

	/**
	 * nouse
	 */
	private String user63;

	/**
	 * nouse
	 */
	private String user64;

	/**
	 * nouse
	 */
	private String user65;

	/**
	 * nouse
	 */
	private String user66;

	/**
	 * nouse
	 */
	private BigDecimal user67;

	/**
	 * nouse
	 */
	private BigDecimal user68;

	/**
	 * nouse
	 */
	private BigDecimal user69;

	/**
	 * nouse
	 */
	private BigDecimal user70;

	/**
	 * nouse
	 */
	private BigDecimal user71;

	/**
	 * nouse
	 */
	private BigDecimal user72;

	/**
	 * nouse
	 */
	private BigDecimal user73;

	/**
	 * nouse
	 */
	private BigDecimal user74;

	/**
	 * nouse
	 */
	private String user75;

	/**
	 * nouse
	 */
	private String user76;

	/**
	 * nouse
	 */
	private String user77;

	/**
	 * nouse
	 */
	private String user78;

	/**
	 * nouse
	 */
	private String user79;

	/**
	 * nouse
	 */
	private String user80;

	/**
	 * nouse
	 */
	private String user81;

	/**
	 * nouse
	 */
	private String user82;

	/**
	 * nouse
	 */
	private String user83;

	/**
	 * nouse
	 */
	private String user84;

	/**
	 * nouse
	 */
	private Date user85;

	/**
	 * nouse
	 */
	private Date user86;

	/**
	 * nouse
	 */
	private Date user87;

	/**
	 * nouse
	 */
	private Date user88;

	/**
	 * nouse
	 */
	private Date user89;

	/**
	 * nouse
	 */
	private Date user90;

	/**
	 * 基础资料状况码
	 */
	private String userstatus;

	/**
	 * 细颗粒权限码
	 */
	private String userauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String usercreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date usercred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String usermodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date usermodd;

	/**
	 * 法人
	 */
	private String userlegal;

	/**
	 * 公司
	 */
	private String usercompany;

	/**
	 * 国际化多语言1
	 */
	private String userlang01;

	/**
	 * 国际化多语言2
	 */
	private String userlang02;

	/**
	 * 国际化多语言3
	 */
	private String userlang03;

	/**
	 * 国际化多语言4
	 */
	private String userlang04;

	/**
	 * 国际化多语言5
	 */
	private String userlang05;

	/**
	 * 国际化多语言6
	 */
	private String userlang06;

	/**
	 * 国际化多语言7
	 */
	private String userlang07;

	/**
	 * 国际化多语言8
	 */
	private String userlang08;

	/**
	 * 国际化多语言9
	 */
	private String userlang09;

	/**
	 * 国际化多语言10
	 */
	private String userlang10;

	/**
	 * 国际化多语言11
	 */
	private String userlang11;

	/**
	 * 国际化多语言12
	 */
	private String userlang12;

	/**
	 * 国际化多语言13
	 */
	private String userlang13;

	/**
	 * 国际化多语言14
	 */
	private String userlang14;

	/**
	 * 国际化多语言15
	 */
	private String userlang15;

	/**
	 * 国际化多语言16
	 */
	private String userlang16;

	/**
	 * 国际化多语言17
	 */
	private String userlang17;

	/**
	 * 国际化多语言18
	 */
	private String userlang18;

	/**
	 * 国际化多语言19
	 */
	private String userlang19;

	/**
	 * 国际化多语言20
	 */
	private String userlang20;

}
