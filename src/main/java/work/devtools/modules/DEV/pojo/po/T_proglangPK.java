package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_proglangPK implements Serializable {


	/**
	 * 程序编号
	 */
	private String proglang01;

	/**
	 * 国际化多语言编号
	 */
	private String proglang02;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		T_proglangPK that = (T_proglangPK) o;
		return Objects.equals(proglang01, that.proglang01) &&
				Objects.equals(proglang02, that.proglang02);
	}

	@Override
	public int hashCode() {
		return Objects.hash(proglang01, proglang02);
	}
}
