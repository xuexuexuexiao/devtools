package work.devtools.common.utils;


import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

/**
 * @author CPQ
 * @version V1.0
 * @ClassName:BeanUtil
 * @Description:
 * @date 2019/04/28
 */
public class BeanUtil {

    /**
     *  克隆
     * @param bean
     * @return
     */
    public static Object cloneBean(Object bean) throws IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        return BeanUtils.cloneBean(bean);
    }

    /**
     *  复制
     * @param target
     * @param source
     * @return
     */
    public static void copyProperties( Object target,Object source) throws InvocationTargetException, IllegalAccessException {
        BeanUtils.copyProperties(target, source);
    }

    /**
     *  设置属性
     * @param bean
     * @param name
     * @param value
     * @return
     */
    public static void setProperty(Object bean, String name, Object value) throws IllegalAccessException, InvocationTargetException {
        BeanUtils.setProperty(bean, name, value);
    }

    /**
     *  获取属性
     * @param bean
     * @param name
     * @return
     */
    public static String getProperty(Object bean, String name) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return BeanUtils.getProperty(bean, name);
    }


}
