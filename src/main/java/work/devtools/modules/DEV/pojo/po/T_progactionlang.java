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
@Table(name = "t_progactionlang")
@IdClass(T_progactionlangPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_progactionlang  implements Serializable {

	/**
	 * 程序编号
	 */
	@Id
	private String progactionlang01;

	/**
	 * 按钮编号
	 */
	@Id
	private String progactionlang02;

	/**
	 * 国际化多语言
	 */
	@Id
	private String progactionlang03;

	/**
	 * 按钮名称
	 */
	private String progactionlang04;

	/**
	 * nouse
	 */
	private String progactionlang60;

	/**
	 * nouse
	 */
	private String progactionlang61;

	/**
	 * nouse
	 */
	private String progactionlang62;

	/**
	 * nouse
	 */
	private String progactionlang63;

	/**
	 * nouse
	 */
	private String progactionlang64;

	/**
	 * nouse
	 */
	private String progactionlang65;

	/**
	 * nouse
	 */
	private String progactionlang66;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang67;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang68;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang69;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang70;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang71;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang72;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang73;

	/**
	 * nouse
	 */
	private BigDecimal progactionlang74;

	/**
	 * nouse
	 */
	private String progactionlang75;

	/**
	 * nouse
	 */
	private String progactionlang76;

	/**
	 * nouse
	 */
	private String progactionlang77;

	/**
	 * nouse
	 */
	private String progactionlang78;

	/**
	 * nouse
	 */
	private String progactionlang79;

	/**
	 * nouse
	 */
	private String progactionlang80;

	/**
	 * nouse
	 */
	private String progactionlang81;

	/**
	 * nouse
	 */
	private String progactionlang82;

	/**
	 * nouse
	 */
	private String progactionlang83;

	/**
	 * nouse
	 */
	private String progactionlang84;

	/**
	 * nouse
	 */
	private Date progactionlang85;

	/**
	 * nouse
	 */
	private Date progactionlang86;

	/**
	 * nouse
	 */
	private Date progactionlang87;

	/**
	 * nouse
	 */
	private Date progactionlang88;

	/**
	 * nouse
	 */
	private Date progactionlang89;

	/**
	 * nouse
	 */
	private Date progactionlang90;

	/**
	 * 基础资料状况码
	 */
	private String progactionlangstatus;

	/**
	 * 细颗粒权限码
	 */
	private String progactionlangauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progactionlangcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progactionlangcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progactionlangmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progactionlangmodd;

	/**
	 * 法人
	 */
	private String progactionlanglegal;

	/**
	 * 公司
	 */
	private String progactionlangcompany;

	/**
	 * 国际化多语言1
	 */
	private String progactionlanglang01;

	/**
	 * 国际化多语言2
	 */
	private String progactionlanglang02;

	/**
	 * 国际化多语言3
	 */
	private String progactionlanglang03;

	/**
	 * 国际化多语言4
	 */
	private String progactionlanglang04;

	/**
	 * 国际化多语言5
	 */
	private String progactionlanglang05;

	/**
	 * 国际化多语言6
	 */
	private String progactionlanglang06;

	/**
	 * 国际化多语言7
	 */
	private String progactionlanglang07;

	/**
	 * 国际化多语言8
	 */
	private String progactionlanglang08;

	/**
	 * 国际化多语言9
	 */
	private String progactionlanglang09;

	/**
	 * 国际化多语言10
	 */
	private String progactionlanglang10;

	/**
	 * 国际化多语言11
	 */
	private String progactionlanglang11;

	/**
	 * 国际化多语言12
	 */
	private String progactionlanglang12;

	/**
	 * 国际化多语言13
	 */
	private String progactionlanglang13;

	/**
	 * 国际化多语言14
	 */
	private String progactionlanglang14;

	/**
	 * 国际化多语言15
	 */
	private String progactionlanglang15;

	/**
	 * 国际化多语言16
	 */
	private String progactionlanglang16;

	/**
	 * 国际化多语言17
	 */
	private String progactionlanglang17;

	/**
	 * 国际化多语言18
	 */
	private String progactionlanglang18;

	/**
	 * 国际化多语言19
	 */
	private String progactionlanglang19;

	/**
	 * 国际化多语言20
	 */
	private String progactionlanglang20;

}
