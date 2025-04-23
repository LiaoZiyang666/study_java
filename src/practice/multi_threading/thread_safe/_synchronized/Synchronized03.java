package practice.multi_threading.thread_safe._synchronized;

/**
 * ClassName: Synchronized03
 * Package: practice.multi_threading.thread_safe._synchronized
 * Description:
 *                          ---------同步代码块-----实现Runnable接口-----抽取资源类，共享同一个资源对象
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 18:39
 * Version - v 1.0
 */
public class Synchronized03 {
    public static void main(String[] args) {
        TicketSaleRunnable01 tr = new TicketSaleRunnable01();
        Thread t1 = new Thread(tr, "窗口一");
        Thread t2 = new Thread(tr, "窗口二");
        Thread t3 = new Thread(tr, "窗口三");
        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketSaleRunnable01 implements Runnable {
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

//1、编写资源类
class Ticket {
    private int ticket = 1000;
    public void sale() {//也可以直接给这个方法加锁，锁对象是this，这里就是Ticket 对象
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "卖 出一张票，票号:" + ticket);
            ticket--;
        } else {
            throw new RuntimeException("没有票了");
        }
    }
    public int getTicket() {
        return ticket;
    }
}
