package practice.multi_threading.runnable;

/**
 *ClassName: MyRunnable
 *Package: practice.multi_threading.runnable
 *Description:
 *@author 廖子杨
 *CreateTime: 2025/4/20 - 17:31
 *Version - v 1.0
*/
public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
