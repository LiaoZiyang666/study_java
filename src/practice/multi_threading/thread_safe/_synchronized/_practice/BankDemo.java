package practice.multi_threading.thread_safe._synchronized._practice;

/**
 * ClassName: BankDemo
 * Package: practice.multi_threading.thread_safe._synchronized._practice
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/23 - 20:23
 * Version - v 1.0
 */
class BankAccount {
    private int balance = 0;

    // 使用synchronized关键字保证存款操作的原子性
    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " 存入 " + amount + " 元，当前余额: " + balance);
    }
}

class Depositor implements Runnable {
    private BankAccount account;

    public Depositor(BankAccount account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);
            try {
                Thread.sleep(100); // 模拟存款操作的时间间隔
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread depositor1 = new Thread(new Depositor(account), "储户1");
        Thread depositor2 = new Thread(new Depositor(account), "储户2");

        depositor1.start();
        depositor2.start();
    }
}
