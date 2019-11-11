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
 * 数据库表
 *
 * @author xxx
 * @date 2019-04-23
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_dbtable")
public class T_dbtable implements Serializable {

	/**
	 * 表
	 */
	@Id
//	@GeneratedValue(generator = "JDBC")
	private String dbtable01;

	/**
	 * 表名
	 */
	private String dbtable02;

	/**
	 * 备注
	 */
	private String dbtable03;

	/**
	 * 模块
	 */
	private String dbtable04;

	/**
	 * 国际化否
	 */
	private String dbtable05;

	/**
	 * PO类名
	 */
	private String dbtable06;

	/**
	 * DAO类名
	 */
	private String dbtable07;

	/**
	 * nouse
	 */
	private String dbtable60;

	/**
	 * nouse
	 */
	private String dbtable61;

	/**
	 * nouse
	 */
	private String dbtable62;

	/**
	 * nouse
	 */
	private String dbtable63;

	/**
	 * nouse
	 */
	private String dbtable64;

	/**
	 * nouse
	 */
	private String dbtable65;

	/**
	 * nouse
	 */
	private String dbtable66;

	/**
	 * nouse
	 */
	private BigDecimal dbtable67;

	/**
	 * nouse
	 */
	private BigDecimal dbtable68;

	/**
	 * nouse
	 */
	private BigDecimal dbtable69;

	/**
	 * nouse
	 */
	private BigDecimal dbtable70;

	/**
	 * nouse
	 */
	private BigDecimal dbtable71;

	/**
	 * nouse
	 */
	private BigDecimal dbtable72;

	/**
	 * nouse
	 */
	private BigDecimal dbtable73;

	/**
	 * nouse
	 */
	private BigDecimal dbtable74;

	/**
	 * nouse
	 */
	private String dbtable75;

	/**
	 * nouse
	 */
	private String dbtable76;

	/**
	 * nouse
	 */
	private String dbtable77;

	/**
	 * nouse
	 */
	private String dbtable78;

	/**
	 * nouse
	 */
	private String dbtable79;

	/**
	 * nouse
	 */
	private String dbtable80;

	/**
	 * nouse
	 */
	private String dbtable81;

	/**
	 * nouse
	 */
	private String dbtable82;

	/**
	 * nouse
	 */
	private String dbtable83;

	/**
	 * nouse
	 */
	private String dbtable84;

	/**
	 * nouse
	 */
	private Date dbtable85;

	/**
	 * nouse
	 */
	private Date dbtable86;

	/**
	 * nouse
	 */
	private Date dbtable87;

	/**
	 * nouse
	 */
	private Date dbtable88;

	/**
	 * nouse
	 */
	private Date dbtable89;

	/**
	 * nouse
	 */
	private Date dbtable90;

	/**
	 * 基础资料状况码
	 */
	private String dbtablestatus;

	/**
	 * 细颗粒权限码
	 */
	private String dbtableauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String dbtablecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date dbtablecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String dbtablemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date dbtablemodd;

	/**
	 * 法人
	 */
	private String dbtablelegal;

	/**
	 * 公司
	 */
	private String dbtablecompany;

	/**
	 * 国际化多语言1
	 */
	private String dbtablelang01;

	/**
	 * 国际化多语言2
	 */
	private String dbtablelang02;

	/**
	 * 国际化多语言3
	 */
	private String dbtablelang03;

	/**
	 * 国际化多语言4
	 */
	private String dbtablelang04;

	/**
	 * 国际化多语言5
	 */
	private String dbtablelang05;

	/**
	 * 国际化多语言6
	 */
	private String dbtablelang06;

	/**
	 * 国际化多语言7
	 */
	private String dbtablelang07;

	/**
	 * 国际化多语言8
	 */
	private String dbtablelang08;

	/**
	 * 国际化多语言9
	 */
	private String dbtablelang09;

	/**
	 * 国际化多语言10
	 */
	private String dbtablelang10;

	/**
	 * 国际化多语言11
	 */
	private String dbtablelang11;

	/**
	 * 国际化多语言12
	 */
	private String dbtablelang12;

	/**
	 * 国际化多语言13
	 */
	private String dbtablelang13;

	/**
	 * 国际化多语言14
	 */
	private String dbtablelang14;

	/**
	 * 国际化多语言15
	 */
	private String dbtablelang15;

	/**
	 * 国际化多语言16
	 */
	private String dbtablelang16;

	/**
	 * 国际化多语言17
	 */
	private String dbtablelang17;

	/**
	 * 国际化多语言18
	 */
	private String dbtablelang18;

	/**
	 * 国际化多语言19
	 */
	private String dbtablelang19;

	/**
	 * 国际化多语言20
	 */
	private String dbtablelang20;

}
