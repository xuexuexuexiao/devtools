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
@Table(name = "t_querylinelang")
@IdClass(T_querylinelangPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_querylinelang  implements Serializable {

	/**
	 * 动态查询编号
	 */
	@Id
	private String querylinelang01;

	/**
	 * 界面栏位ID
	 */
	@Id
	private String querylinelang02;

	/**
	 * 语言编号
	 */
	@Id
	private String querylinelang03;

	/**
	 * 界面栏位名称
	 */
	private String querylinelang04;

	/**
	 * nouse
	 */
	private String querylinelang60;

	/**
	 * nouse
	 */
	private String querylinelang61;

	/**
	 * nouse
	 */
	private String querylinelang62;

	/**
	 * nouse
	 */
	private String querylinelang63;

	/**
	 * nouse
	 */
	private String querylinelang64;

	/**
	 * nouse
	 */
	private String querylinelang65;

	/**
	 * nouse
	 */
	private String querylinelang66;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang67;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang68;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang69;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang70;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang71;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang72;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang73;

	/**
	 * nouse
	 */
	private BigDecimal querylinelang74;

	/**
	 * nouse
	 */
	private String querylinelang75;

	/**
	 * nouse
	 */
	private String querylinelang76;

	/**
	 * nouse
	 */
	private String querylinelang77;

	/**
	 * nouse
	 */
	private String querylinelang78;

	/**
	 * nouse
	 */
	private String querylinelang79;

	/**
	 * nouse
	 */
	private String querylinelang80;

	/**
	 * nouse
	 */
	private String querylinelang81;

	/**
	 * nouse
	 */
	private String querylinelang82;

	/**
	 * nouse
	 */
	private String querylinelang83;

	/**
	 * nouse
	 */
	private String querylinelang84;

	/**
	 * nouse
	 */
	private Date querylinelang85;

	/**
	 * nouse
	 */
	private Date querylinelang86;

	/**
	 * nouse
	 */
	private Date querylinelang87;

	/**
	 * nouse
	 */
	private Date querylinelang88;

	/**
	 * nouse
	 */
	private Date querylinelang89;

	/**
	 * nouse
	 */
	private Date querylinelang90;

	/**
	 * 基础资料状况码
	 */
	private String querylinelangstatus;

	/**
	 * 细颗粒权限码
	 */
	private String querylinelangauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String querylinelangcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date querylinelangcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String querylinelangmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date querylinelangmodd;

	/**
	 * 法人
	 */
	private String querylinelanglegal;

	/**
	 * 公司
	 */
	private String querylinelangcompany;

	/**
	 * 国际化多语言1
	 */
	private String querylinelanglang01;

	/**
	 * 国际化多语言2
	 */
	private String querylinelanglang02;

	/**
	 * 国际化多语言3
	 */
	private String querylinelanglang03;

	/**
	 * 国际化多语言4
	 */
	private String querylinelanglang04;

	/**
	 * 国际化多语言5
	 */
	private String querylinelanglang05;

	/**
	 * 国际化多语言6
	 */
	private String querylinelanglang06;

	/**
	 * 国际化多语言7
	 */
	private String querylinelanglang07;

	/**
	 * 国际化多语言8
	 */
	private String querylinelanglang08;

	/**
	 * 国际化多语言9
	 */
	private String querylinelanglang09;

	/**
	 * 国际化多语言10
	 */
	private String querylinelanglang10;

	/**
	 * 国际化多语言11
	 */
	private String querylinelanglang11;

	/**
	 * 国际化多语言12
	 */
	private String querylinelanglang12;

	/**
	 * 国际化多语言13
	 */
	private String querylinelanglang13;

	/**
	 * 国际化多语言14
	 */
	private String querylinelanglang14;

	/**
	 * 国际化多语言15
	 */
	private String querylinelanglang15;

	/**
	 * 国际化多语言16
	 */
	private String querylinelanglang16;

	/**
	 * 国际化多语言17
	 */
	private String querylinelanglang17;

	/**
	 * 国际化多语言18
	 */
	private String querylinelanglang18;

	/**
	 * 国际化多语言19
	 */
	private String querylinelanglang19;

	/**
	 * 国际化多语言20
	 */
	private String querylinelanglang20;

}
