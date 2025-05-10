package practice.multi_threading.threadCommunication;

/**
 * ClassName: Exercise01
 * Package: practice.multi_threading.threadCommunication
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/10 - 11:13
 * Version - v 1.0
 */


public class Exercise01 {
    public static void main(String[] args) {
        new PrintNumber().start();
        new PrintNumber().start();
    }
}
class PrintNumber extends Thread{
    private static int number;      //=0

    @Override
    public void run() {
        while(true){
            synchronized(PrintNumber.class){
                try {
                    PrintNumber.class.notify();
                    Thread.sleep(1000);
                    System.out.println(getName() + ":" + ++number);
                    PrintNumber.class.wait();
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
