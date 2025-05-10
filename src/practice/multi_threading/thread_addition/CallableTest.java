package practice.multi_threading.thread_addition;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * ClassName: CallableTest
 * Package: practice.multi_threading.thread_addition
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/10 - 11:35
 * Version - v 1.0
 */

public class CallableTest {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumberThread numberThread = new NumberThread();
        //4.将此Callable接口实现类的对象作为实参传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask = new FutureTask(numberThread);
        //5.将FutureTask的对象作为实参传递到Thread类的构造器中，创建Thread对象，并调用start();
        new Thread(futureTask).start();

        //接收返回值
        try {
            //6.获取Callable中call方法的返回值
            //get()返回值即为FutureTask构造器参数Callable实现类重写的call()的返回值
            Object sum = futureTask.get();
            System.out.println("综合为：" + sum);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

/**
 * 创建多线程的方式三：实现Callable（jdk5.0新增的）
 */
//  1.创建一个实现Callable的实现类
class NumberThread implements Callable{
    //2.实现call方法，将此线程需要执行的操作声明在call()中

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
