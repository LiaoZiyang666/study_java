package practice.exception.throws01;

/**
 * ClassName: TestThrow
 * Package: practice.exception.throws01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 16:36
 * Version - v 1.0
 */
public class TestThrow {
    public static void main(String[] args) {
        try {
            System.out.println(max(3,4,4,55,6,2));
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(max(3));
        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(max());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int max (int... numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("没有传入任何整数，无法获取最大值");
        }
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
