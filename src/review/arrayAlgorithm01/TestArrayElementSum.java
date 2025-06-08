package review.arrayAlgorithm01;

/**
 * ClassName: TestArrayElementSum
 * Package: review.arrayAlgorithm
 * Description: 求总和 ，均值
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 10:42
 * Version - v 1.0
 */


public class TestArrayElementSum {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum/arr.length;

        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
//sum = 39
//avg = 6.5