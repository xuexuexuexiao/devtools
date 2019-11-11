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
 * 角色界面
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_viewrole")
@IdClass(T_viewrolePK.class)
public class T_viewrole implements Serializable {

	/**
	 * 界面编号
	 */
	@Id
	private String viewrole01;

	/**
	 * 栏位id
	 */
	@Id
	private String viewrole02;

	/**
	 * 角色编号
	 */
	@Id
	private String viewrole03;

	/**
	 * 隐藏否
	 */
	private String viewrole04;

	/**
	 * 可录否
	 */
	private String viewrole05;

	/**
	 * nouse
	 */
	private String viewrole60;

	/**
	 * nouse
	 */
	private String viewrole61;

	/**
	 * nouse
	 */
	private String viewrole62;

	/**
	 * nouse
	 */
	private String viewrole63;

	/**
	 * nouse
	 */
	private String viewrole64;

	/**
	 * nouse
	 */
	private String viewrole65;

	/**
	 * nouse
	 */
	private String viewrole66;

	/**
	 * nouse
	 */
	private BigDecimal viewrole67;

	/**
	 * nouse
	 */
	private BigDecimal viewrole68;

	/**
	 * nouse
	 */
	private BigDecimal viewrole69;

	/**
	 * nouse
	 */
	private BigDecimal viewrole70;

	/**
	 * nouse
	 */
	private BigDecimal viewrole71;

	/**
	 * nouse
	 */
	private BigDecimal viewrole72;

	/**
	 * nouse
	 */
	private BigDecimal viewrole73;

	/**
	 * nouse
	 */
	private BigDecimal viewrole74;

	/**
	 * nouse
	 */
	private String viewrole75;

	/**
	 * nouse
	 */
	private String viewrole76;

	/**
	 * nouse
	 */
	private String viewrole77;

	/**
	 * nouse
	 */
	private String viewrole78;

	/**
	 * nouse
	 */
	private String viewrole79;

	/**
	 * nouse
	 */
	private String viewrole80;

	/**
	 * nouse
	 */
	private String viewrole81;

	/**
	 * nouse
	 */
	private String viewrole82;

	/**
	 * nouse
	 */
	private String viewrole83;

	/**
	 * nouse
	 */
	private String viewrole84;

	/**
	 * nouse
	 */
	private Date viewrole85;

	/**
	 * nouse
	 */
	private Date viewrole86;

	/**
	 * nouse
	 */
	private Date viewrole87;

	/**
	 * nouse
	 */
	private Date viewrole88;

	/**
	 * nouse
	 */
	private Date viewrole89;

	/**
	 * nouse
	 */
	private Date viewrole90;

	/**
	 * 基础资料状况码
	 */
	private String viewrolestatus;

	/**
	 * 细颗粒权限码
	 */
	private String viewroleauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String viewrolecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date viewrolecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String viewrolemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date viewrolemodd;

	/**
	 * 法人
	 */
	private String viewrolelegal;

	/**
	 * 公司
	 */
	private String viewrolecompany;

	/**
	 * 国际化多语言1
	 */
	private String viewrolelang01;

	/**
	 * 国际化多语言2
	 */
	private String viewrolelang02;

	/**
	 * 国际化多语言3
	 */
	private String viewrolelang03;

	/**
	 * 国际化多语言4
	 */
	private String viewrolelang04;

	/**
	 * 国际化多语言5
	 */
	private String viewrolelang05;

	/**
	 * 国际化多语言6
	 */
	private String viewrolelang06;

	/**
	 * 国际化多语言7
	 */
	private String viewrolelang07;

	/**
	 * 国际化多语言8
	 */
	private String viewrolelang08;

	/**
	 * 国际化多语言9
	 */
	private String viewrolelang09;

	/**
	 * 国际化多语言10
	 */
	private String viewrolelang10;

	/**
	 * 国际化多语言11
	 */
	private String viewrolelang11;

	/**
	 * 国际化多语言12
	 */
	private String viewrolelang12;

	/**
	 * 国际化多语言13
	 */
	private String viewrolelang13;

	/**
	 * 国际化多语言14
	 */
	private String viewrolelang14;

	/**
	 * 国际化多语言15
	 */
	private String viewrolelang15;

	/**
	 * 国际化多语言16
	 */
	private String viewrolelang16;

	/**
	 * 国际化多语言17
	 */
	private String viewrolelang17;

	/**
	 * 国际化多语言18
	 */
	private String viewrolelang18;

	/**
	 * 国际化多语言19
	 */
	private String viewrolelang19;

	/**
	 * 国际化多语言20
	 */
	private String viewrolelang20;

}
