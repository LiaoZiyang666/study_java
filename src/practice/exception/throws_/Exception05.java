package practice.exception.throws_;

import java.io.FileNotFoundException;

/**
 * ClassName: Exception05
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 13:59
 * Version - v 1.0
 */
public class Exception05 {
    public static void main(String[] args) {
        String s = "a.txt1";
        try {
            add(s);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            System.out.println("必须执行");
        }
        //java.io.FileNotFoundException: file 找不到
        //	at practice.exception.throws_.Exception05.add(Exception05.java:28)
        //	at practice.exception.throws_.Exception05.main(Exception05.java:18)
        //必须执行
    }
    private static void add(String s ) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("file 找不到");
        }
        System.out.println("执行");
    }
}
