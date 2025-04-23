package practice.multi_threading.test.test04;

/**
 * ClassName: Test02
 * Package: practice.multi_threading.test.test04
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 09:59
 * Version - v 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        MyThreads m1 = new MyThreads();
        m1.start();
    try {
            m1.join();
        }catch (InterruptedException e ) {
            e.printStackTrace();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}

class MyThreads extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}