package practice.API.date_time;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Package: practice.API.date_time
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/11 - 14:27
 * Version - v 1.0
 */


public class DateTimeTest {

    /**
     * 8.0之前的时间，日期API-------api1
     * 两个date的使用-------api2
     */
    @Test
    public void test01() {
        Date date = new Date();
        System.out.println(date.toString());//Wed Jun 11 14:28:11 GMT+08:00 2025
        System.out.println(date.getTime());//1749623332402 = Wed Jun 11 14:28:52 GMT+08:00 2025


        java.sql.Date date1 = new java.sql.Date(1749623332402L);
        System.out.println(date1 + "\n" + date1.toString() + "\n" + date1.getTime());
        //2025-06-11
        //2025-06-11
        //1749623332402

    }

    /**
     * simpleDateFormat-------api3
     *
     * @throws ParseException
     */
    @Test
    public void test02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date date = new Date();
        //格式化 ： 日期-->字符串
        String sdfDate = sdf.format(date);
        System.out.println(sdfDate);//2025/6/11 下午2:40
        //解析  ： 字符串-->日期
        Date sdfDate1 = sdf.parse("2025/6/11 下午8:40");
        System.out.println(sdfDate1);//Wed Jun 11 20:40:00 GMT+08:00 2025


    }

    /**
     * 将java.util.Date 转化为 java.sql.Date
     */
    @Test
    public void test03() {
        Date date = new Date();
        System.out.println(date);//Wed Jun 11 15:31:39 GMT+08:00 2025
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);//2025-06-11
    }


    /**
     * 将控制台获取的年月日（ 2002-12-3）的字符串数据，保留在数据库中，
     * 简化为得到 java.sql.Date的对象
     */
    @Test
    public void test04() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String patten = "2002-12-3";
        Date date = sdf.parse(patten);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
        System.out.println(date1);//2002-12-03
    }

    /**
     * JDK8的api：LocalDate \ LocalTime \ LocalDateTime
     */
    @Test
    public void test05(){
        //now():获取当前日期时间对应的实例
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2025-06-18
        System.out.println(localTime);//10:12:54.092462500
        System.out.println(localDateTime);//2025-06-18T10:12:54.092462500

        //of():获取指定的日期，时间对应的实例
        LocalDate localDate1 = LocalDate.of(2021, 5, 12);
        LocalTime localTime1 = LocalTime.of(12, 32, 24);
        LocalDateTime localDateTime1 = LocalDateTime.of(2000, 2, 2, 10, 23, 4);

        System.out.println(localDate1);//2021-05-12
        System.out.println(localTime1);//12:32:24
        System.out.println(localDateTime1);//2000-02-02T10:23:04


    }
    /**
     * 百日宴
     */
    @Test
    public void test06(){
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println("你的生日" + date);//你的生日Wed Jun 18 11:30:00 GMT+08:00 2025

        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date date1 = calendar.getTime();
        System.out.println("100天以后是：" + date1 + "\n");//100天以后是：Fri Sep 26 11:30:00 GMT+08:00 2025

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日" + localDateTime);//你的生日2025-06-18T11:30:00.749899300
        //不可变性
        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("100天以后是" + localDateTime1);//100天以后是2025-09-26T11:30:00.749899300
        System.out.println("你的生日" + localDateTime);//你的生日2025-06-18T11:30:00.749899300
    }












}
