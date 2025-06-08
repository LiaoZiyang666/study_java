package review.arrayAlgorithm01;

/**
 * ClassName: TestArrayMax
 * Package: review.arrayAlgorithm
 * Description: 求数组元素的最大值
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 10:56
 * Version - v 1.0
 */


public class TestArrayMax {
    public static void main(String[] args) {
        int[] arr = {4,6,2,43,67,1,5,98,7,9};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {//此处 i 从 1 开始，是 max 不需要与 arr[0]再比较一次了
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("max = "  + max);
    }
}
