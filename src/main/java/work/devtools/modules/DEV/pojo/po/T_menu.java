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
 * 目录表
 *
 * @author huxiaoxue
 * @date 2019-04-11
 */
@Entity
@Data
@EntityListeners(AuditingEntityListener.class)
@Table(name = "t_menu")
public class T_menu implements Serializable {

	/**
	 * 目录编号
	 */
	@Id
	private String menu01;

	/**
	 * 序号
	 */
	private Integer menu02;

	/**
	 * 程序编号
	 */
	private String menu03;

	/**
	 * nouse
	 */
	private String menu60;

	/**
	 * nouse
	 */
	private String menu61;

	/**
	 * nouse
	 */
	private String menu62;

	/**
	 * nouse
	 */
	private String menu63;

	/**
	 * nouse
	 */
	private String menu64;

	/**
	 * nouse
	 */
	private String menu65;

	/**
	 * nouse
	 */
	private String menu66;

	/**
	 * nouse
	 */
	private BigDecimal menu67;

	/**
	 * nouse
	 */
	private BigDecimal menu68;

	/**
	 * nouse
	 */
	private BigDecimal menu69;

	/**
	 * nouse
	 */
	private BigDecimal menu70;

	/**
	 * nouse
	 */
	private BigDecimal menu71;

	/**
	 * nouse
	 */
	private BigDecimal menu72;

	/**
	 * nouse
	 */
	private BigDecimal menu73;

	/**
	 * nouse
	 */
	private BigDecimal menu74;

	/**
	 * nouse
	 */
	private String menu75;

	/**
	 * nouse
	 */
	private String menu76;

	/**
	 * nouse
	 */
	private String menu77;

	/**
	 * nouse
	 */
	private String menu78;

	/**
	 * nouse
	 */
	private String menu79;

	/**
	 * nouse
	 */
	private String menu80;

	/**
	 * nouse
	 */
	private String menu81;

	/**
	 * nouse
	 */
	private String menu82;

	/**
	 * nouse
	 */
	private String menu83;

	/**
	 * nouse
	 */
	private String menu84;

	/**
	 * nouse
	 */
	private Date menu85;

	/**
	 * nouse
	 */
	private Date menu86;

	/**
	 * nouse
	 */
	private Date menu87;

	/**
	 * nouse
	 */
	private Date menu88;

	/**
	 * nouse
	 */
	private Date menu89;

	/**
	 * nouse
	 */
	private Date menu90;

	/**
	 * 基础资料状况码
	 */
	private String menustatus;

	/**
	 * 细颗粒权限码
	 */
	private String menuauthcode;

	/**
	 * 创建人
	 */
	@CreatedBy
	private String menucreu;

	/**
	 * 创建时间
	 */
	@CreatedDate
	private Date menucred;

	/**
	 * 更新人
	 */
	@LastModifiedBy
	private String menumodu;

	/**
	 * 更新时间
	 */
	@LastModifiedDate
	private Date menumodd;

	/**
	 * 法人
	 */
	private String menulegal;

	/**
	 * 公司
	 */
	private String menucompany;

	/**
	 * 国际化多语言1
	 */
	private String menulang01;

	/**
	 * 国际化多语言2
	 */
	private String menulang02;

	/**
	 * 国际化多语言3
	 */
	private String menulang03;

	/**
	 * 国际化多语言4
	 */
	private String menulang04;

	/**
	 * 国际化多语言5
	 */
	private String menulang05;

	/**
	 * 国际化多语言6
	 */
	private String menulang06;

	/**
	 * 国际化多语言7
	 */
	private String menulang07;

	/**
	 * 国际化多语言8
	 */
	private String menulang08;

	/**
	 * 国际化多语言9
	 */
	private String menulang09;

	/**
	 * 国际化多语言10
	 */
	private String menulang10;

	/**
	 * 国际化多语言11
	 */
	private String menulang11;

	/**
	 * 国际化多语言12
	 */
	private String menulang12;

	/**
	 * 国际化多语言13
	 */
	private String menulang13;

	/**
	 * 国际化多语言14
	 */
	private String menulang14;

	/**
	 * 国际化多语言15
	 */
	private String menulang15;

	/**
	 * 国际化多语言16
	 */
	private String menulang16;

	/**
	 * 国际化多语言17
	 */
	private String menulang17;

	/**
	 * 国际化多语言18
	 */
	private String menulang18;

	/**
	 * 国际化多语言19
	 */
	private String menulang19;

	/**
	 * 国际化多语言20
	 */
	private String menulang20;

}
