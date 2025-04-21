package practice.multi_threading.methods;

/**
 * ClassName: Test03
 * Package: practice.multi_threading.methods
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/21 - 10:40
 * Version - v 1.0
 */
public class Test03 {
    public static void main(String[] args) {

        MyDaemon t1 = new MyDaemon();
        t1.setDaemon(true);
        t1.start();

        for (int i = 1; i <= 50; i++) {
            System.out.println("main:" + i);
        }
    }
}
class MyDaemon extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("我一直守护者你...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
