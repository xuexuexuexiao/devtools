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
 * 程序模板
 *
 * @author xxx
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_progtemplates")
public class T_progtemplates implements Serializable {

	/**
	 * 模板编号
	 */
	@Id
//	@GeneratedValue(generator = "JDBC")
	private String progtemplates01;

	/**
	 * 模板名称
	 */
	private String progtemplates02;

	/**
	 * 模板名称2
	 */
	private String progtemplates03;

	/**
	 * nouse
	 */
	private String progtemplates60;

	/**
	 * nouse
	 */
	private String progtemplates61;

	/**
	 * nouse
	 */
	private String progtemplates62;

	/**
	 * nouse
	 */
	private String progtemplates63;

	/**
	 * nouse
	 */
	private String progtemplates64;

	/**
	 * nouse
	 */
	private String progtemplates65;

	/**
	 * nouse
	 */
	private String progtemplates66;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates67;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates68;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates69;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates70;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates71;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates72;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates73;

	/**
	 * nouse
	 */
	private BigDecimal progtemplates74;

	/**
	 * nouse
	 */
	private String progtemplates75;

	/**
	 * nouse
	 */
	private String progtemplates76;

	/**
	 * nouse
	 */
	private String progtemplates77;

	/**
	 * nouse
	 */
	private String progtemplates78;

	/**
	 * nouse
	 */
	private String progtemplates79;

	/**
	 * nouse
	 */
	private String progtemplates80;

	/**
	 * nouse
	 */
	private String progtemplates81;

	/**
	 * nouse
	 */
	private String progtemplates82;

	/**
	 * nouse
	 */
	private String progtemplates83;

	/**
	 * nouse
	 */
	private String progtemplates84;

	/**
	 * nouse
	 */
	private Date progtemplates85;

	/**
	 * nouse
	 */
	private Date progtemplates86;

	/**
	 * nouse
	 */
	private Date progtemplates87;

	/**
	 * nouse
	 */
	private Date progtemplates88;

	/**
	 * nouse
	 */
	private Date progtemplates89;

	/**
	 * nouse
	 */
	private Date progtemplates90;

	/**
	 * 基础资料状况码
	 */
	private String progtemplatesstatus;

	/**
	 * 细颗粒权限码
	 */
	private String progtemplatesauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String progtemplatescreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date progtemplatescred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String progtemplatesmodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date progtemplatesmodd;

	/**
	 * 法人
	 */
	private String progtemplateslegal;

	/**
	 * 公司
	 */
	private String progtemplatescompany;

	/**
	 * 国际化多语言1
	 */
	private String progtemplateslang01;

	/**
	 * 国际化多语言2
	 */
	private String progtemplateslang02;

	/**
	 * 国际化多语言3
	 */
	private String progtemplateslang03;

	/**
	 * 国际化多语言4
	 */
	private String progtemplateslang04;

	/**
	 * 国际化多语言5
	 */
	private String progtemplateslang05;

	/**
	 * 国际化多语言6
	 */
	private String progtemplateslang06;

	/**
	 * 国际化多语言7
	 */
	private String progtemplateslang07;

	/**
	 * 国际化多语言8
	 */
	private String progtemplateslang08;

	/**
	 * 国际化多语言9
	 */
	private String progtemplateslang09;

	/**
	 * 国际化多语言10
	 */
	private String progtemplateslang10;

	/**
	 * 国际化多语言11
	 */
	private String progtemplateslang11;

	/**
	 * 国际化多语言12
	 */
	private String progtemplateslang12;

	/**
	 * 国际化多语言13
	 */
	private String progtemplateslang13;

	/**
	 * 国际化多语言14
	 */
	private String progtemplateslang14;

	/**
	 * 国际化多语言15
	 */
	private String progtemplateslang15;

	/**
	 * 国际化多语言16
	 */
	private String progtemplateslang16;

	/**
	 * 国际化多语言17
	 */
	private String progtemplateslang17;

	/**
	 * 国际化多语言18
	 */
	private String progtemplateslang18;

	/**
	 * 国际化多语言19
	 */
	private String progtemplateslang19;

	/**
	 * 国际化多语言20
	 */
	private String progtemplateslang20;

}
