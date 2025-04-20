package practice.multi_threading.thread;

/**
 * ClassName: TestMyThread
 * Package: practice.multi_threading.class_thread
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:17
 * Version - v 1.0
 */
public class TestMyThread {
    public static void main(String[] args) {
        //第三个执行
        MyThread mt1 = new MyThread("子线程1");
        mt1.start();
        //第二个执行
        MyThread nt2 = new MyThread("子线程2");
        nt2.start();

        //第一个执行
        for (int i = 0; i < 10; i++) {
            System.out.println("main线程！" + i);
        }
    }
}
