package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_viewlangPK implements Serializable {


	/**
	 * 界面编号
	 */
	private String viewlang01;

	/**
	 * 栏位id
	 */
	private String viewlang02;

	/**
	 * 国际化多语言编号
	 */
	private String viewlang03;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		T_viewlangPK that = (T_viewlangPK) o;
		return Objects.equals(viewlang01, that.viewlang01) &&
				Objects.equals(viewlang02, that.viewlang02) &&
				Objects.equals(viewlang03, that.viewlang03);
	}

	@Override
	public int hashCode() {
		return Objects.hash(viewlang01, viewlang02, viewlang03);
	}
}
