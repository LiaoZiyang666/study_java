package practice.API.string_api;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * ClassName: TestCalendar
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/27 - 17:49
 * Version - v 1.0
 */


public class TestCalendar {
    @Test
    public void test01() {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute);
        //2025-5-27 17:55
    }
    @Test
    public void test02(){
        TimeZone t = TimeZone.getTimeZone("America/Los_Angeles");
        Calendar calendar = Calendar.getInstance(t);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println(year + "-" + month + "-" + day + " " + hour + ":" + minute);
        //2025-5-27 2:58-->美国洛杉矶
    }
    
    @Test
    public void test03(){
        Calendar calendar = Calendar.getInstance();
        //从一个Calendar对象中获取Date对象
        Date date = calendar.getTime();

        //使用给定的Date设置此Calendar的时间
        date = new Date(2342353452424L);
        calendar.setTime(date);
        calendar.set(Calendar.DAY_OF_MONTH, 8);
        System.out.println("当前时间日设置为8后，时间是：" + calendar.getTime());

        calendar.add(Calendar.HOUR, 2);
        System.out.println("当前时间加 2 小时后,时间是:" + calendar.getTime());

        calendar.add(Calendar.MONTH, -2);
        System.out.println("当前日期减 2 个月后,时间是:" + calendar.getTime());
    }
}
