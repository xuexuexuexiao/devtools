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
 * 画面控件表
 *
 * @author xxx
 * @date 2019-04-15
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_viewcontrol")
@IdClass(T_viewcontrolPK.class)
public class T_viewcontrol implements Serializable {


	/**
	 * 界面编号
	 */
	@Id
	private String viewcontrol01;

	/**
	 * 栏位id
	 */
	@Id
	private String viewcontrol02;

	/**
	 * 控件类型
	 */
	private String viewcontrol03;

	/**
	 * 是否可视
	 */
	private String viewcontrol04;

	/**
	 * 是否可录入
	 */
	private String viewcontrol05;

	/**
	 * 是否必录
	 */
	private String viewcontrol06;

	/**
	 * nouse
	 */
	private String viewcontrol60;

	/**
	 * nouse
	 */
	private String viewcontrol61;

	/**
	 * nouse
	 */
	private String viewcontrol62;

	/**
	 * nouse
	 */
	private String viewcontrol63;

	/**
	 * nouse
	 */
	private String viewcontrol64;

	/**
	 * nouse
	 */
	private String viewcontrol65;

	/**
	 * nouse
	 */
	private String viewcontrol66;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol67;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol68;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol69;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol70;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol71;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol72;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol73;

	/**
	 * nouse
	 */
	private BigDecimal viewcontrol74;

	/**
	 * nouse
	 */
	private String viewcontrol75;

	/**
	 * nouse
	 */
	private String viewcontrol76;

	/**
	 * nouse
	 */
	private String viewcontrol77;

	/**
	 * nouse
	 */
	private String viewcontrol78;

	/**
	 * nouse
	 */
	private String viewcontrol79;

	/**
	 * nouse
	 */
	private String viewcontrol80;

	/**
	 * nouse
	 */
	private String viewcontrol81;

	/**
	 * nouse
	 */
	private String viewcontrol82;

	/**
	 * nouse
	 */
	private String viewcontrol83;

	/**
	 * nouse
	 */
	private String viewcontrol84;

	/**
	 * nouse
	 */
	private Date viewcontrol85;

	/**
	 * nouse
	 */
	private Date viewcontrol86;

	/**
	 * nouse
	 */
	private Date viewcontrol87;

	/**
	 * nouse
	 */
	private Date viewcontrol88;

	/**
	 * nouse
	 */
	private Date viewcontrol89;

	/**
	 * nouse
	 */
	private Date viewcontrol90;

	/**
	 * 基础资料状况码
	 */
	private String viewcontrolstatus;

	/**
	 * 细颗粒权限码
	 */
	private String viewcontrolauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String viewcontrolcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date viewcontrolcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String viewcontrolmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date viewcontrolmodd;

	/**
	 * 法人
	 */
	private String viewcontrollegal;

	/**
	 * 公司
	 */
	private String viewcontrolcompany;

	/**
	 * 国际化多语言1
	 */
	private String viewcontrollang01;

	/**
	 * 国际化多语言2
	 */
	private String viewcontrollang02;

	/**
	 * 国际化多语言3
	 */
	private String viewcontrollang03;

	/**
	 * 国际化多语言4
	 */
	private String viewcontrollang04;

	/**
	 * 国际化多语言5
	 */
	private String viewcontrollang05;

	/**
	 * 国际化多语言6
	 */
	private String viewcontrollang06;

	/**
	 * 国际化多语言7
	 */
	private String viewcontrollang07;

	/**
	 * 国际化多语言8
	 */
	private String viewcontrollang08;

	/**
	 * 国际化多语言9
	 */
	private String viewcontrollang09;

	/**
	 * 国际化多语言10
	 */
	private String viewcontrollang10;

	/**
	 * 国际化多语言11
	 */
	private String viewcontrollang11;

	/**
	 * 国际化多语言12
	 */
	private String viewcontrollang12;

	/**
	 * 国际化多语言13
	 */
	private String viewcontrollang13;

	/**
	 * 国际化多语言14
	 */
	private String viewcontrollang14;

	/**
	 * 国际化多语言15
	 */
	private String viewcontrollang15;

	/**
	 * 国际化多语言16
	 */
	private String viewcontrollang16;

	/**
	 * 国际化多语言17
	 */
	private String viewcontrollang17;

	/**
	 * 国际化多语言18
	 */
	private String viewcontrollang18;

	/**
	 * 国际化多语言19
	 */
	private String viewcontrollang19;

	/**
	 * 国际化多语言20
	 */
	private String viewcontrollang20;

}
