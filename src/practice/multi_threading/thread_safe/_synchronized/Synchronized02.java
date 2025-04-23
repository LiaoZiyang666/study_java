package practice.multi_threading.thread_safe._synchronized;

/**
 * ClassName: Synchronized02
 * Package: practice.multi_threading.thread_safe._synchronized
 * Description:
 *                         非静态方法加锁--------实现Runnable接口----同一个对象的实例变量可共享
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 18:30
 * Version - v 1.0
 */
public class Synchronized02 {
    public static void main(String[] args) {
        TicketSaleRunnable tr = new TicketSaleRunnable();
        Thread t1 = new Thread(tr, "窗口一");
        Thread t2 = new Thread(tr, "窗口二");
        Thread t3 = new Thread(tr, "窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketSaleRunnable implements Runnable {
    private int ticket = 100;
    @Override
    public void run() {//直接锁这里，肯定不行，会导致，只有一个窗口卖票
        while (ticket > 0) {
            saleOneTicket();
        }
    }
    public synchronized void saleOneTicket() {
        //锁对象是this，这里就是TicketSaleRunnable 对象，因为上面3 个线程使用同一个TicketSaleRunnable 对象，所以可以
        if (ticket > 0) {//不加条件，相当于条件判断没有进入锁管控，线程安全问题就没有解决
            System.out.println(Thread.currentThread().getName() + "卖 出一张票，票号:" + ticket);
            ticket--;
        }
    }
}