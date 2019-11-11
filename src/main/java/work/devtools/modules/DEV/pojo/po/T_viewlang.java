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
 *
 * @author xxx
 * @date 2019-04-11
 */
@Entity
@Data
@Table(name = "t_viewlang")
@IdClass(T_viewlangPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_viewlang  implements Serializable {

	/**
	 * 界面编号
	 */
	@Id
	private String viewlang01;

	/**
	 * 栏位id
	 */
	@Id
	private String viewlang02;

	/**
	 * 国际化多语言编号
	 */
	@Id
	private String viewlang03;

	/**
	 * 栏位id名称
	 */
	private String viewlang04;

	/**
	 * nouse
	 */
	private String viewlang60;

	/**
	 * nouse
	 */
	private String viewlang61;

	/**
	 * nouse
	 */
	private String viewlang62;

	/**
	 * nouse
	 */
	private String viewlang63;

	/**
	 * nouse
	 */
	private String viewlang64;

	/**
	 * nouse
	 */
	private String viewlang65;

	/**
	 * nouse
	 */
	private String viewlang66;

	/**
	 * nouse
	 */
	private BigDecimal viewlang67;

	/**
	 * nouse
	 */
	private BigDecimal viewlang68;

	/**
	 * nouse
	 */
	private BigDecimal viewlang69;

	/**
	 * nouse
	 */
	private BigDecimal viewlang70;

	/**
	 * nouse
	 */
	private BigDecimal viewlang71;

	/**
	 * nouse
	 */
	private BigDecimal viewlang72;

	/**
	 * nouse
	 */
	private BigDecimal viewlang73;

	/**
	 * nouse
	 */
	private BigDecimal viewlang74;

	/**
	 * nouse
	 */
	private String viewlang75;

	/**
	 * nouse
	 */
	private String viewlang76;

	/**
	 * nouse
	 */
	private String viewlang77;

	/**
	 * nouse
	 */
	private String viewlang78;

	/**
	 * nouse
	 */
	private String viewlang79;

	/**
	 * nouse
	 */
	private String viewlang80;

	/**
	 * nouse
	 */
	private String viewlang81;

	/**
	 * nouse
	 */
	private String viewlang82;

	/**
	 * nouse
	 */
	private String viewlang83;

	/**
	 * nouse
	 */
	private String viewlang84;

	/**
	 * nouse
	 */
	private Date viewlang85;

	/**
	 * nouse
	 */
	private Date viewlang86;

	/**
	 * nouse
	 */
	private Date viewlang87;

	/**
	 * nouse
	 */
	private Date viewlang88;

	/**
	 * nouse
	 */
	private Date viewlang89;

	/**
	 * nouse
	 */
	private Date viewlang90;

	/**
	 * 基础资料状况码
	 */
	private String viewlangstatus;

	/**
	 * 细颗粒权限码
	 */
	private String viewlangauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String viewlangcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date viewlangcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String viewlangmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date viewlangmodd;

	/**
	 * 法人
	 */
	private String viewlanglegal;

	/**
	 * 公司
	 */
	private String viewlangcompany;

	/**
	 * 国际化多语言1
	 */
	private String viewlanglang01;

	/**
	 * 国际化多语言2
	 */
	private String viewlanglang02;

	/**
	 * 国际化多语言3
	 */
	private String viewlanglang03;

	/**
	 * 国际化多语言4
	 */
	private String viewlanglang04;

	/**
	 * 国际化多语言5
	 */
	private String viewlanglang05;

	/**
	 * 国际化多语言6
	 */
	private String viewlanglang06;

	/**
	 * 国际化多语言7
	 */
	private String viewlanglang07;

	/**
	 * 国际化多语言8
	 */
	private String viewlanglang08;

	/**
	 * 国际化多语言9
	 */
	private String viewlanglang09;

	/**
	 * 国际化多语言10
	 */
	private String viewlanglang10;

	/**
	 * 国际化多语言11
	 */
	private String viewlanglang11;

	/**
	 * 国际化多语言12
	 */
	private String viewlanglang12;

	/**
	 * 国际化多语言13
	 */
	private String viewlanglang13;

	/**
	 * 国际化多语言14
	 */
	private String viewlanglang14;

	/**
	 * 国际化多语言15
	 */
	private String viewlanglang15;

	/**
	 * 国际化多语言16
	 */
	private String viewlanglang16;

	/**
	 * 国际化多语言17
	 */
	private String viewlanglang17;

	/**
	 * 国际化多语言18
	 */
	private String viewlanglang18;

	/**
	 * 国际化多语言19
	 */
	private String viewlanglang19;

	/**
	 * 国际化多语言20
	 */
	private String viewlanglang20;

}
