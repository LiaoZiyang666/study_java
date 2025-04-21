package practice.multi_threading.methods;

/**
 * ClassName: Test02
 * Package: practice.multi_threading.methods
 * Description:
 *      声明一个匿名内部类继承 Thread 类，重写 run 方法，实现打印[1,100]之间的奇数，
 *      当打印到 5 时，让奇数线程暂停一下，再继续。
 *      当打印到 5 时，让奇数线程停下来，让偶数线程执行完再打印。
 *
 * @author 廖子杨
 * CreateTime: 2025/4/21 - 10:15
 * Version - v 1.0
 */
public class Test02 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i+=2) {
                    if (i == 7) {
                        try {
                            System.out.println("--------");
                            Thread.sleep(1000);
                        }catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " " + i);
                    Thread.yield();

                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                for (int i = 2; i <= 100; i+=2) {
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }.start();
    }
}
