package practice.exception.throws_;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *ClassName: Exception
 *Package: practice.exception.throws_
 *Description:
 *@author 廖子杨
 *CreateTime: 2025/4/14 - 13:54
 *Version - v 1.0
*/
public class Exception04 {
    public static void main(String[] args) throws Exception{
        String s = null;
        try {
            add(s);
        }catch (Exception e) {
            e.printStackTrace();//将详细的异常信息打印到控制台上
        }
        delete();
        update();
        find();
    }
    //java.io.IOException: IO异常
    //	at practice.exception.throws_.Exception04.add(Exception04.java:30)
    //	at practice.exception.throws_.Exception04.main(Exception04.java:18)
    //删除功能
    //修改功能
    //查询功能
    private static void add(String s) throws Exception{
        if (s == null) {
            //故意创建异常--IO异常
            throw new IOException("IO异常");
        }
        //效果一样
        if (!s.endsWith(".txt")) {
            //故意创建异常----找不到文件异常---
            throw new FileNotFoundException("文件找不到");
        }
        System.out.println("执行");
    }

    private static void find() {
        System.out.println("查询功能");
    }

    private static void update() {
        System.out.println("修改功能");
    }

    private static void delete() {
        System.out.println("删除功能");
    }
}
