package practice.multi_threading.thread_safe._synchronized._practice;

/**
 * ClassName: BankSynchronized
 * Package: practice.multi_threading.thread_safe._synchronized._practice
 * Description:银行有一个账户。 有两个储户分别向同一个账户存 3000 元，每次存 1000，存 3 次。每次存完打印账户余额。
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 18:52
 * Version - v 1.0
 */
public class BankSynchronized {
    public static void main(String[] args) {
        Account account = new Account();
        Thread t1 = new Thread(account,"张三");
        Thread t2 = new Thread(account,"李四");


        t1.start();
        t2.start();


    }
}
//账户类
class Account implements Runnable{
    private int account01 = 0;
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            save();
        }
    }
    public synchronized void save() {
        if (account01 < 6) {
            account01++;
            System.out.println(Thread.currentThread().getName() + "存钱1,余额为:" + account01);
        }
    }
}
