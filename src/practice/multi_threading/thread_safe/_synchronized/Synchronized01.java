package practice.multi_threading.thread_safe._synchronized;

/**
 * ClassName: Synchronized01
 * Package: practice.multi_threading.thread_safe
 * Description:
 *                          静态方法加锁--------继承Thread类-----静态变量是可以共享的
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 18:20
 * Version - v 1.0
 */
public class Synchronized01 {
    public static void main(String[] args) {
        TicketSaleThread t1 = new TicketSaleThread();
        TicketSaleThread t2 = new TicketSaleThread();
        TicketSaleThread t3 = new TicketSaleThread();
        t1.setName("窗口 1");
        t2.setName("窗口 2");
        t3.setName("窗口 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketSaleThread extends Thread{
    private static int ticket = 100;
    @Override
    public void run(){//直接锁这里，肯定不行，会导致，只有一个窗口卖票
        while (ticket > 0) {
            saleOneTicket();
        }
    }
    public synchronized static void saleOneTicket(){
        //锁对象是TicketSaleThread 类的Class 对象，而一个类的Class 对象在内存中肯定只有一个
        if(ticket > 0) {//不加条件，相当于条件判断没有进入锁管控，线程安全问题就没有解决
            System.out.println(Thread.currentThread().getName() + "卖 出一张票，票号:" + ticket);
            ticket--;
        }
    }
}