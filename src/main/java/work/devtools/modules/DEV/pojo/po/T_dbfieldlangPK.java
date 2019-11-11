package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;
import java.util.Objects;


@Data
public class T_dbfieldlangPK implements Serializable {


	private String dbfieldlang01;// '数据库',
	private String dbfieldlang02;// '表',
	private String dbfieldlang03;// '字段',
	private String dbfieldlang04;// '国际化多语言',


	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		T_dbfieldlangPK that = (T_dbfieldlangPK) o;
		return Objects.equals(dbfieldlang01, that.dbfieldlang01) &&
				Objects.equals(dbfieldlang02, that.dbfieldlang02) &&
				Objects.equals(dbfieldlang03, that.dbfieldlang03) &&
				Objects.equals(dbfieldlang04, that.dbfieldlang04);

	}

	@Override
	public int hashCode() {
		return Objects.hash(dbfieldlang01, dbfieldlang02, dbfieldlang03, dbfieldlang04);

	}
}
