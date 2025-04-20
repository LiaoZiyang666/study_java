package practice.multi_threading.test.test02;

/**
 * ClassName: Odd
 * Package: practice.multi_threading.test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:49
 * Version - v 1.0
 */
public class Odd implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + "----" + i);
            }
        }
    }
}
