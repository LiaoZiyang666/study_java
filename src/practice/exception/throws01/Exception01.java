package practice.exception.throws01;

import java.io.FileNotFoundException;

/**
 * ClassName: Exception01
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 13:28
 * Version - v 1.0
 */
public class Exception01 {
    public static void main(String[] args) throws FileNotFoundException {
        String s = "a.txt1";
        add(s);
        find();
        update();
        delete();
    }

    private static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到了");
            /*
            Exception in thread "main" java.io.FileNotFoundException: 文件找不到了
            at practice.exception.throws_.Exception01.add(Exception01.java:26)
            at practice.exception.throws_.Exception01.main(Exception01.java:17)
            */
        }
        System.out.println("我要执行了");
    }

    private static void find() {
        System.out.println("查询功能");
    }
    private static void update () {
        System.out.println("修改功能");
    }
    private static void delete () {
        System.out.println("删除功能");
    }
}
