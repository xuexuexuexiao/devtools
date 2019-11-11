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
 * 项目配置
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_project")
public class T_project implements Serializable {

	/**
	 * 项目编号
	 */
	@Id
	private String project01;

	/**
	 * 项目名称
	 */
	private String project02;

	/**
	 * 项目说明
	 */
	private String project03;

	/**
	 * 前端UI
	 */
	private String project04;

	/**
	 * 关系型数据库
	 */
	private String project05;

	/**
	 * 国际化语言列表
	 */
	private String project06;

	/**
	 * nouse
	 */
	private String project60;

	/**
	 * nouse
	 */
	private String project61;

	/**
	 * nouse
	 */
	private String project62;

	/**
	 * nouse
	 */
	private String project63;

	/**
	 * nouse
	 */
	private String project64;

	/**
	 * nouse
	 */
	private String project65;

	/**
	 * nouse
	 */
	private String project66;

	/**
	 * nouse
	 */
	private BigDecimal project67;

	/**
	 * nouse
	 */
	private BigDecimal project68;

	/**
	 * nouse
	 */
	private BigDecimal project69;

	/**
	 * nouse
	 */
	private BigDecimal project70;

	/**
	 * nouse
	 */
	private BigDecimal project71;

	/**
	 * nouse
	 */
	private BigDecimal project72;

	/**
	 * nouse
	 */
	private BigDecimal project73;

	/**
	 * nouse
	 */
	private BigDecimal project74;

	/**
	 * nouse
	 */
	private String project75;

	/**
	 * nouse
	 */
	private String project76;

	/**
	 * nouse
	 */
	private String project77;

	/**
	 * nouse
	 */
	private String project78;

	/**
	 * nouse
	 */
	private String project79;

	/**
	 * nouse
	 */
	private String project80;

	/**
	 * nouse
	 */
	private String project81;

	/**
	 * nouse
	 */
	private String project82;

	/**
	 * nouse
	 */
	private String project83;

	/**
	 * nouse
	 */
	private String project84;

	/**
	 * nouse
	 */
	private Date project85;

	/**
	 * nouse
	 */
	private Date project86;

	/**
	 * nouse
	 */
	private Date project87;

	/**
	 * nouse
	 */
	private Date project88;

	/**
	 * nouse
	 */
	private Date project89;

	/**
	 * nouse
	 */
	private Date project90;

	/**
	 * 基础资料状况码
	 */
	private String projectstatus;

	/**
	 * 细颗粒权限码
	 */
	private String projectauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String projectcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date projectcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String projectmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date projectmodd;

	/**
	 * 法人
	 */
	private String projectlegal;

	/**
	 * 公司
	 */
	private String projectcompany;

	/**
	 * 国际化多语言1
	 */
	private String projectlang01;

	/**
	 * 国际化多语言2
	 */
	private String projectlang02;

	/**
	 * 国际化多语言3
	 */
	private String projectlang03;

	/**
	 * 国际化多语言4
	 */
	private String projectlang04;

	/**
	 * 国际化多语言5
	 */
	private String projectlang05;

	/**
	 * 国际化多语言6
	 */
	private String projectlang06;

	/**
	 * 国际化多语言7
	 */
	private String projectlang07;

	/**
	 * 国际化多语言8
	 */
	private String projectlang08;

	/**
	 * 国际化多语言9
	 */
	private String projectlang09;

	/**
	 * 国际化多语言10
	 */
	private String projectlang10;

	/**
	 * 国际化多语言11
	 */
	private String projectlang11;

	/**
	 * 国际化多语言12
	 */
	private String projectlang12;

	/**
	 * 国际化多语言13
	 */
	private String projectlang13;

	/**
	 * 国际化多语言14
	 */
	private String projectlang14;

	/**
	 * 国际化多语言15
	 */
	private String projectlang15;

	/**
	 * 国际化多语言16
	 */
	private String projectlang16;

	/**
	 * 国际化多语言17
	 */
	private String projectlang17;

	/**
	 * 国际化多语言18
	 */
	private String projectlang18;

	/**
	 * 国际化多语言19
	 */
	private String projectlang19;

	/**
	 * 国际化多语言20
	 */
	private String projectlang20;

}
