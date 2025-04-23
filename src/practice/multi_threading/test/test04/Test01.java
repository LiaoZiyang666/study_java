package practice.multi_threading.test.test04;

/**
 * ClassName: Test01
 * Package: practice.multi_threading.test.test04
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 09:49
 * Version - v 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.setName("Tom");


        MyThread m2 = new MyThread();
        m2.setName("Jack");

        m1.start();
        m2.start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "" + i);
            Thread.yield();
        }
    }
}
