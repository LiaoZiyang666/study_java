package review.arrayAlgorithm01;

/**
 * ClassName: TestArrayElementCount
 * Package: review.arrayAlgorithm
 * Description: 求数组元素中偶数的个数
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 10:51
 * Version - v 1.0
 */


public class TestArrayElementCount {
    public static void main(String[] args) {
        int[] arr = {4,7,233,5,8,3,12,7,4};

        int evenCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            }
        }

        System.out.println("evenCount = " + evenCount);

    }
}
