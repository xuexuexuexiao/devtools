package work.devtools.common.utils;

import com.google.gson.Gson;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: Map和实体类互转
 * @create: 2019-04-01
 **/
public class MapObjUtil {

    /**
     * map转对象
     * @param map
     * @param clazz
     * @param <T>
     * @return
     */
    public static <T> T map2Object(Map<String, Object> map, Class<T> clazz) {
        if (map == null) {
            return null;
        }
        T obj = null;
        try {
            obj = clazz.newInstance();

            Field[] fields = obj.getClass().getDeclaredFields();
            for (Field field : fields) {
                int mod = field.getModifiers();
                if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                    continue;
                }
                field.setAccessible(true);
                String filedTypeName = field.getType().getName();
                if (filedTypeName.equalsIgnoreCase("java.util.date")) {
                    String datetimestamp = String.valueOf(map.get(field.getName()));
                    if (datetimestamp.equalsIgnoreCase("null")) {
                        field.set(obj, null);
                    } else {
                        field.set(obj, new Date(Long.parseLong(datetimestamp)));
                    }
                } else {
                    field.set(obj, map.get(field.getName()));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }


    public static Object mapToObject2(Class clazz, Map<String,Object> map){

        if(null == map){
            return null;
        }

        Field[] fields = clazz.getDeclaredFields(); //取到类下所有的属性，也就是变量名  
        Field field;
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (InstantiationException e1) {
            e1.printStackTrace();
        } catch (IllegalAccessException e1) {
            e1.printStackTrace();
        }
        for(int i=0; i<fields.length; i++){
            field = fields[i];
            String fieldName = field.getName();
            //把属性的第一个字母处理成大写  
            String stringLetter=fieldName.substring(0, 1).toUpperCase();
            //取得set方法名，比如setBbzt  
            String setterName="set"+stringLetter+fieldName.substring(1);
            //真正取得set方法。  
            Method setMethod = null;
            Class fieldClass = field.getType();
            try {
                if(isHaveSuchMethod(clazz, setterName)){
                    if(fieldClass == String.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, String.valueOf(map.get(fieldName)));//为其赋值   
                    }else if(fieldClass == Integer.class || fieldClass == int.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Integer.parseInt(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == Boolean.class || fieldClass == boolean.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Boolean.getBoolean(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == Short.class || fieldClass == short.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Short.parseShort(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == Long.class || fieldClass == long.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Long.parseLong(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == Double.class || fieldClass == double.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Double.parseDouble(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == Float.class || fieldClass == float.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, Float.parseFloat(String.valueOf(map.get(fieldName))));//为其赋值   
                    }else if(fieldClass == BigInteger.class ){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, BigInteger.valueOf(Long.parseLong(String.valueOf(map.get(fieldName)))));//为其赋值   
                    }else if(fieldClass == BigDecimal.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        setMethod.invoke(o, BigDecimal.valueOf(Long.parseLong(String.valueOf(map.get(fieldName)))));//为其赋值   
                    }else if(fieldClass == Date.class){
                        setMethod = clazz.getMethod(setterName, fieldClass);
                        if(map.get(fieldName).getClass() == java.sql.Date.class){
                            setMethod.invoke(o, new Date(((java.sql.Date)map.get(fieldName)).getTime()));//为其赋值   
                        }else if(map.get(fieldName).getClass() == java.sql.Time.class){
                            setMethod.invoke(o, new Date(((java.sql.Time)map.get(fieldName)).getTime()));//为其赋值   
                        }else if(map.get(fieldName).getClass() == java.sql.Timestamp.class){
                            setMethod.invoke(o, new Date(((java.sql.Timestamp)map.get(fieldName)).getTime()));//为其赋值   
                        }
                    }
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }   catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }

        }
        return o;
    }

    private static boolean isHaveSuchMethod(Class clazz, String methodName) {

        Method[] methodArray = clazz.getMethods();
        boolean result = false;
        if(null != methodArray){
            for(int i=0; i<methodArray.length; i++){
                if(methodArray[i].getName().equals(methodName)){
                    result = true;
                    break;
                }
            }
        }
        return result;
    }


    public static <T> T transMapToObj(Map map, Class<T> classOfT) {
        Gson gson = new Gson();
        String paramJsonString = gson.toJson(map);
        return gson.fromJson(paramJsonString, classOfT);
    }

}
