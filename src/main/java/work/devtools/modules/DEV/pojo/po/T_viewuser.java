package work.devtools.modules.DEV.pojo.po;


import lombok.Data;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 用户界面
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_viewuser")
@IdClass(T_viewuserPK.class)
public class T_viewuser implements Serializable {

	/**
	 * 界面编号
	 */
	@Id
	private String viewuser01;

	/**
	 * 栏位id
	 */
	@Id
	private String viewuser02;

	/**
	 * 用户编号
	 */
	@Id
	private String viewuser03;

	/**
	 * 隐藏否
	 */
	private String viewuser04;

	/**
	 * 可录否
	 */
	private String viewuser05;

	/**
	 * nouse
	 */
	private String viewuser60;

	/**
	 * nouse
	 */
	private String viewuser61;

	/**
	 * nouse
	 */
	private String viewuser62;

	/**
	 * nouse
	 */
	private String viewuser63;

	/**
	 * nouse
	 */
	private String viewuser64;

	/**
	 * nouse
	 */
	private String viewuser65;

	/**
	 * nouse
	 */
	private String viewuser66;

	/**
	 * nouse
	 */
	private BigDecimal viewuser67;

	/**
	 * nouse
	 */
	private BigDecimal viewuser68;

	/**
	 * nouse
	 */
	private BigDecimal viewuser69;

	/**
	 * nouse
	 */
	private BigDecimal viewuser70;

	/**
	 * nouse
	 */
	private BigDecimal viewuser71;

	/**
	 * nouse
	 */
	private BigDecimal viewuser72;

	/**
	 * nouse
	 */
	private BigDecimal viewuser73;

	/**
	 * nouse
	 */
	private BigDecimal viewuser74;

	/**
	 * nouse
	 */
	private String viewuser75;

	/**
	 * nouse
	 */
	private String viewuser76;

	/**
	 * nouse
	 */
	private String viewuser77;

	/**
	 * nouse
	 */
	private String viewuser78;

	/**
	 * nouse
	 */
	private String viewuser79;

	/**
	 * nouse
	 */
	private String viewuser80;

	/**
	 * nouse
	 */
	private String viewuser81;

	/**
	 * nouse
	 */
	private String viewuser82;

	/**
	 * nouse
	 */
	private String viewuser83;

	/**
	 * nouse
	 */
	private String viewuser84;

	/**
	 * nouse
	 */
	private Date viewuser85;

	/**
	 * nouse
	 */
	private Date viewuser86;

	/**
	 * nouse
	 */
	private Date viewuser87;

	/**
	 * nouse
	 */
	private Date viewuser88;

	/**
	 * nouse
	 */
	private Date viewuser89;

	/**
	 * nouse
	 */
	private Date viewuser90;

	/**
	 * 基础资料状况码
	 */
	private String viewuserstatus;

	/**
	 * 细颗粒权限码
	 */
	private String viewuserauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String viewusercreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date viewusercred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String viewusermodu;

	/**
	 * 更新时间
	 */
	@CreatedDate
	private Date viewusermodd;

	/**
	 * 法人
	 */
	private String viewuserlegal;

	/**
	 * 公司
	 */
	private String viewusercompany;

	/**
	 * 国际化多语言1
	 */
	private String viewuserlang01;

	/**
	 * 国际化多语言2
	 */
	private String viewuserlang02;

	/**
	 * 国际化多语言3
	 */
	private String viewuserlang03;

	/**
	 * 国际化多语言4
	 */
	private String viewuserlang04;

	/**
	 * 国际化多语言5
	 */
	private String viewuserlang05;

	/**
	 * 国际化多语言6
	 */
	private String viewuserlang06;

	/**
	 * 国际化多语言7
	 */
	private String viewuserlang07;

	/**
	 * 国际化多语言8
	 */
	private String viewuserlang08;

	/**
	 * 国际化多语言9
	 */
	private String viewuserlang09;

	/**
	 * 国际化多语言10
	 */
	private String viewuserlang10;

	/**
	 * 国际化多语言11
	 */
	private String viewuserlang11;

	/**
	 * 国际化多语言12
	 */
	private String viewuserlang12;

	/**
	 * 国际化多语言13
	 */
	private String viewuserlang13;

	/**
	 * 国际化多语言14
	 */
	private String viewuserlang14;

	/**
	 * 国际化多语言15
	 */
	private String viewuserlang15;

	/**
	 * 国际化多语言16
	 */
	private String viewuserlang16;

	/**
	 * 国际化多语言17
	 */
	private String viewuserlang17;

	/**
	 * 国际化多语言18
	 */
	private String viewuserlang18;

	/**
	 * 国际化多语言19
	 */
	private String viewuserlang19;

	/**
	 * 国际化多语言20
	 */
	private String viewuserlang20;

}
