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
 * 模块表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_module")
public class T_module implements Serializable {

	/**
	 * 模块编号
	 */
	@Id
	private String module01;

	/**
	 * 模块名称
	 */
	private String module02;

	/**
	 * 模块名称2
	 */
	private String module03;

	/**
	 * PO路径
	 */
	private String module04;

	/**
	 * Dao路径
	 */
	private String module05;

	/**
	 * Controller路径
	 */
	private String module06;

	/**
	 * Service 路径
	 */
	private String module07;

	/**
	 * UI路径
	 */
	private String module08;

	/**
	 * VUE路径
	 */
	private String module09;

	/**
	 * DTO路径
	 */
	private String module10;

	/**
	 * Mapper路径
	 */
	private String module11;

	/**
	 * nouse
	 */
	private String module60;

	/**
	 * nouse
	 */
	private String module61;

	/**
	 * nouse
	 */
	private String module62;

	/**
	 * nouse
	 */
	private String module63;

	/**
	 * nouse
	 */
	private String module64;

	/**
	 * nouse
	 */
	private String module65;

	/**
	 * nouse
	 */
	private String module66;

	/**
	 * nouse
	 */
	private BigDecimal module67;

	/**
	 * nouse
	 */
	private BigDecimal module68;

	/**
	 * nouse
	 */
	private BigDecimal module69;

	/**
	 * nouse
	 */
	private BigDecimal module70;

	/**
	 * nouse
	 */
	private BigDecimal module71;

	/**
	 * nouse
	 */
	private BigDecimal module72;

	/**
	 * nouse
	 */
	private BigDecimal module73;

	/**
	 * nouse
	 */
	private BigDecimal module74;

	/**
	 * nouse
	 */
	private String module75;

	/**
	 * nouse
	 */
	private String module76;

	/**
	 * nouse
	 */
	private String module77;

	/**
	 * nouse
	 */
	private String module78;

	/**
	 * nouse
	 */
	private String module79;

	/**
	 * nouse
	 */
	private String module80;

	/**
	 * nouse
	 */
	private String module81;

	/**
	 * nouse
	 */
	private String module82;

	/**
	 * nouse
	 */
	private String module83;

	/**
	 * nouse
	 */
	private String module84;

	/**
	 * nouse
	 */
	private Date module85;

	/**
	 * nouse
	 */
	private Date module86;

	/**
	 * nouse
	 */
	private Date module87;

	/**
	 * nouse
	 */
	private Date module88;

	/**
	 * nouse
	 */
	private Date module89;

	/**
	 * nouse
	 */
	private Date module90;

	/**
	 * 基础资料状况码
	 */
	private String modulestatus;

	/**
	 * 细颗粒权限码
	 */
	private String moduleauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String modulecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date modulecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String modulemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date modulemodd;

	/**
	 * 法人
	 */
	private String modulelegal;

	/**
	 * 公司
	 */
	private String modulecompany;

	/**
	 * 国际化多语言1
	 */
	private String modulelang01;

	/**
	 * 国际化多语言2
	 */
	private String modulelang02;

	/**
	 * 国际化多语言3
	 */
	private String modulelang03;

	/**
	 * 国际化多语言4
	 */
	private String modulelang04;

	/**
	 * 国际化多语言5
	 */
	private String modulelang05;

	/**
	 * 国际化多语言6
	 */
	private String modulelang06;

	/**
	 * 国际化多语言7
	 */
	private String modulelang07;

	/**
	 * 国际化多语言8
	 */
	private String modulelang08;

	/**
	 * 国际化多语言9
	 */
	private String modulelang09;

	/**
	 * 国际化多语言10
	 */
	private String modulelang10;

	/**
	 * 国际化多语言11
	 */
	private String modulelang11;

	/**
	 * 国际化多语言12
	 */
	private String modulelang12;

	/**
	 * 国际化多语言13
	 */
	private String modulelang13;

	/**
	 * 国际化多语言14
	 */
	private String modulelang14;

	/**
	 * 国际化多语言15
	 */
	private String modulelang15;

	/**
	 * 国际化多语言16
	 */
	private String modulelang16;

	/**
	 * 国际化多语言17
	 */
	private String modulelang17;

	/**
	 * 国际化多语言18
	 */
	private String modulelang18;

	/**
	 * 国际化多语言19
	 */
	private String modulelang19;

	/**
	 * 国际化多语言20
	 */
	private String modulelang20;

}
