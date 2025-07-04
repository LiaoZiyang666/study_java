package review.arrayAlgorithm01;

/**
 * ClassName: TestSubarraySum
 * Package: review.arrayAlgorithm
 * Description:
 * 输入一个整形数组，数组里有正数也有负数。数组中连续的一个或
 * 多个整数组成一个子数组，每个子数组都有一个和。求所有子数组的和的最大
 * 值。要求时间复杂度为 O(n)。 例如：输入的数组为 1, -2, 3, 10, -4, 7, 2, -5，
 * 和最大的子数组为 3, 10, -4, 7, 2，因此输出为该子数组的和 18。
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 11:21
 * Version - v 1.0
 */


public class TestSubarraySum {
    public static void main(String[] args) {
        int[] arr = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
        int i = getGreatestSum(arr);
        System.out.println(i);
    }
    public static int getGreatestSum(int[] arr){
        int greatestSum = 0;
        if(arr == null || arr.length == 0){
            return 0;
        }
        int temp = greatestSum;
        for(int i = 0;i < arr.length;i++){
            temp += arr[i];
            if(temp < 0){
                temp = 0;
            }
            if(temp > greatestSum){
                greatestSum = temp;
            }
        }
        if(greatestSum == 0){
            greatestSum = arr[0];
            for(int i = 1;i < arr.length;i++){
                if(greatestSum < arr[i]){
                    greatestSum = arr[i];
                }
            }
        }
        return greatestSum;
    }
}
