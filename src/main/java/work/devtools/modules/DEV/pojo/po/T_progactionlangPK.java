package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_progactionlangPK implements Serializable {


	/**
	 * 程序编号
	 */
	private String progactionlang01;

	/**
	 * 按钮编号
	 */
	private String progactionlang02;

	/**
	 * 国际化多语言
	 */
	private String progactionlang03;



	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		T_progactionlangPK that = (T_progactionlangPK) o;
		return Objects.equals(progactionlang01, that.progactionlang01) &&
				Objects.equals(progactionlang02, that.progactionlang02) &&
				Objects.equals(progactionlang03, that.progactionlang03);
	}

	@Override
	public int hashCode() {
		return Objects.hash(progactionlang01, progactionlang02, progactionlang03);
	}
}
