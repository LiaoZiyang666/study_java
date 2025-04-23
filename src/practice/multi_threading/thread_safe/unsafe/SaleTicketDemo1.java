package practice.multi_threading.thread_safe.unsafe;

/**
 * ClassName: SaleTicketDemo1
 * Package: practice.multi_threading.thread_safe
 * Description:局部变量不能共享
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 13:08
 * Version - v 1.0
 */
public class SaleTicketDemo1 {
    public static void main(String[] args) {
        Window window = new Window();
        Window window1 = new Window();
        Window window2 = new Window();

        window.setName("窗口1");
        window1.setName("窗口2");
        window2.setName("窗口3");

        window.start();
        window1.start();
        window2.start();

    }
}
class Window extends Thread{

    @Override
    public void run() {
        int ticket = 100;
        while (ticket > 0) {
            System.out.println(getName() + "卖出一张票，票号：" + ticket);
            ticket--;
        }
    }
}
