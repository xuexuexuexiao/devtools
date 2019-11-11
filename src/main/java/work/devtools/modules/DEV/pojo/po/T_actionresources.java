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
 * 按钮资源表
 *
 * @author xxx
 * @date 2019-04-19
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@IdClass(T_actionresourcesPK.class)
@Table(name = "t_actionresources")
public class T_actionresources  implements Serializable {

	/**
	 * 程序编号
	 */
	@Id
	private String actionresources01;

	/**
	 * 按钮编号
	 */
	@Id
	private String actionresources02;

	/**
	 * 资源编号
	 */
	@Id
	private String actionresources03;

	/**
	 * nouse
	 */
	private String actionresources60;

	/**
	 * nouse
	 */
	private String actionresources61;

	/**
	 * nouse
	 */
	private String actionresources62;

	/**
	 * nouse
	 */
	private String actionresources63;

	/**
	 * nouse
	 */
	private String actionresources64;

	/**
	 * nouse
	 */
	private String actionresources65;

	/**
	 * nouse
	 */
	private String actionresources66;

	/**
	 * nouse
	 */
	private BigDecimal actionresources67;

	/**
	 * nouse
	 */
	private BigDecimal actionresources68;

	/**
	 * nouse
	 */
	private BigDecimal actionresources69;

	/**
	 * nouse
	 */
	private BigDecimal actionresources70;

	/**
	 * nouse
	 */
	private BigDecimal actionresources71;

	/**
	 * nouse
	 */
	private BigDecimal actionresources72;

	/**
	 * nouse
	 */
	private BigDecimal actionresources73;

	/**
	 * nouse
	 */
	private BigDecimal actionresources74;

	/**
	 * nouse
	 */
	private String actionresources75;

	/**
	 * nouse
	 */
	private String actionresources76;

	/**
	 * nouse
	 */
	private String actionresources77;

	/**
	 * nouse
	 */
	private String actionresources78;

	/**
	 * nouse
	 */
	private String actionresources79;

	/**
	 * nouse
	 */
	private String actionresources80;

	/**
	 * nouse
	 */
	private String actionresources81;

	/**
	 * nouse
	 */
	private String actionresources82;

	/**
	 * nouse
	 */
	private String actionresources83;

	/**
	 * nouse
	 */
	private String actionresources84;

	/**
	 * nouse
	 */
	private Date actionresources85;

	/**
	 * nouse
	 */
	private Date actionresources86;

	/**
	 * nouse
	 */
	private Date actionresources87;

	/**
	 * nouse
	 */
	private Date actionresources88;

	/**
	 * nouse
	 */
	private Date actionresources89;

	/**
	 * nouse
	 */
	private Date actionresources90;

	/**
	 * 基础资料状况码
	 */
	private String actionresourcesstatus;

	/**
	 * 细颗粒权限码
	 */
	private String actionresourcesauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String actionresourcescreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date actionresourcescred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String actionresourcesmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date actionresourcesmodd;

	/**
	 * 法人
	 */
	private String actionresourceslegal;

	/**
	 * 公司
	 */
	private String actionresourcescompany;

	/**
	 * 国际化多语言1
	 */
	private String actionresourceslang01;

	/**
	 * 国际化多语言2
	 */
	private String actionresourceslang02;

	/**
	 * 国际化多语言3
	 */
	private String actionresourceslang03;

	/**
	 * 国际化多语言4
	 */
	private String actionresourceslang04;

	/**
	 * 国际化多语言5
	 */
	private String actionresourceslang05;

	/**
	 * 国际化多语言6
	 */
	private String actionresourceslang06;

	/**
	 * 国际化多语言7
	 */
	private String actionresourceslang07;

	/**
	 * 国际化多语言8
	 */
	private String actionresourceslang08;

	/**
	 * 国际化多语言9
	 */
	private String actionresourceslang09;

	/**
	 * 国际化多语言10
	 */
	private String actionresourceslang10;

	/**
	 * 国际化多语言11
	 */
	private String actionresourceslang11;

	/**
	 * 国际化多语言12
	 */
	private String actionresourceslang12;

	/**
	 * 国际化多语言13
	 */
	private String actionresourceslang13;

	/**
	 * 国际化多语言14
	 */
	private String actionresourceslang14;

	/**
	 * 国际化多语言15
	 */
	private String actionresourceslang15;

	/**
	 * 国际化多语言16
	 */
	private String actionresourceslang16;

	/**
	 * 国际化多语言17
	 */
	private String actionresourceslang17;

	/**
	 * 国际化多语言18
	 */
	private String actionresourceslang18;

	/**
	 * 国际化多语言19
	 */
	private String actionresourceslang19;

	/**
	 * 国际化多语言20
	 */
	private String actionresourceslang20;

}
