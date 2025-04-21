package practice.multi_threading.methods;

/**
 * ClassName: ThreadStateTest
 * Package: practice.multi_threading.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/21 - 11:09
 * Version - v 1.0
 */
public class ThreadStateTest {
    public static void main(String[] args) throws
            InterruptedException {
        SubThread t = new SubThread();
        System.out.println(t.getName() + " 状态 " + t.getState());
        t.start();
        while (Thread.State.TERMINATED != t.getState()) {
            System.out.println(t.getName() + " 状态 " + t.getState());
            Thread.sleep(500);
        }
        System.out.println(t.getName() + " 状态 " + t.getState());
    }
}
class SubThread extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 10; i++) {
                System.out.println("打印：" + i);
                try {

                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            break;
        }
    }
}
