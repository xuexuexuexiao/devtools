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
 * 资源表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_resources")
public class T_resources implements Serializable {

	/**
	 * 资源编号
	 */
	@Id
	private String resources01;

	/**
	 * 资源类型选项：1.程序编号2.按钮
	 */
	private String resources02;

	/**
	 * URL
	 */
	private String resources03;

	/**
	 * nouse
	 */
	private String resources60;

	/**
	 * nouse
	 */
	private String resources61;

	/**
	 * nouse
	 */
	private String resources62;

	/**
	 * nouse
	 */
	private String resources63;

	/**
	 * nouse
	 */
	private String resources64;

	/**
	 * nouse
	 */
	private String resources65;

	/**
	 * nouse
	 */
	private String resources66;

	/**
	 * nouse
	 */
	private BigDecimal resources67;

	/**
	 * nouse
	 */
	private BigDecimal resources68;

	/**
	 * nouse
	 */
	private BigDecimal resources69;

	/**
	 * nouse
	 */
	private BigDecimal resources70;

	/**
	 * nouse
	 */
	private BigDecimal resources71;

	/**
	 * nouse
	 */
	private BigDecimal resources72;

	/**
	 * nouse
	 */
	private BigDecimal resources73;

	/**
	 * nouse
	 */
	private BigDecimal resources74;

	/**
	 * nouse
	 */
	private String resources75;

	/**
	 * nouse
	 */
	private String resources76;

	/**
	 * nouse
	 */
	private String resources77;

	/**
	 * nouse
	 */
	private String resources78;

	/**
	 * nouse
	 */
	private String resources79;

	/**
	 * nouse
	 */
	private String resources80;

	/**
	 * nouse
	 */
	private String resources81;

	/**
	 * nouse
	 */
	private String resources82;

	/**
	 * nouse
	 */
	private String resources83;

	/**
	 * nouse
	 */
	private String resources84;

	/**
	 * nouse
	 */
	private Date resources85;

	/**
	 * nouse
	 */
	private Date resources86;

	/**
	 * nouse
	 */
	private Date resources87;

	/**
	 * nouse
	 */
	private Date resources88;

	/**
	 * nouse
	 */
	private Date resources89;

	/**
	 * nouse
	 */
	private Date resources90;

	/**
	 * 基础资料状况码
	 */
	private String resourcesstatus;

	/**
	 * 细颗粒权限码
	 */
	private String resourcesauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String resourcescreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date resourcescred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String resourcesmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date resourcesmodd;

	/**
	 * 法人
	 */
	private String resourceslegal;

	/**
	 * 公司
	 */
	private String resourcescompany;

	/**
	 * 国际化多语言1
	 */
	private String resourceslang01;

	/**
	 * 国际化多语言2
	 */
	private String resourceslang02;

	/**
	 * 国际化多语言3
	 */
	private String resourceslang03;

	/**
	 * 国际化多语言4
	 */
	private String resourceslang04;

	/**
	 * 国际化多语言5
	 */
	private String resourceslang05;

	/**
	 * 国际化多语言6
	 */
	private String resourceslang06;

	/**
	 * 国际化多语言7
	 */
	private String resourceslang07;

	/**
	 * 国际化多语言8
	 */
	private String resourceslang08;

	/**
	 * 国际化多语言9
	 */
	private String resourceslang09;

	/**
	 * 国际化多语言10
	 */
	private String resourceslang10;

	/**
	 * 国际化多语言11
	 */
	private String resourceslang11;

	/**
	 * 国际化多语言12
	 */
	private String resourceslang12;

	/**
	 * 国际化多语言13
	 */
	private String resourceslang13;

	/**
	 * 国际化多语言14
	 */
	private String resourceslang14;

	/**
	 * 国际化多语言15
	 */
	private String resourceslang15;

	/**
	 * 国际化多语言16
	 */
	private String resourceslang16;

	/**
	 * 国际化多语言17
	 */
	private String resourceslang17;

	/**
	 * 国际化多语言18
	 */
	private String resourceslang18;

	/**
	 * 国际化多语言19
	 */
	private String resourceslang19;

	/**
	 * 国际化多语言20
	 */
	private String resourceslang20;

}
