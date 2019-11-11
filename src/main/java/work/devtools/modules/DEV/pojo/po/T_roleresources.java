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
 * 角色资源
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_roleresources")
@IdClass(T_roleresourcesPK.class)
public class T_roleresources implements Serializable {

	/**
	 * 角色编号
	 */
	@Id
	private String roleresources01;

	/**
	 * 资源编号
	 */
	@Id
	private String roleresources02;

	/**
	 * nouse
	 */
	private String roleresources60;

	/**
	 * nouse
	 */
	private String roleresources61;

	/**
	 * nouse
	 */
	private String roleresources62;

	/**
	 * nouse
	 */
	private String roleresources63;

	/**
	 * nouse
	 */
	private String roleresources64;

	/**
	 * nouse
	 */
	private String roleresources65;

	/**
	 * nouse
	 */
	private String roleresources66;

	/**
	 * nouse
	 */
	private BigDecimal roleresources67;

	/**
	 * nouse
	 */
	private BigDecimal roleresources68;

	/**
	 * nouse
	 */
	private BigDecimal roleresources69;

	/**
	 * nouse
	 */
	private BigDecimal roleresources70;

	/**
	 * nouse
	 */
	private BigDecimal roleresources71;

	/**
	 * nouse
	 */
	private BigDecimal roleresources72;

	/**
	 * nouse
	 */
	private BigDecimal roleresources73;

	/**
	 * nouse
	 */
	private BigDecimal roleresources74;

	/**
	 * nouse
	 */
	private String roleresources75;

	/**
	 * nouse
	 */
	private String roleresources76;

	/**
	 * nouse
	 */
	private String roleresources77;

	/**
	 * nouse
	 */
	private String roleresources78;

	/**
	 * nouse
	 */
	private String roleresources79;

	/**
	 * nouse
	 */
	private String roleresources80;

	/**
	 * nouse
	 */
	private String roleresources81;

	/**
	 * nouse
	 */
	private String roleresources82;

	/**
	 * nouse
	 */
	private String roleresources83;

	/**
	 * nouse
	 */
	private String roleresources84;

	/**
	 * nouse
	 */
	private Date roleresources85;

	/**
	 * nouse
	 */
	private Date roleresources86;

	/**
	 * nouse
	 */
	private Date roleresources87;

	/**
	 * nouse
	 */
	private Date roleresources88;

	/**
	 * nouse
	 */
	private Date roleresources89;

	/**
	 * nouse
	 */
	private Date roleresources90;

	/**
	 * 基础资料状况码
	 */
	private String roleresourcesstatus;

	/**
	 * 细颗粒权限码
	 */
	private String roleresourcesauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String roleresourcescreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date roleresourcescred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String roleresourcesmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date roleresourcesmodd;

	/**
	 * 法人
	 */
	private String roleresourceslegal;

	/**
	 * 公司
	 */
	private String roleresourcescompany;

	/**
	 * 国际化多语言1
	 */
	private String roleresourceslang01;

	/**
	 * 国际化多语言2
	 */
	private String roleresourceslang02;

	/**
	 * 国际化多语言3
	 */
	private String roleresourceslang03;

	/**
	 * 国际化多语言4
	 */
	private String roleresourceslang04;

	/**
	 * 国际化多语言5
	 */
	private String roleresourceslang05;

	/**
	 * 国际化多语言6
	 */
	private String roleresourceslang06;

	/**
	 * 国际化多语言7
	 */
	private String roleresourceslang07;

	/**
	 * 国际化多语言8
	 */
	private String roleresourceslang08;

	/**
	 * 国际化多语言9
	 */
	private String roleresourceslang09;

	/**
	 * 国际化多语言10
	 */
	private String roleresourceslang10;

	/**
	 * 国际化多语言11
	 */
	private String roleresourceslang11;

	/**
	 * 国际化多语言12
	 */
	private String roleresourceslang12;

	/**
	 * 国际化多语言13
	 */
	private String roleresourceslang13;

	/**
	 * 国际化多语言14
	 */
	private String roleresourceslang14;

	/**
	 * 国际化多语言15
	 */
	private String roleresourceslang15;

	/**
	 * 国际化多语言16
	 */
	private String roleresourceslang16;

	/**
	 * 国际化多语言17
	 */
	private String roleresourceslang17;

	/**
	 * 国际化多语言18
	 */
	private String roleresourceslang18;

	/**
	 * 国际化多语言19
	 */
	private String roleresourceslang19;

	/**
	 * 国际化多语言20
	 */
	private String roleresourceslang20;

}
