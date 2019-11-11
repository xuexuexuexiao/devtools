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
 * 动态查询单头表
 *
 * @author xxx
 * @date 2019-04-16
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_query")
public class T_query implements Serializable {

	/**
	 * 动态查询编号
	 */
	@Id
	private String query01;

	/**
	 * 查询类型
	 */
	private String query02;

	/**
	 * from SQL
	 */
	private String query03;

	/**
	 * where SQL
	 */
	private String query04;

	/**
	 * order by SQL
	 */
	private String query05;

	/**
	 * nouse
	 */
	private String query60;

	/**
	 * nouse
	 */
	private String query61;

	/**
	 * nouse
	 */
	private String query62;

	/**
	 * nouse
	 */
	private String query63;

	/**
	 * nouse
	 */
	private String query64;

	/**
	 * nouse
	 */
	private String query65;

	/**
	 * nouse
	 */
	private String query66;

	/**
	 * nouse
	 */
	private BigDecimal query67;

	/**
	 * nouse
	 */
	private BigDecimal query68;

	/**
	 * nouse
	 */
	private BigDecimal query69;

	/**
	 * nouse
	 */
	private BigDecimal query70;

	/**
	 * nouse
	 */
	private BigDecimal query71;

	/**
	 * nouse
	 */
	private BigDecimal query72;

	/**
	 * nouse
	 */
	private BigDecimal query73;

	/**
	 * nouse
	 */
	private BigDecimal query74;

	/**
	 * nouse
	 */
	private String query75;

	/**
	 * nouse
	 */
	private String query76;

	/**
	 * nouse
	 */
	private String query77;

	/**
	 * nouse
	 */
	private String query78;

	/**
	 * nouse
	 */
	private String query79;

	/**
	 * nouse
	 */
	private String query80;

	/**
	 * nouse
	 */
	private String query81;

	/**
	 * nouse
	 */
	private String query82;

	/**
	 * nouse
	 */
	private String query83;

	/**
	 * nouse
	 */
	private String query84;

	/**
	 * nouse
	 */
	private Date query85;

	/**
	 * nouse
	 */
	private Date query86;

	/**
	 * nouse
	 */
	private Date query87;

	/**
	 * nouse
	 */
	private Date query88;

	/**
	 * nouse
	 */
	private Date query89;

	/**
	 * nouse
	 */
	private Date query90;

	/**
	 * 基础资料状况码
	 */
	private String querystatus;

	/**
	 * 细颗粒权限码
	 */
	private String queryauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String querycreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date querycred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String querymodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date querymodd;

	/**
	 * 法人
	 */
	private String querylegal;

	/**
	 * 公司
	 */
	private String querycompany;

	/**
	 * 国际化多语言1
	 */
	private String querylang01;

	/**
	 * 国际化多语言2
	 */
	private String querylang02;

	/**
	 * 国际化多语言3
	 */
	private String querylang03;

	/**
	 * 国际化多语言4
	 */
	private String querylang04;

	/**
	 * 国际化多语言5
	 */
	private String querylang05;

	/**
	 * 国际化多语言6
	 */
	private String querylang06;

	/**
	 * 国际化多语言7
	 */
	private String querylang07;

	/**
	 * 国际化多语言8
	 */
	private String querylang08;

	/**
	 * 国际化多语言9
	 */
	private String querylang09;

	/**
	 * 国际化多语言10
	 */
	private String querylang10;

	/**
	 * 国际化多语言11
	 */
	private String querylang11;

	/**
	 * 国际化多语言12
	 */
	private String querylang12;

	/**
	 * 国际化多语言13
	 */
	private String querylang13;

	/**
	 * 国际化多语言14
	 */
	private String querylang14;

	/**
	 * 国际化多语言15
	 */
	private String querylang15;

	/**
	 * 国际化多语言16
	 */
	private String querylang16;

	/**
	 * 国际化多语言17
	 */
	private String querylang17;

	/**
	 * 国际化多语言18
	 */
	private String querylang18;

	/**
	 * 国际化多语言19
	 */
	private String querylang19;

	/**
	 * 国际化多语言20
	 */
	private String querylang20;

}
