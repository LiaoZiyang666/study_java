package practice.multi_threading.runnable;

/**
 * ClassName: MyThread
 * Package: practice.multi_threading.runnable
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:32
 * Version - v 1.0
 */
public class MyThread {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "长江");
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("黄河" + i);
        }
    }
}
