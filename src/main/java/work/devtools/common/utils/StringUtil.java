package work.devtools.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 *
 * @author huangyong
 * @since 1.0.0
 */
public final class StringUtil extends StringUtils{


    /**
     * 字符串分隔符
     */
    public static final String SEPARATOR = String.valueOf((char) 29);

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 分割固定格式的字符串
     */
    public static String[] splitString(String str, String separator) {
        return StringUtils.splitByWholeSeparator(str, separator);
    }

    /**
     * 判断是否为空
     * @param str
     * @return
     */
    public static boolean isBlank(String str){
        return StringUtils.isBlank(str);
    }

    /**
     * 判断是否为非空
     * @param str
     * @return
     */
    public static boolean isNotBlank(String str){
        if("null".equals(str)){
            return false;
        }
        return !StringUtils.isBlank(str);
    }

<<<<<<< HEAD
    /**
     *  返回第一个大写字母前面的字符串
     * @param str
     * @return
     */
    public static String upperCaseFirst(String str){
        String result = str;
        String regExp = "(.*?)[A-Z]+";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            result = matcher.group(1);
            break;
        }
        return result;
=======

    /**
     * 字符串首字母小写
     * @param str
     * @return
     */
    public static String toLowerCaseFirstOne(String str) {
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
    public static String toUpperCaseFirstOne(String s) {
        if(Character.isUpperCase(s.charAt(0)))
            return s;
        else
            return (new StringBuilder()).append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
>>>>>>> hxx
    }

}