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
 * 程序资源表
 *
 * @author xxx
 * @date 2019-04-19
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_progresources")
@IdClass(T_progresourcesPK.class)
public class T_progresources  implements Serializable {

	/**
	 * 程序编号
	 */
	@Id
	private String progresources01;

	/**
	 * 资源编号
	 */
	@Id
	private String progresources02;

	/**
	 * nouse
	 */
	private String progresources60;

	/**
	 * nouse
	 */
	private String progresources61;

	/**
	 * nouse
	 */
	private String progresources62;

	/**
	 * nouse
	 */
	private String progresources63;

	/**
	 * nouse
	 */
	private String progresources64;

	/**
	 * nouse
	 */
	private String progresources65;

	/**
	 * nouse
	 */
	private String progresources66;

	/**
	 * nouse
	 */
	private BigDecimal progresources67;

	/**
	 * nouse
	 */
	private BigDecimal progresources68;

	/**
	 * nouse
	 */
	private BigDecimal progresources69;

	/**
	 * nouse
	 */
	private BigDecimal progresources70;

	/**
	 * nouse
	 */
	private BigDecimal progresources71;

	/**
	 * nouse
	 */
	private BigDecimal progresources72;

	/**
	 * nouse
	 */
	private BigDecimal progresources73;

	/**
	 * nouse
	 */
	private BigDecimal progresources74;

	/**
	 * nouse
	 */
	private String progresources75;

	/**
	 * nouse
	 */
	private String progresources76;

	/**
	 * nouse
	 */
	private String progresources77;

	/**
	 * nouse
	 */
	private String progresources78;

	/**
	 * nouse
	 */
	private String progresources79;

	/**
	 * nouse
	 */
	private String progresources80;

	/**
	 * nouse
	 */
	private String progresources81;

	/**
	 * nouse
	 */
	private String progresources82;

	/**
	 * nouse
	 */
	private String progresources83;

	/**
	 * nouse
	 */
	private String progresources84;

	/**
	 * nouse
	 */
	private Date progresources85;

	/**
	 * nouse
	 */
	private Date progresources86;

	/**
	 * nouse
	 */
	private Date progresources87;

	/**
	 * nouse
	 */
	private Date progresources88;

	/**
	 * nouse
	 */
	private Date progresources89;

	/**
	 * nouse
	 */
	private Date progresources90;

	/**
	 * 基础资料状况码
	 */
	private String progresourcesstatus;

	/**
	 * 细颗粒权限码
	 */
	private String progresourcesauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progresourcescreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progresourcescred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progresourcesmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progresourcesmodd;

	/**
	 * 法人
	 */
	private String progresourceslegal;

	/**
	 * 公司
	 */
	private String progresourcescompany;

	/**
	 * 国际化多语言1
	 */
	private String progresourceslang01;

	/**
	 * 国际化多语言2
	 */
	private String progresourceslang02;

	/**
	 * 国际化多语言3
	 */
	private String progresourceslang03;

	/**
	 * 国际化多语言4
	 */
	private String progresourceslang04;

	/**
	 * 国际化多语言5
	 */
	private String progresourceslang05;

	/**
	 * 国际化多语言6
	 */
	private String progresourceslang06;

	/**
	 * 国际化多语言7
	 */
	private String progresourceslang07;

	/**
	 * 国际化多语言8
	 */
	private String progresourceslang08;

	/**
	 * 国际化多语言9
	 */
	private String progresourceslang09;

	/**
	 * 国际化多语言10
	 */
	private String progresourceslang10;

	/**
	 * 国际化多语言11
	 */
	private String progresourceslang11;

	/**
	 * 国际化多语言12
	 */
	private String progresourceslang12;

	/**
	 * 国际化多语言13
	 */
	private String progresourceslang13;

	/**
	 * 国际化多语言14
	 */
	private String progresourceslang14;

	/**
	 * 国际化多语言15
	 */
	private String progresourceslang15;

	/**
	 * 国际化多语言16
	 */
	private String progresourceslang16;

	/**
	 * 国际化多语言17
	 */
	private String progresourceslang17;

	/**
	 * 国际化多语言18
	 */
	private String progresourceslang18;

	/**
	 * 国际化多语言19
	 */
	private String progresourceslang19;

	/**
	 * 国际化多语言20
	 */
	private String progresourceslang20;

}
