package practice.exception.throws02.practice04;

import java.util.Scanner;

/**
 * ClassName: DivisionDemo
 * Package: practice.exception.throws02.practice04
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/18 - 11:09
 * Version - v 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            divide(a,b);
        }catch (BelowZeroException e) {
            e.printStackTrace();
        }catch (NumberFormatException e) {
            e.printStackTrace();
        }catch (ArrayIndexOutOfBoundsException e ) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    static void divide(int a, int b) throws BelowZeroException {

        if (a < 0 || b < 0) {
            throw new BelowZeroException("不能输入负数");
        }
        int sum = a / b;
        System.out.println("a / b = " + sum);

    }

}
