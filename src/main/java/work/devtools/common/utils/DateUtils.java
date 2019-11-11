package work.devtools.common.utils;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;


/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 日期处理
 * @create: 2019-04-09
 **/
public class DateUtils {

    private final static Logger logger = LoggerFactory.getLogger(DateUtils.class);

    public final static String DATE_PATTERN = "yyyy-MM-dd";

    public final static String DATE__TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";

    /**
     * 日期转时间字符串
     * @param date  日期或者时间
     * @param pattern  返回的格式
     * @return
     */
    public static String date2String(Date date, String pattern){
        if(date != null){
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            return simpleDateFormat.format(date);
        }
        return null;
    }

    /**
     * 时间字符串转规定格式的日期
     * @param date      返回的日期或者时间字符串
     * @param pattern   格式
     * @return
     * @throws ParseException
     */
    public static Date string2Date(String date,String pattern) throws ParseException {
        if(StringUtils.isNotBlank(date)){
            SimpleDateFormat sdf = new SimpleDateFormat(pattern, Locale.CHINESE);
            try{
                return sdf.parse(date);
            }catch (ParseException e){
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }


    public static Date getDate(Date date,int i){
        if(date == null){
            return null;
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DATE,i);
        return instance.getTime();
    }


}
