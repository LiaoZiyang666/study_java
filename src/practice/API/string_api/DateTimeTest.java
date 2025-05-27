package practice.API.string_api;


import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: TimeDate
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/27 - 17:19
 * Version - v 1.0
 */


public class DateTimeTest {
    @Test
    public void test01() {
        Date date = new Date();
        System.out.println(date);
        //Date()：使用无参构造器创建的对象可以获取本地当前时间。
    }

    @Test
    public void test02() {
        long time = System.currentTimeMillis();
        System.out.println(time);
        //1748337912828
        //System 类提供的 public static long currentTimeMillis()：用来返回当前时间与 1970 年
        //1 月 1 日 0 时 0 分 0 秒之间以毫秒为单位的时间差。
    }

    @Test
    public void test03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
        //1748337974313
        //getTime(): 返回自 1970 年 1 月 1 日 00:00:00 GMT 以来此 Date 对象表示的毫秒数。
    }

    @Test
    public void test04() {
        long time = 153534553553L;
        Date date = new Date(time);
        System.out.println(date);
        //Wed Nov 13 08:29:13 GMT+08:00 1974
        //Date(long 毫秒数)：把该毫秒值换算成日期时间对象
    }

    @Test
    public void test05() {
        long time = Long.MAX_VALUE;
        Date date = new Date(time);
        System.out.println(date);
        //Sun Aug 17 15:12:55 GMT+08:00 292278994
    }


    //java.text.SimpleDateFormat 类是一个不与语言环境有关的方式来格式化和解析日期的具体类。

    //格式化
    @Test
    public void test1() {
        Date d = new Date();
        SimpleDateFormat sf = new
                SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SSS 毫秒 E Z");
        //SimpleDateFormat() ：默认的模式和语言环境创建对象    把 Date 日期转成字符串，按照指定的格式转
        String str = sf.format(d);//public String format(Date date)：方法格式化时间对象 date
        System.out.println(str);
        //2025 年 05 月 27 日 17 时 45 分 31 秒 685 毫秒 周二 +0800
    }

    //解析
    @Test
    public void test2() throws ParseException {
        String str = "2022 年 06 月 06 日 16 时 03 分 14 秒 545 毫秒 星期四 +0800";
        SimpleDateFormat sf = new
                SimpleDateFormat("yyyy 年 MM 月 dd 日 HH 时 mm 分 ss 秒 SSS 毫秒 E Z");
        Date d = sf.parse(str);
        //public Date parse(String source)：从给定字符串的开始解析文本，以生成一个日期。
        System.out.println(d);
        //Mon Jun 06 16:03:14 GMT+08:00 2022
    }


}
