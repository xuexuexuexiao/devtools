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
@Table(name = "t_progaction")
@IdClass(T_progactionPK.class)
@EntityListeners(AuditingEntityListener.class)
public class T_progaction  implements Serializable {

	/**
	 * 程序编号
	 */
	@Id
	private String progaction01;

	/**
	 * 按钮编号
	 */
	@Id
	private String progaction02;

	/**
	 * nouse
	 */
	private String progaction03;

	/**
	 * nouse
	 */
	private String progaction60;

	/**
	 * nouse
	 */
	private String progaction61;

	/**
	 * nouse
	 */
	private String progaction62;

	/**
	 * nouse
	 */
	private String progaction63;

	/**
	 * nouse
	 */
	private String progaction64;

	/**
	 * nouse
	 */
	private String progaction65;

	/**
	 * nouse
	 */
	private String progaction66;

	/**
	 * nouse
	 */
	private BigDecimal progaction67;

	/**
	 * nouse
	 */
	private BigDecimal progaction68;

	/**
	 * nouse
	 */
	private BigDecimal progaction69;

	/**
	 * nouse
	 */
	private BigDecimal progaction70;

	/**
	 * nouse
	 */
	private BigDecimal progaction71;

	/**
	 * nouse
	 */
	private BigDecimal progaction72;

	/**
	 * nouse
	 */
	private BigDecimal progaction73;

	/**
	 * nouse
	 */
	private BigDecimal progaction74;

	/**
	 * nouse
	 */
	private String progaction75;

	/**
	 * nouse
	 */
	private String progaction76;

	/**
	 * nouse
	 */
	private String progaction77;

	/**
	 * nouse
	 */
	private String progaction78;

	/**
	 * nouse
	 */
	private String progaction79;

	/**
	 * nouse
	 */
	private String progaction80;

	/**
	 * nouse
	 */
	private String progaction81;

	/**
	 * nouse
	 */
	private String progaction82;

	/**
	 * nouse
	 */
	private String progaction83;

	/**
	 * nouse
	 */
	private String progaction84;

	/**
	 * nouse
	 */
	private Date progaction85;

	/**
	 * nouse
	 */
	private Date progaction86;

	/**
	 * nouse
	 */
	private Date progaction87;

	/**
	 * nouse
	 */
	private Date progaction88;

	/**
	 * nouse
	 */
	private Date progaction89;

	/**
	 * nouse
	 */
	private Date progaction90;

	/**
	 * 基础资料状况码
	 */
	private String progactionstatus;

	/**
	 * 细颗粒权限码
	 */
	private String progactionauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progactioncreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progactioncred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progactionmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progactionmodd;

	/**
	 * 法人
	 */
	private String progactionlegal;

	/**
	 * 公司
	 */
	private String progactioncompany;

	/**
	 * 国际化多语言1
	 */
	private String progactionlang01;

	/**
	 * 国际化多语言2
	 */
	private String progactionlang02;

	/**
	 * 国际化多语言3
	 */
	private String progactionlang03;

	/**
	 * 国际化多语言4
	 */
	private String progactionlang04;

	/**
	 * 国际化多语言5
	 */
	private String progactionlang05;

	/**
	 * 国际化多语言6
	 */
	private String progactionlang06;

	/**
	 * 国际化多语言7
	 */
	private String progactionlang07;

	/**
	 * 国际化多语言8
	 */
	private String progactionlang08;

	/**
	 * 国际化多语言9
	 */
	private String progactionlang09;

	/**
	 * 国际化多语言10
	 */
	private String progactionlang10;

	/**
	 * 国际化多语言11
	 */
	private String progactionlang11;

	/**
	 * 国际化多语言12
	 */
	private String progactionlang12;

	/**
	 * 国际化多语言13
	 */
	private String progactionlang13;

	/**
	 * 国际化多语言14
	 */
	private String progactionlang14;

	/**
	 * 国际化多语言15
	 */
	private String progactionlang15;

	/**
	 * 国际化多语言16
	 */
	private String progactionlang16;

	/**
	 * 国际化多语言17
	 */
	private String progactionlang17;

	/**
	 * 国际化多语言18
	 */
	private String progactionlang18;

	/**
	 * 国际化多语言19
	 */
	private String progactionlang19;

	/**
	 * 国际化多语言20
	 */
	private String progactionlang20;

}
