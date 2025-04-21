package practice.multi_threading.methods;

/**
 * ClassName: Test01
 * Package: practice.multi_threading.methods
 * Description:声明一个匿名内部类继承 Thread 类，重写 run 方法，实现打印[1,100]之间的偶数，
 *              要求每隔 1 秒打印 1 个偶数
 *
 * @author 廖子杨
 * CreateTime: 2025/4/21 - 10:06
 * Version - v 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 2; i <= 100 ; i+=2) {

                    try {
                        Thread.sleep(1000);
                        //   线程睡眠,超时后自动醒来继续执行,传递的是毫秒值
                    }catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    System.out.println(Thread.currentThread().getName() + " " + i);
                }
            }
        }.start();
    }
}
