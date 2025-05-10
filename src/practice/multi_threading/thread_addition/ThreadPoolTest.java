package practice.multi_threading.thread_addition;

import java.util.concurrent.*;

/**
 * ClassName: ThreadPoolTest
 * Package: practice.multi_threading.thread_addition
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/10 - 15:36
 * Version - v 1.0
 */


public class ThreadPoolTest {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);
        ThreadPoolExecutor service1 = (ThreadPoolExecutor) service;
        //设置线程池的属性
//        System.out.println(service.getClass()); //class java.util.concurrent.ThreadPoolExecutor
        service1.setMaximumPoolSize(50);    //设置线程池中线程数的上限
        //2.执行指定的线程操作。需要实现Runnable接口或者Callable接口实现类的对象
        service.execute(new NumberThread());    //适合适用于Runnable
        service.execute(new NumberThread1());   //适合适用于Runnable

        try {
            Future future = service.submit(new NumberThread2());    //适合适用于Callable
            System.out.println("总和为：" + future.get());
        }catch (Exception e ) {
            e.printStackTrace();
        }
        //3.关闭连接池
        service.shutdown();

    }
}

class NumberThread implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread2 implements Callable {
    @Override
    public Object call() throws Exception {
        int evenSum = 0;    //记录偶数的和
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        return evenSum;
    }
}