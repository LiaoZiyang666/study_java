package practice.multi_threading.thread_safe.unsafe;

/**
 * ClassName: SaleTicketDemo3
 * Package: practice.multi_threading.thread_safe
 * Description:静态变量是共享的
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 16:47
 * Version - v 1.0
 */
public class SaleTicketDemo3 {
    public static void main(String[] args) {
        Window2 window1 = new Window2();
        Window2 window2 = new Window2();

        window1.setName("窗口1");
        window2.setName("窗口2");

        window1.start();
        window2.start();

    }
}
class Window2 extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            try {
                Thread.sleep(10);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "卖出一张票，票号：" + ticket);
            ticket--;
        }
    }
}
