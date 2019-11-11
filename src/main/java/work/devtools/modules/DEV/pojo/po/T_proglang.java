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
@Table(name = "t_proglang")
@IdClass(T_proglangPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_proglang  implements Serializable {

	/**
	 * 程序编号
	 */
	@Id
	private String proglang01;

	/**
	 * 国际化多语言编号
	 */
	@Id
	private String proglang02;

	/**
	 * 程序名称
	 */
	private String proglang03;

	/**
	 * nouse
	 */
	private String proglang60;

	/**
	 * nouse
	 */
	private String proglang61;

	/**
	 * nouse
	 */
	private String proglang62;

	/**
	 * nouse
	 */
	private String proglang63;

	/**
	 * nouse
	 */
	private String proglang64;

	/**
	 * nouse
	 */
	private String proglang65;

	/**
	 * nouse
	 */
	private String proglang66;

	/**
	 * nouse
	 */
	private BigDecimal proglang67;

	/**
	 * nouse
	 */
	private BigDecimal proglang68;

	/**
	 * nouse
	 */
	private BigDecimal proglang69;

	/**
	 * nouse
	 */
	private BigDecimal proglang70;

	/**
	 * nouse
	 */
	private BigDecimal proglang71;

	/**
	 * nouse
	 */
	private BigDecimal proglang72;

	/**
	 * nouse
	 */
	private BigDecimal proglang73;

	/**
	 * nouse
	 */
	private BigDecimal proglang74;

	/**
	 * nouse
	 */
	private String proglang75;

	/**
	 * nouse
	 */
	private String proglang76;

	/**
	 * nouse
	 */
	private String proglang77;

	/**
	 * nouse
	 */
	private String proglang78;

	/**
	 * nouse
	 */
	private String proglang79;

	/**
	 * nouse
	 */
	private String proglang80;

	/**
	 * nouse
	 */
	private String proglang81;

	/**
	 * nouse
	 */
	private String proglang82;

	/**
	 * nouse
	 */
	private String proglang83;

	/**
	 * nouse
	 */
	private String proglang84;

	/**
	 * nouse
	 */
	private Date proglang85;

	/**
	 * nouse
	 */
	private Date proglang86;

	/**
	 * nouse
	 */
	private Date proglang87;

	/**
	 * nouse
	 */
	private Date proglang88;

	/**
	 * nouse
	 */
	private Date proglang89;

	/**
	 * nouse
	 */
	private Date proglang90;

	/**
	 * 基础资料状况码
	 */
	private String proglangstatus;

	/**
	 * 细颗粒权限码
	 */
	private String proglangauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String proglangcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date proglangcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String proglangmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date proglangmodd;

	/**
	 * 法人
	 */
	private String proglanglegal;

	/**
	 * 公司
	 */
	private String proglangcompany;

	/**
	 * 国际化多语言1
	 */
	private String proglanglang01;

	/**
	 * 国际化多语言2
	 */
	private String proglanglang02;

	/**
	 * 国际化多语言3
	 */
	private String proglanglang03;

	/**
	 * 国际化多语言4
	 */
	private String proglanglang04;

	/**
	 * 国际化多语言5
	 */
	private String proglanglang05;

	/**
	 * 国际化多语言6
	 */
	private String proglanglang06;

	/**
	 * 国际化多语言7
	 */
	private String proglanglang07;

	/**
	 * 国际化多语言8
	 */
	private String proglanglang08;

	/**
	 * 国际化多语言9
	 */
	private String proglanglang09;

	/**
	 * 国际化多语言10
	 */
	private String proglanglang10;

	/**
	 * 国际化多语言11
	 */
	private String proglanglang11;

	/**
	 * 国际化多语言12
	 */
	private String proglanglang12;

	/**
	 * 国际化多语言13
	 */
	private String proglanglang13;

	/**
	 * 国际化多语言14
	 */
	private String proglanglang14;

	/**
	 * 国际化多语言15
	 */
	private String proglanglang15;

	/**
	 * 国际化多语言16
	 */
	private String proglanglang16;

	/**
	 * 国际化多语言17
	 */
	private String proglanglang17;

	/**
	 * 国际化多语言18
	 */
	private String proglanglang18;

	/**
	 * 国际化多语言19
	 */
	private String proglanglang19;

	/**
	 * 国际化多语言20
	 */
	private String proglanglang20;

}
