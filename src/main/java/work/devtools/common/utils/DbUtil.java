package work.devtools.common.utils;


import org.mapstruct.factory.Mappers;
import org.springframework.data.jpa.repository.JpaRepository;
import work.devtools.modules.DEV.pojo.dto.Dev_company;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;


/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:  增删改查工具类
 * @create: 2019-04-02
 **/
public class DbUtil  {


    /**
     * saveAndFlush
     * @param dto   传入的dto
     * @param tableName  表名
     * @param mapper
     * @param <T>
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws SQLException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    public   static <T> void saveAndFlush(T dto,String tableName,String mapper) throws ClassNotFoundException, IOException, SQLException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
//        //Dao实例
        JpaRepository dao = (JpaRepository)SpringUtil.getBean(tableName + "Dao");
        Class aClass =  Class.forName("work.devtools.modules.DEV.mappers." + mapper);
        String dtoName = dto.getClass().getSimpleName();
        //首字母小写
        String dtoStr = toLowerCaseFirstOne(dtoName);
        //表名首字母大写
        String poStr = toUpperCaseFirstOne(tableName);

        String s = dtoStr + "To" + poStr;




      /* Method declaredMethod = aClass.getDeclaredMethod(s,dto.getClass());
        Object mapper1 = Mappers.getMapper(aClass);
        Object invoke = declaredMethod.invoke(mapper1, dto);
        dao.saveAndFlush(invoke);*/

        //declaredMethod.invoke()
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for(Method method:declaredMethods){
            Object mapper1 = Mappers.getMapper(aClass);
            Object invoke = method.invoke(mapper1, dto);
            boolean contains = method.getName().contains("ToT");
            if(contains){
                dao.saveAndFlush(invoke);
                break;
            }
        }



    }

    /**
     * 字符串首字母小写
     * @param str
     * @return
     */
    private static String toLowerCaseFirstOne(String str) {
        if(Character.isLowerCase(str.charAt(0))){
            return str;
        }else{
            return (new StringBuilder()).append(Character.toLowerCase(str.charAt(0))).append(str.substring(1)).toString();
        }
    }

    /**
     * 字符串首字母大写
     * @param s
     * @return
     */
    private static String toUpperCaseFirstOne(String s) {
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
    }

}
