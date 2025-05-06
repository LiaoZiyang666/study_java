package practice.multi_threading.review.methods;

/**
 * ClassName: SleepTest
 * Package: practice.multi_threading.review.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/6 - 10:09
 * Version - v 1.0
 */
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
public class SleepTest {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();

        for (int i = 0; i < 4; i++) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

