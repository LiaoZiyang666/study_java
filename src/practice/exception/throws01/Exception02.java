package practice.exception.throws01;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: Exception02
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 13:36
 * Version - v 1.0
 */
public class Exception02 {

    public static void main(String[] args) throws Exception {
        String s = null;
        add(s);
        delete();
        update();
        find();
    }

    private static void add(String s) throws Exception {
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




//    public static void main(String[] args) throws FileNotFoundException, IOException {
//        String s = null;
//        add(s);
//        delete();
//        update();
//        find();
//    }
//
//    private static void add(String s) throws FileNotFoundException, IOException{
//        if (s == null) {
//            //故意创建异常--IO异常
//            throw new IOException("IO异常");
//        }
//
//        /*
//        Exception in thread "main" java.io.IOException: IO异常
//        at practice.exception.throws_.Exception02.add(Exception02.java:27)
//        at practice.exception.throws_.Exception02.main(Exception02.java:18)
//        */
//
//
//        if (!s.endsWith(".txt")) {
//            //故意创建异常----找不到文件异常---
//            throw new FileNotFoundException("文件找不到");
//        }
//        System.out.println("执行");
//    }
//
//    private static void find() {
//        System.out.println("查询功能");
//    }
//
//    private static void update() {
//        System.out.println("修改功能");
//    }
//
//    private static void delete() {
//        System.out.println("删除功能");
//    }
}
