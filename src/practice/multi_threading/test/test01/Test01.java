package practice.multi_threading.test.test01;

/**
 * ClassName: Test01
 * Package: practice.multi_threading.test
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:42
 * Version - v 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        new Thread("新的线程") {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println(getName() + "正在执行" + i);
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 7; i++) {
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}
