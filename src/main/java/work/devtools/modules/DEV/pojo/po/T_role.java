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
 * 角色表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_role")
public class T_role implements Serializable {

	/**
	 * 角色编号
	 */
	@Id
	private String role01;

	/**
	 * 角色名称
	 */
	private String role02;

	/**
	 * 角色名称2
	 */
	private String role03;

	/**
	 * 备注
	 */
	private String role04;

	/**
	 * nouse
	 */
	private String role60;

	/**
	 * nouse
	 */
	private String role61;

	/**
	 * nouse
	 */
	private String role62;

	/**
	 * nouse
	 */
	private String role63;

	/**
	 * nouse
	 */
	private String role64;

	/**
	 * nouse
	 */
	private String role65;

	/**
	 * nouse
	 */
	private String role66;

	/**
	 * nouse
	 */
	private BigDecimal role67;

	/**
	 * nouse
	 */
	private BigDecimal role68;

	/**
	 * nouse
	 */
	private BigDecimal role69;

	/**
	 * nouse
	 */
	private BigDecimal role70;

	/**
	 * nouse
	 */
	private BigDecimal role71;

	/**
	 * nouse
	 */
	private BigDecimal role72;

	/**
	 * nouse
	 */
	private BigDecimal role73;

	/**
	 * nouse
	 */
	private BigDecimal role74;

	/**
	 * nouse
	 */
	private String role75;

	/**
	 * nouse
	 */
	private String role76;

	/**
	 * nouse
	 */
	private String role77;

	/**
	 * nouse
	 */
	private String role78;

	/**
	 * nouse
	 */
	private String role79;

	/**
	 * nouse
	 */
	private String role80;

	/**
	 * nouse
	 */
	private String role81;

	/**
	 * nouse
	 */
	private String role82;

	/**
	 * nouse
	 */
	private String role83;

	/**
	 * nouse
	 */
	private String role84;

	/**
	 * nouse
	 */
	private Date role85;

	/**
	 * nouse
	 */
	private Date role86;

	/**
	 * nouse
	 */
	private Date role87;

	/**
	 * nouse
	 */
	private Date role88;

	/**
	 * nouse
	 */
	private Date role89;

	/**
	 * nouse
	 */
	private Date role90;

	/**
	 * 基础资料状况码
	 */
	private String rolestatus;

	/**
	 * 细颗粒权限码
	 */
	private String roleauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String rolecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date rolecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String rolemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date rolemodd;

	/**
	 * 法人
	 */
	private String rolelegal;

	/**
	 * 公司
	 */
	private String rolecompany;

	/**
	 * 国际化多语言1
	 */
	private String rolelang01;

	/**
	 * 国际化多语言2
	 */
	private String rolelang02;

	/**
	 * 国际化多语言3
	 */
	private String rolelang03;

	/**
	 * 国际化多语言4
	 */
	private String rolelang04;

	/**
	 * 国际化多语言5
	 */
	private String rolelang05;

	/**
	 * 国际化多语言6
	 */
	private String rolelang06;

	/**
	 * 国际化多语言7
	 */
	private String rolelang07;

	/**
	 * 国际化多语言8
	 */
	private String rolelang08;

	/**
	 * 国际化多语言9
	 */
	private String rolelang09;

	/**
	 * 国际化多语言10
	 */
	private String rolelang10;

	/**
	 * 国际化多语言11
	 */
	private String rolelang11;

	/**
	 * 国际化多语言12
	 */
	private String rolelang12;

	/**
	 * 国际化多语言13
	 */
	private String rolelang13;

	/**
	 * 国际化多语言14
	 */
	private String rolelang14;

	/**
	 * 国际化多语言15
	 */
	private String rolelang15;

	/**
	 * 国际化多语言16
	 */
	private String rolelang16;

	/**
	 * 国际化多语言17
	 */
	private String rolelang17;

	/**
	 * 国际化多语言18
	 */
	private String rolelang18;

	/**
	 * 国际化多语言19
	 */
	private String rolelang19;

	/**
	 * 国际化多语言20
	 */
	private String rolelang20;

}
