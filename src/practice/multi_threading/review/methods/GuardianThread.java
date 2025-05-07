package practice.multi_threading.review.methods;

/**
 * ClassName: GuardianThread
 * Package: practice.multi_threading.review.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/7 - 11:41
 * Version - v 1.0
 */

class MyThread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

class MyThread12 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}

/**
 * @author AYXY
 */
public class GuardianThread {
    public static void main(String[] args) {
        MyThread11 t1 = new MyThread11();
        t1.setName("小明");

        MyThread12 t2 = new MyThread12();
        t2.setName("Anna");

        t2.setDaemon(true);

        t1.start();
        t2.start();

    }
}
