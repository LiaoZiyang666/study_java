package practice.multi_threading.review.methods;

/**
 * ClassName: Yieldhread
 * Package: practice.multi_threading.review.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/7 - 11:56
 * Version - v 1.0
 */
class MyThread21 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            Thread.yield();
        }
    }
}

public class YieldThread {
    public static void main(String[] args) {
        MyThread21 t1 = new MyThread21();
        MyThread21 t2 = new MyThread21();


        t1.start();
        t2.start();

    }
}
