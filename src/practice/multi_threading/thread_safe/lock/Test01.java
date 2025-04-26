package practice.multi_threading.thread_safe.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: Windows01
 * Package: practice.multi_threading.thread_safe.lock
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/26 - 16:07
 * Version - v 1.0
 */
class Windows01 implements Runnable{
    int ticket = 100;
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while(true) {
            try {
                lock.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    }catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }else {
                    break;
                }
            }finally {
                lock.unlock();
            }
        }
    }
}

public class Test01 {
    public static void main(String[] args) {
        Windows01 w = new Windows01();
        Thread t1 = new Thread(w);
        Thread t2 = new Thread(w);

        t1.start();
        t2.start();
    }
}
