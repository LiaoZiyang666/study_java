package practice.multi_threading.review.methods;

/**
 * ClassName: InsertThread
 * Package: practice.multi_threading.review.methods
 * Description: Consumer producer
 *
 * @author 廖子杨
 * CreateTime: 2025/5/7 - 12:00
 * Version - v 1.0
 */
class MyThread31 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

public class InsertThread {
    public static void main(String[] args) {
        MyThread31 t1 = new MyThread31();
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
