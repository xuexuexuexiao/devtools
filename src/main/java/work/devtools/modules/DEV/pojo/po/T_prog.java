package work.devtools.modules.DEV.pojo.po;


import lombok.Data;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author xxx
 * @date 2019-04-11
 */
@Entity
@Data
@Table(name = "t_prog")
@EntityListeners(AuditingEntityListener.class)
public class T_prog  implements Serializable {

	/**
	 * ID
	 */
//	@Id
//	@GeneratedValue(generator = "snowFlakeId")
//	@GenericGenerator(name = "snowFlakeId", strategy = "work.devtools.common.utils.SnowflakeIdUtil")
//	private String progid;

	/**
	 * 程序编号
	 */
	@Id
	private String prog01;

	/**
	 * 归属模块
	 */
	private String prog02;

	/**
	 * 程序类型
	 */
	private String prog03;

	/**
	 * 程序模板
	 */
	private String prog04;

	/**
	 * no use
	 */
	private String prog05;

	/**
	 * Controller 类名称==模块源码路径+类名
	 */
	private String prog06;

	/**
	 * Service 类名称==模块源码路径+类名
	 */
	private String prog07;

	/**
	 * nouse
	 */
	private String prog60;

	/**
	 * nouse
	 */
	private String prog61;

	/**
	 * nouse
	 */
	private String prog62;

	/**
	 * nouse
	 */
	private String prog63;

	/**
	 * nouse
	 */
	private String prog64;

	/**
	 * nouse
	 */
	private String prog65;

	/**
	 * nouse
	 */
	private String prog66;

	/**
	 * nouse
	 */
	private BigDecimal prog67;

	/**
	 * nouse
	 */
	private BigDecimal prog68;

	/**
	 * nouse
	 */
	private BigDecimal prog69;

	/**
	 * nouse
	 */
	private BigDecimal prog70;

	/**
	 * nouse
	 */
	private BigDecimal prog71;

	/**
	 * nouse
	 */
	private BigDecimal prog72;

	/**
	 * nouse
	 */
	private BigDecimal prog73;

	/**
	 * nouse
	 */
	private BigDecimal prog74;

	/**
	 * nouse
	 */
	private String prog75;

	/**
	 * nouse
	 */
	private String prog76;

	/**
	 * nouse
	 */
	private String prog77;

	/**
	 * nouse
	 */
	private String prog78;

	/**
	 * nouse
	 */
	private String prog79;

	/**
	 * nouse
	 */
	private String prog80;

	/**
	 * nouse
	 */
	private String prog81;

	/**
	 * nouse
	 */
	private String prog82;

	/**
	 * nouse
	 */
	private String prog83;

	/**
	 * nouse
	 */
	private String prog84;

	/**
	 * nouse
	 */
	private Date prog85;

	/**
	 * nouse
	 */
	private Date prog86;

	/**
	 * nouse
	 */
	private Date prog87;

	/**
	 * nouse
	 */
	private Date prog88;

	/**
	 * nouse
	 */
	private Date prog89;

	/**
	 * nouse
	 */
	private Date prog90;

	/**
	 * 基础资料状况码
	 */
	private String progstatus;

	/**
	 * 细颗粒权限码
	 */
	private String progauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progmodd;

	/**
	 * 法人
	 */
	private String proglegal;

	/**
	 * 公司
	 */
	private String progcompany;

	/**
	 * 国际化多语言1
	 */
	private String proglang01;

	/**
	 * 国际化多语言2
	 */
	private String proglang02;

	/**
	 * 国际化多语言3
	 */
	private String proglang03;

	/**
	 * 国际化多语言4
	 */
	private String proglang04;

	/**
	 * 国际化多语言5
	 */
	private String proglang05;

	/**
	 * 国际化多语言6
	 */
	private String proglang06;

	/**
	 * 国际化多语言7
	 */
	private String proglang07;

	/**
	 * 国际化多语言8
	 */
	private String proglang08;

	/**
	 * 国际化多语言9
	 */
	private String proglang09;

	/**
	 * 国际化多语言10
	 */
	private String proglang10;

	/**
	 * 国际化多语言11
	 */
	private String proglang11;

	/**
	 * 国际化多语言12
	 */
	private String proglang12;

	/**
	 * 国际化多语言13
	 */
	private String proglang13;

	/**
	 * 国际化多语言14
	 */
	private String proglang14;

	/**
	 * 国际化多语言15
	 */
	private String proglang15;

	/**
	 * 国际化多语言16
	 */
	private String proglang16;

	/**
	 * 国际化多语言17
	 */
	private String proglang17;

	/**
	 * 国际化多语言18
	 */
	private String proglang18;

	/**
	 * 国际化多语言19
	 */
	private String proglang19;

	/**
	 * 国际化多语言20
	 */
	private String proglang20;

}
