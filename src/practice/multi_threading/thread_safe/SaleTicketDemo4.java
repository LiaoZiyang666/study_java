package practice.multi_threading.thread_safe;

/**
 * ClassName: SaleTicketDemo4
 * Package: practice.multi_threading.thread_safe
 * Description:同一个对象的实例变量共享
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 16:56
 * Version - v 1.0
 */
public class SaleTicketDemo4 {
    public static void main(String[] args) {
        Window3 tr1 = new Window3();
        Thread t1 = new Thread(tr1,"窗口1");
        Thread t2 = new Thread(tr1,"窗口2");
        t1.start();
        t2.start();
        //问题：但是有重复票或负数票问题。
        //原因：线程安全问题
    }
}
class Window3 implements Runnable{
    private static int ticket = 10;
    @Override
    public void run() {
        while (ticket > 0)   {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e ) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号：" + ticket);
            ticket--;
        }
    }
}

