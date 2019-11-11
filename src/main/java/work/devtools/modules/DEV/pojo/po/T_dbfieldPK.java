package work.devtools.modules.DEV.pojo.po;

import lombok.Data;

import java.io.Serializable;


/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-18
 **/
@Data
public class T_dbfieldPK implements Serializable{

    private String dbfield01;


    private String dbfield02;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        T_dbfieldPK that = (T_dbfieldPK) o;

        if (dbfield01 != null ? !dbfield01.equals(that.dbfield01) : that.dbfield01 != null) return false;
        return dbfield02 != null ? dbfield02.equals(that.dbfield02) : that.dbfield02 == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (dbfield01 != null ? dbfield01.hashCode() : 0);
        result = 31 * result + (dbfield02 != null ? dbfield02.hashCode() : 0);
        return result;
    }

}
