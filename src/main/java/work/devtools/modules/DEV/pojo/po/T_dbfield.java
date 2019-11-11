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
 * 数据库表字段
 *
 * @author xxx
 * @date 2019-04-23
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_dbfield")
@IdClass(T_dbfieldPK.class)
public class T_dbfield implements Serializable {

	/**
	 * 表
	 */
	@Id
//	@GeneratedValue(generator = "JDBC")
	private String dbfield01;

	/**
	 * 字段
	 */
	private String dbfield02;

	/**
	 * 基础数据类型
	 */
	private String dbfield03;

	/**
	 * 长度
	 */
	private String dbfield04;

	/**
	 * key 否
	 */
	private String dbfield05;

	/**
	 * 不允许为null
	 */
	private String dbfield06;

	/**
	 * 缺省值
	 */
	private String dbfield07;

	/**
	 * nouse
	 */
	private String dbfield60;

	/**
	 * nouse
	 */
	private String dbfield61;

	/**
	 * nouse
	 */
	private String dbfield62;

	/**
	 * nouse
	 */
	private String dbfield63;

	/**
	 * nouse
	 */
	private String dbfield64;

	/**
	 * nouse
	 */
	private String dbfield65;

	/**
	 * nouse
	 */
	private String dbfield66;

	/**
	 * nouse
	 */
	private BigDecimal dbfield67;

	/**
	 * nouse
	 */
	private BigDecimal dbfield68;

	/**
	 * nouse
	 */
	private BigDecimal dbfield69;

	/**
	 * nouse
	 */
	private BigDecimal dbfield70;

	/**
	 * nouse
	 */
	private BigDecimal dbfield71;

	/**
	 * nouse
	 */
	private BigDecimal dbfield72;

	/**
	 * nouse
	 */
	private BigDecimal dbfield73;

	/**
	 * nouse
	 */
	private BigDecimal dbfield74;

	/**
	 * nouse
	 */
	private String dbfield75;

	/**
	 * nouse
	 */
	private String dbfield76;

	/**
	 * nouse
	 */
	private String dbfield77;

	/**
	 * nouse
	 */
	private String dbfield78;

	/**
	 * nouse
	 */
	private String dbfield79;

	/**
	 * nouse
	 */
	private String dbfield80;

	/**
	 * nouse
	 */
	private String dbfield81;

	/**
	 * nouse
	 */
	private String dbfield82;

	/**
	 * nouse
	 */
	private String dbfield83;

	/**
	 * nouse
	 */
	private String dbfield84;

	/**
	 * nouse
	 */
	private Date dbfield85;

	/**
	 * nouse
	 */
	private Date dbfield86;

	/**
	 * nouse
	 */
	private Date dbfield87;

	/**
	 * nouse
	 */
	private Date dbfield88;

	/**
	 * nouse
	 */
	private Date dbfield89;

	/**
	 * nouse
	 */
	private Date dbfield90;

	/**
	 * 基础资料状况码
	 */
	private String dbfieldstatus;

	/**
	 * 细颗粒权限码
	 */
	private String dbfieldauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String dbfieldcreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date dbfieldcred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String dbfieldmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date dbfieldmodd;

	/**
	 * 法人
	 */
	private String dbfieldlegal;

	/**
	 * 公司
	 */
	private String dbfieldcompany;

	/**
	 * 国际化多语言1
	 */
	private String dbfieldlang01;

	/**
	 * 国际化多语言2
	 */
	private String dbfieldlang02;

	/**
	 * 国际化多语言3
	 */
	private String dbfieldlang03;

	/**
	 * 国际化多语言4
	 */
	private String dbfieldlang04;

	/**
	 * 国际化多语言5
	 */
	private String dbfieldlang05;

	/**
	 * 国际化多语言6
	 */
	private String dbfieldlang06;

	/**
	 * 国际化多语言7
	 */
	private String dbfieldlang07;

	/**
	 * 国际化多语言8
	 */
	private String dbfieldlang08;

	/**
	 * 国际化多语言9
	 */
	private String dbfieldlang09;

	/**
	 * 国际化多语言10
	 */
	private String dbfieldlang10;

	/**
	 * 国际化多语言11
	 */
	private String dbfieldlang11;

	/**
	 * 国际化多语言12
	 */
	private String dbfieldlang12;

	/**
	 * 国际化多语言13
	 */
	private String dbfieldlang13;

	/**
	 * 国际化多语言14
	 */
	private String dbfieldlang14;

	/**
	 * 国际化多语言15
	 */
	private String dbfieldlang15;

	/**
	 * 国际化多语言16
	 */
	private String dbfieldlang16;

	/**
	 * 国际化多语言17
	 */
	private String dbfieldlang17;

	/**
	 * 国际化多语言18
	 */
	private String dbfieldlang18;

	/**
	 * 国际化多语言19
	 */
	private String dbfieldlang19;

	/**
	 * 国际化多语言20
	 */
	private String dbfieldlang20;

}
