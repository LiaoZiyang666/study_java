package practice.exception.throws02.practice01;

/**
 * ClassName: ReturnException
 * Package: practice.exception.throws02.test03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 17:47
 * Version - v 1.0
 */
public class ReturnException {
    static void methodA() {
        try {
            System.out.println("进入方法A");
            throw new RuntimeException("制造异常");
        }finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        }finally {
            System.out.println("用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        methodB();
    }
    //进入方法A
    //用A方法的finally
    //制造异常
    //进入方法B
    //用B方法的finally

}
