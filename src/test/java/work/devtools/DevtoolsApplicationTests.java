package work.devtools;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import work.devtools.common.utils.DbUtil;
import work.devtools.common.utils.SpringUtil;
import work.devtools.modules.DEV.dao.T_companyDao;
import work.devtools.modules.DEV.pojo.dto.Dev_company;
import work.devtools.modules.DEV.pojo.dto.Dev_legal;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.SQLException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DevtoolsApplicationTests {

    @Test
    public void contextLoads() throws InvocationTargetException, IllegalAccessException {
        T_companyDao bean = SpringUtil.getBean(T_companyDao.class);

        System.out.print(bean);





    }

    @Test
    public void  test() throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException, IOException, SQLException, NoSuchMethodException {
        //po
        Dev_legal dev_legal = new Dev_legal();
        dev_legal.setLegal01("003");
        dev_legal.setLegal02("苏明成");
        String tableName = "t_legal";
        String mapper = "Dev_legalMapper";

        DbUtil.saveAndFlush(dev_legal,tableName,mapper);
        /*Class c = Class.forName("work.devtools.modules.DEV.mappers.Dev_legalMapper");
        Package aPackage = c.getPackage();
        String pkgName = aPackage.getName();

        String name = c.getName();
        Method[] declaredMethods = c.getDeclaredMethods();
        Dev_legal dev_legal = new Dev_legal();
        dev_legal.setLegal01("002");
        dev_legal.setLegal02("003");
        for(Method method:declaredMethods){
//            String instance = c.getField("INSTANCE");
            //TODO
            Object invoke = method.invoke(c.getField("INSTANCE"), dev_legal);
            boolean contains = method.getName().contains("2T_");
            if(contains){
                DbUtil.saveAndFlush(invoke,"t_legalDao");
                break;
            }
        }

        System.out.print("name: "+name);
        System.out.print("pkgName: "+pkgName);*/
    }



}
