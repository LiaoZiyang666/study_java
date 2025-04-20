package practice.multi_threading.test.test02;

/**
 * ClassName: Test
 * Package: practice.multi_threading.test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:54
 * Version - v 1.0
 */
public class Test {
    public static void main(String[] args) {

        Odd odd = new Odd();
        Thread t1 = new Thread(odd, "奇数");

        Even even = new Even();
        Thread t2 = new Thread(even, "偶数");
        t1.start();
        t2.start();

    }
}
