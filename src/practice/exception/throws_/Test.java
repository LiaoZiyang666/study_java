package practice.exception.throws_;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: Test
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 14:12
 * Version - v 1.0
 */
public class Test {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("day13_exception_object\\1.txt");
            fw.write("哈哈哈");//假如这里写失败或者写成功了
        } catch (IOException e) {
            throw new RuntimeException(e);
            //Exception in thread "main" java.lang.RuntimeException:
            // java.io.FileNotFoundException: day13_exception_object\1.txt (系统找不到指定的路径。)
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
