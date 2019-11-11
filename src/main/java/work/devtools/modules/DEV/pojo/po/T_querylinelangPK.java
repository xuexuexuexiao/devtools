package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_querylinelangPK implements Serializable {


	/**
	 * 动态查询编号
	 */
	private String querylinelang01;

	/**
	 * 界面栏位ID
	 */
	private String querylinelang02;

	/**
	 * 语言编号
	 */
	private String querylinelang03;


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		T_querylinelangPK that = (T_querylinelangPK) o;
		return Objects.equals(querylinelang01, that.querylinelang01) &&
				Objects.equals(querylinelang02, that.querylinelang02) &&
				Objects.equals(querylinelang03, that.querylinelang03);
	}

	@Override
	public int hashCode() {
		return Objects.hash(querylinelang01, querylinelang02, querylinelang03);
	}
}
