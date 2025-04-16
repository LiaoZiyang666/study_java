package practice.exception.throws01;

import java.io.FileNotFoundException;

/**
 * ClassName: Exception03
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 13:50
 * Version - v 1.0
 */
public class Exception03 {
    public static void main(String[] args) {
        String s = "a.txt1";
        try {
            add(s);
        }catch (FileNotFoundException e) {
            System.out.println(e);
        }
        find();
        update();
        delete();
    }

    //java.io.FileNotFoundException: 文件找不到了
    //查询功能
    //修改功能
    //删除功能

    private static void add(String s) throws FileNotFoundException {
        if (!s.endsWith(".txt")) {
            //故意创建异常
            throw new FileNotFoundException("文件找不到了");

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
