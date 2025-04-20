package practice.multi_threading.test.test03;

/**
 * ClassName: EvenOddThread
 * Package: practice.multi_threading.test.test03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/20 - 19:51
 * Version - v 1.0
 */
public class EvenOddThread {
        private static final Object lock = new Object();
        private static int current = 1;

        public static void main(String[] args) {
            // 奇数线程
            Thread oddThread = new Thread(() -> {
                while (current <= 100) {
                    synchronized (lock) {
                        if (current % 2 == 1) {
                            System.out.println("奇数: " + current);
                            current++;
                            lock.notify();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

            // 偶数线程
            Thread evenThread = new Thread(() -> {
                while (current <= 100) {
                    synchronized (lock) {
                        if (current % 2 == 0) {
                            System.out.println("偶数: " + current);
                            current++;
                            lock.notify();
                        } else {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            });

            oddThread.start();
            evenThread.start();
        }

}
