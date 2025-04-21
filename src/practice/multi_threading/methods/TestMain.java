package practice.multi_threading.methods;

/**
 * ClassName: TestMain
 * Package: practice.multi_threading.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/21 - 09:59
 * Version - v 1.0
 */
public class TestMain {
    public static void main(String[] args) {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(getName() + "的优先级：" + getPriority());
            }
        };
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        System.out.println(Thread.currentThread().getName() + "的优先级：" + Thread.currentThread().getPriority());
    }
}
