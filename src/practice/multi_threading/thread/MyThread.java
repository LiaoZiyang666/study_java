package practice.multi_threading.thread;

/**
 * ClassName: MyThread
 * Package: practice.multi_threading.class_thread
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 17:14
 * Version - v 1.0
 */
public class MyThread extends Thread{
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(getName() + ": 正在执行！" + i);
        }
    }
}
