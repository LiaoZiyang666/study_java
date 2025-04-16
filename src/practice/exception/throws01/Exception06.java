package practice.exception.throws01;

/**
 * ClassName: Exception06
 * Package: practice.exception.throws_
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/14 - 14:05
 * Version - v 1.0
 */
public class Exception06 {
    public static void main(String[] args) {
        int result = method();
        System.out.println(result);
    }
    private static int method() {
        int n = 1;
        try {
            String s = null;
            System.out.println(s.length());//NullPointerException--空指针异常
            return 2;
        }catch (Exception e) {
            e.printStackTrace();
            return n;
        }finally {
            System.out.println("执行");
            ++n;

//            return 3;
        }
    }
}
