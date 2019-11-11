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
 * 用户角色
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_userrole")
@IdClass(T_userrolePK.class)
public class T_userrole implements Serializable {

	/**
	 * 用户编号
	 */
	@Id
	private String userrole01;

	/**
	 * 权限分类
	 */
	@Id
	private String userrole02;

	/**
	 * 角色编号/程序编号
	 */
	@Id
	private String userrole03;

	/**
	 * nouse
	 */
	private String userrole60;

	/**
	 * nouse
	 */
	private String userrole61;

	/**
	 * nouse
	 */
	private String userrole62;

	/**
	 * nouse
	 */
	private String userrole63;

	/**
	 * nouse
	 */
	private String userrole64;

	/**
	 * nouse
	 */
	private String userrole65;

	/**
	 * nouse
	 */
	private String userrole66;

	/**
	 * nouse
	 */
	private BigDecimal userrole67;

	/**
	 * nouse
	 */
	private BigDecimal userrole68;

	/**
	 * nouse
	 */
	private BigDecimal userrole69;

	/**
	 * nouse
	 */
	private BigDecimal userrole70;

	/**
	 * nouse
	 */
	private BigDecimal userrole71;

	/**
	 * nouse
	 */
	private BigDecimal userrole72;

	/**
	 * nouse
	 */
	private BigDecimal userrole73;

	/**
	 * nouse
	 */
	private BigDecimal userrole74;

	/**
	 * nouse
	 */
	private String userrole75;

	/**
	 * nouse
	 */
	private String userrole76;

	/**
	 * nouse
	 */
	private String userrole77;

	/**
	 * nouse
	 */
	private String userrole78;

	/**
	 * nouse
	 */
	private String userrole79;

	/**
	 * nouse
	 */
	private String userrole80;

	/**
	 * nouse
	 */
	private String userrole81;

	/**
	 * nouse
	 */
	private String userrole82;

	/**
	 * nouse
	 */
	private String userrole83;

	/**
	 * nouse
	 */
	private String userrole84;

	/**
	 * nouse
	 */
	private Date userrole85;

	/**
	 * nouse
	 */
	private Date userrole86;

	/**
	 * nouse
	 */
	private Date userrole87;

	/**
	 * nouse
	 */
	private Date userrole88;

	/**
	 * nouse
	 */
	private Date userrole89;

	/**
	 * nouse
	 */
	private Date userrole90;

	/**
	 * 基础资料状况码
	 */
	private String userrolestatus;

	/**
	 * 细颗粒权限码
	 */
	private String userroleauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String userrolecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date userrolecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String userrolemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date userrolemodd;

	/**
	 * 法人
	 */
	private String userrolelegal;

	/**
	 * 公司
	 */
	private String userrolecompany;

	/**
	 * 国际化多语言1
	 */
	private String userrolelang01;

	/**
	 * 国际化多语言2
	 */
	private String userrolelang02;

	/**
	 * 国际化多语言3
	 */
	private String userrolelang03;

	/**
	 * 国际化多语言4
	 */
	private String userrolelang04;

	/**
	 * 国际化多语言5
	 */
	private String userrolelang05;

	/**
	 * 国际化多语言6
	 */
	private String userrolelang06;

	/**
	 * 国际化多语言7
	 */
	private String userrolelang07;

	/**
	 * 国际化多语言8
	 */
	private String userrolelang08;

	/**
	 * 国际化多语言9
	 */
	private String userrolelang09;

	/**
	 * 国际化多语言10
	 */
	private String userrolelang10;

	/**
	 * 国际化多语言11
	 */
	private String userrolelang11;

	/**
	 * 国际化多语言12
	 */
	private String userrolelang12;

	/**
	 * 国际化多语言13
	 */
	private String userrolelang13;

	/**
	 * 国际化多语言14
	 */
	private String userrolelang14;

	/**
	 * 国际化多语言15
	 */
	private String userrolelang15;

	/**
	 * 国际化多语言16
	 */
	private String userrolelang16;

	/**
	 * 国际化多语言17
	 */
	private String userrolelang17;

	/**
	 * 国际化多语言18
	 */
	private String userrolelang18;

	/**
	 * 国际化多语言19
	 */
	private String userrolelang19;

	/**
	 * 国际化多语言20
	 */
	private String userrolelang20;

}
