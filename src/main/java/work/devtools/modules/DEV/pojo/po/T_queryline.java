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
 * 动态查询单身表
 *
 * @author xxx
 * @date 2019-04-16
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_queryline")
@IdClass(T_querylinePK.class)
public class T_queryline implements Serializable {

	/**
	 * 动态查询编号
	 */
	@Id
	private String queryline01;

	/**
	 * 界面栏位ID
	 */
	@Id
	private String queryline02;

	/**
	 * 控件类型
	 */
	private String queryline03;

	/**
	 * 表别名
	 */
	private String queryline04;

	/**
	 * 表
	 */
	private String queryline05;

	/**
	 * 字段
	 */
	private String queryline06;

	/**
	 * 数据库类型
	 */
	private String queryline07;

	/**
	 * 可查询否
	 */
	private String queryline08;

	/**
	 * Where条件位置
	 */
	private String queryline09;

	/**
	 * quickquerycode（搜索提示）
	 */
	private String queryline10;

	/**
	 * nouse
	 */
	private String queryline60;

	/**
	 * nouse
	 */
	private String queryline61;

	/**
	 * nouse
	 */
	private String queryline62;

	/**
	 * nouse
	 */
	private String queryline63;

	/**
	 * nouse
	 */
	private String queryline64;

	/**
	 * nouse
	 */
	private String queryline65;

	/**
	 * nouse
	 */
	private String queryline66;

	/**
	 * nouse
	 */
	private BigDecimal queryline67;

	/**
	 * nouse
	 */
	private BigDecimal queryline68;

	/**
	 * nouse
	 */
	private BigDecimal queryline69;

	/**
	 * nouse
	 */
	private BigDecimal queryline70;

	/**
	 * nouse
	 */
	private BigDecimal queryline71;

	/**
	 * nouse
	 */
	private BigDecimal queryline72;

	/**
	 * nouse
	 */
	private BigDecimal queryline73;

	/**
	 * nouse
	 */
	private BigDecimal queryline74;

	/**
	 * nouse
	 */
	private String queryline75;

	/**
	 * nouse
	 */
	private String queryline76;

	/**
	 * nouse
	 */
	private String queryline77;

	/**
	 * nouse
	 */
	private String queryline78;

	/**
	 * nouse
	 */
	private String queryline79;

	/**
	 * nouse
	 */
	private String queryline80;

	/**
	 * nouse
	 */
	private String queryline81;

	/**
	 * nouse
	 */
	private String queryline82;

	/**
	 * nouse
	 */
	private String queryline83;

	/**
	 * nouse
	 */
	private String queryline84;

	/**
	 * nouse
	 */
	private Date queryline85;

	/**
	 * nouse
	 */
	private Date queryline86;

	/**
	 * nouse
	 */
	private Date queryline87;

	/**
	 * nouse
	 */
	private Date queryline88;

	/**
	 * nouse
	 */
	private Date queryline89;

	/**
	 * nouse
	 */
	private Date queryline90;

	/**
	 * 基础资料状况码
	 */
	private String querylinestatus;

	/**
	 * 细颗粒权限码
	 */
	private String querylineauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String querylinecreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date querylinecred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String querylinemodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date querylinemodd;

	/**
	 * 法人
	 */
	private String querylinelegal;

	/**
	 * 公司
	 */
	private String querylinecompany;

	/**
	 * 国际化多语言1
	 */
	private String querylinelang01;

	/**
	 * 国际化多语言2
	 */
	private String querylinelang02;

	/**
	 * 国际化多语言3
	 */
	private String querylinelang03;

	/**
	 * 国际化多语言4
	 */
	private String querylinelang04;

	/**
	 * 国际化多语言5
	 */
	private String querylinelang05;

	/**
	 * 国际化多语言6
	 */
	private String querylinelang06;

	/**
	 * 国际化多语言7
	 */
	private String querylinelang07;

	/**
	 * 国际化多语言8
	 */
	private String querylinelang08;

	/**
	 * 国际化多语言9
	 */
	private String querylinelang09;

	/**
	 * 国际化多语言10
	 */
	private String querylinelang10;

	/**
	 * 国际化多语言11
	 */
	private String querylinelang11;

	/**
	 * 国际化多语言12
	 */
	private String querylinelang12;

	/**
	 * 国际化多语言13
	 */
	private String querylinelang13;

	/**
	 * 国际化多语言14
	 */
	private String querylinelang14;

	/**
	 * 国际化多语言15
	 */
	private String querylinelang15;

	/**
	 * 国际化多语言16
	 */
	private String querylinelang16;

	/**
	 * 国际化多语言17
	 */
	private String querylinelang17;

	/**
	 * 国际化多语言18
	 */
	private String querylinelang18;

	/**
	 * 国际化多语言19
	 */
	private String querylinelang19;

	/**
	 * 国际化多语言20
	 */
	private String querylinelang20;

}
