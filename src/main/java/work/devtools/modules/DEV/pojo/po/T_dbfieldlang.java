package work.devtools.modules.DEV.pojo.po;

import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;


/**
 *
 * @author xxx
 * @date 2019-04-11
 */
@Entity
@Data
@Table(name = "t_dbfieldlang")
@IdClass(T_dbfieldlangPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_dbfieldlang  implements Serializable {

	/**
	 * 表
	 */
	@Id
	private String dbfieldlang01;

	/**
	 * 字段
	 */
	@Id
	private String dbfieldlang02;

	/**
	 * 国际化多语言
	 */
	@Id
	private String dbfieldlang03;

	/**
	 * 字段名称
	 */
	private String dbfieldlang04;

	/**
	 * 字段说明
	 */
	private String dbfieldlang05;

	/**
	 * nouse
	 */
	private String dbfieldlang60;

	/**
	 * nouse
	 */
	private String dbfieldlang61;

	/**
	 * nouse
	 */
	private String dbfieldlang62;

	/**
	 * nouse
	 */
	private String dbfieldlang63;

	/**
	 * nouse
	 */
	private String dbfieldlang64;

	/**
	 * nouse
	 */
	private String dbfieldlang65;

	/**
	 * nouse
	 */
	private String dbfieldlang66;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang67;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang68;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang69;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang70;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang71;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang72;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang73;

	/**
	 * nouse
	 */
	private BigDecimal dbfieldlang74;

	/**
	 * nouse
	 */
	private String dbfieldlang75;

	/**
	 * nouse
	 */
	private String dbfieldlang76;

	/**
	 * nouse
	 */
	private String dbfieldlang77;

	/**
	 * nouse
	 */
	private String dbfieldlang78;

	/**
	 * nouse
	 */
	private String dbfieldlang79;

	/**
	 * nouse
	 */
	private String dbfieldlang80;

	/**
	 * nouse
	 */
	private String dbfieldlang81;

	/**
	 * nouse
	 */
	private String dbfieldlang82;

	/**
	 * nouse
	 */
	private String dbfieldlang83;

	/**
	 * nouse
	 */
	private String dbfieldlang84;

	/**
	 * nouse
	 */
	private Date dbfieldlang85;

	/**
	 * nouse
	 */
	private Date dbfieldlang86;

	/**
	 * nouse
	 */
	private Date dbfieldlang87;

	/**
	 * nouse
	 */
	private Date dbfieldlang88;

	/**
	 * nouse
	 */
	private Date dbfieldlang89;

	/**
	 * nouse
	 */
	private Date dbfieldlang90;

	/**
	 * 基础资料状况码
	 */
	private String dbfieldlangstatus;

	/**
	 * 细颗粒权限码
	 */
	private String dbfieldlangauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String dbfieldlangcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date dbfieldlangcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String dbfieldlangmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date dbfieldlangmodd;

	/**
	 * 法人
	 */
	private String dbfieldlanglegal;

	/**
	 * 公司
	 */
	private String dbfieldlangcompany;

	/**
	 * 国际化多语言1
	 */
	private String dbfieldlanglang01;

	/**
	 * 国际化多语言2
	 */
	private String dbfieldlanglang02;

	/**
	 * 国际化多语言3
	 */
	private String dbfieldlanglang03;

	/**
	 * 国际化多语言4
	 */
	private String dbfieldlanglang04;

	/**
	 * 国际化多语言5
	 */
	private String dbfieldlanglang05;

	/**
	 * 国际化多语言6
	 */
	private String dbfieldlanglang06;

	/**
	 * 国际化多语言7
	 */
	private String dbfieldlanglang07;

	/**
	 * 国际化多语言8
	 */
	private String dbfieldlanglang08;

	/**
	 * 国际化多语言9
	 */
	private String dbfieldlanglang09;

	/**
	 * 国际化多语言10
	 */
	private String dbfieldlanglang10;

	/**
	 * 国际化多语言11
	 */
	private String dbfieldlanglang11;

	/**
	 * 国际化多语言12
	 */
	private String dbfieldlanglang12;

	/**
	 * 国际化多语言13
	 */
	private String dbfieldlanglang13;

	/**
	 * 国际化多语言14
	 */
	private String dbfieldlanglang14;

	/**
	 * 国际化多语言15
	 */
	private String dbfieldlanglang15;

	/**
	 * 国际化多语言16
	 */
	private String dbfieldlanglang16;

	/**
	 * 国际化多语言17
	 */
	private String dbfieldlanglang17;

	/**
	 * 国际化多语言18
	 */
	private String dbfieldlanglang18;

	/**
	 * 国际化多语言19
	 */
	private String dbfieldlanglang19;

	/**
	 * 国际化多语言20
	 */
	private String dbfieldlanglang20;

}
