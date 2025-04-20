package practice.multi_threading.test.test03;

/**
 * ClassName: EvenOddThreads
 * Package: practice.multi_threading.test.test03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 19:50
 * Version - v 1.0
 */
public class EvenOddThreads {
    public static void main(String[] args) {
        // 创建并启动偶数线程
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 100; i += 2) {
                System.out.println("偶数: " + i);
            }
        });

        // 创建并启动奇数线程
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 100; i += 2) {
                System.out.println("奇数: " + i);
            }
        });

        evenThread.start();
        oddThread.start();
    }
}
