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
 * 业务组资料表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_group")
public class T_group implements Serializable {

	/**
	 * 业务组编号
	 */
	@Id
	private String group01;

	/**
	 * 业务组名称
	 */
	private String group02;

	/**
	 * 业务组名称2
	 */
	private String group03;

	/**
	 * 归属部门编号
	 */
	private String group04;

	/**
	 * nouse
	 */
	private String group60;

	/**
	 * nouse
	 */
	private String group61;

	/**
	 * nouse
	 */
	private String group62;

	/**
	 * nouse
	 */
	private String group63;

	/**
	 * nouse
	 */
	private String group64;

	/**
	 * nouse
	 */
	private String group65;

	/**
	 * nouse
	 */
	private String group66;

	/**
	 * nouse
	 */
	private BigDecimal group67;

	/**
	 * nouse
	 */
	private BigDecimal group68;

	/**
	 * nouse
	 */
	private BigDecimal group69;

	/**
	 * nouse
	 */
	private BigDecimal group70;

	/**
	 * nouse
	 */
	private BigDecimal group71;

	/**
	 * nouse
	 */
	private BigDecimal group72;

	/**
	 * nouse
	 */
	private BigDecimal group73;

	/**
	 * nouse
	 */
	private BigDecimal group74;

	/**
	 * nouse
	 */
	private String group75;

	/**
	 * nouse
	 */
	private String group76;

	/**
	 * nouse
	 */
	private String group77;

	/**
	 * nouse
	 */
	private String group78;

	/**
	 * nouse
	 */
	private String group79;

	/**
	 * nouse
	 */
	private String group80;

	/**
	 * nouse
	 */
	private String group81;

	/**
	 * nouse
	 */
	private String group82;

	/**
	 * nouse
	 */
	private String group83;

	/**
	 * nouse
	 */
	private String group84;

	/**
	 * nouse
	 */
	private Date group85;

	/**
	 * nouse
	 */
	private Date group86;

	/**
	 * nouse
	 */
	private Date group87;

	/**
	 * nouse
	 */
	private Date group88;

	/**
	 * nouse
	 */
	private Date group89;

	/**
	 * nouse
	 */
	private Date group90;

	/**
	 * 基础资料状况码
	 */
	private String groupstatus;

	/**
	 * 细颗粒权限码
	 */
	private String groupauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String groupcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date groupcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String groupmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date groupmodd;

	/**
	 * 法人
	 */
	private String grouplegal;

	/**
	 * 公司
	 */
	private String groupcompany;

	/**
	 * 国际化多语言1
	 */
	private String grouplang01;

	/**
	 * 国际化多语言2
	 */
	private String grouplang02;

	/**
	 * 国际化多语言3
	 */
	private String grouplang03;

	/**
	 * 国际化多语言4
	 */
	private String grouplang04;

	/**
	 * 国际化多语言5
	 */
	private String grouplang05;

	/**
	 * 国际化多语言6
	 */
	private String grouplang06;

	/**
	 * 国际化多语言7
	 */
	private String grouplang07;

	/**
	 * 国际化多语言8
	 */
	private String grouplang08;

	/**
	 * 国际化多语言9
	 */
	private String grouplang09;

	/**
	 * 国际化多语言10
	 */
	private String grouplang10;

	/**
	 * 国际化多语言11
	 */
	private String grouplang11;

	/**
	 * 国际化多语言12
	 */
	private String grouplang12;

	/**
	 * 国际化多语言13
	 */
	private String grouplang13;

	/**
	 * 国际化多语言14
	 */
	private String grouplang14;

	/**
	 * 国际化多语言15
	 */
	private String grouplang15;

	/**
	 * 国际化多语言16
	 */
	private String grouplang16;

	/**
	 * 国际化多语言17
	 */
	private String grouplang17;

	/**
	 * 国际化多语言18
	 */
	private String grouplang18;

	/**
	 * 国际化多语言19
	 */
	private String grouplang19;

	/**
	 * 国际化多语言20
	 */
	private String grouplang20;

}
