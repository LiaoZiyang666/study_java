package practice.multi_threading.thread_safe;

/**
 * ClassName: SaleTicketDemo2
 * Package: practice.multi_threading.thread_safe
 * Description: 不同对象的实例变量不共享
 *              不同的实例对象的实例变量是独立的
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 16:39
 * Version - v 1.0
 */
public class SaleTicketDemo2 {
    public static void main(String[] args) {
        Window window = new Window();
        Window window1 = new Window();

        window.setName("Tom");
        window1.setName("Jack");

        window.start();
        window1.start();
    }
}
class Window1 extends Thread{
    private int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0) {
            System.out.println(getName() + "卖出一张票，票号：" + ticket);
            ticket--;
        }
    }
}
