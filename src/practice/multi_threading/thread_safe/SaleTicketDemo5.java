package practice.multi_threading.thread_safe;

/**
 * ClassName: SaleTicketDemo5
 * Package: practice.multi_threading.thread_safe
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 17:04
 * Version - v 1.0
 */
public class SaleTicketDemo5{
    public static void main(String[] args) {
        //创建资源对象
        Ticket ticket = new Ticket();
        //启动多个线程操作资源类的对象
        Thread t1 = new Thread("窗口1") {
            @Override
            public void run() {
                while (true) {
                    ticket.sale();
                }
            }
        };
        Thread t2 = new Thread("窗口2") {
            @Override
            public void run() {
                while (true) {
                    ticket.sale();
                }
            }
        };
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                ticket.sale();
            }
        }, "窗口3");

        t1.start();
        t2.start();
        t3.start();
//问题：但是有重复票或负数票问题。
//原因：线程安全问题
    }
}
//1、编写资源类
class Ticket{
    private int ticket = 10;
    public void sale() {
        if (ticket > 0) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "卖出一张票，票号：" + ticket);
            ticket--;
        }else {
            throw new RuntimeException("没票了");
        }
    }

    public int getTicket() {
        return ticket;
    }
}