package practice.multi_threading.review.methods;

/**
 * ClassName: ThreadPriority
 * Package: practice.multi_threading.review.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/7 - 11:32
 * Version - v 1.0
 */
class MyThread01 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + " 执行了......" + i);
        }
    }
}
public class ThreadPriority {
    public static void main(String[] args) {
        MyThread01 t1 = new MyThread01();
        t1.setName("Tom");

        MyThread01 t2 = new MyThread01();
        t2.setName("金莲");

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t2.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);

        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();
    }
}
