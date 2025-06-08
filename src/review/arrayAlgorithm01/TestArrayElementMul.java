package review.arrayAlgorithm01;

/**
 * ClassName: TestArrayElementMul
 * Package: review.arrayAlgorithm
 * Description: 求数组元素的总乘积
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 10:48
 * Version - v 1.0
 */


public class TestArrayElementMul {
    public static void main(String[] args) {
        int[] arr = {4,6,2,4,8,3};

        long result = 1;
        for (int i = 0; i < arr.length; i++) {
            result *= arr[i];
        }

        System.out.println("result = " + result);//result = 4608
    }
}
