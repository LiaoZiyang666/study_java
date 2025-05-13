package test.排序算法;

import java.util.Arrays;

/**
 * ClassName: BubbleSort
 * Package: test.排序算法
 * Description: 冒泡排序--使用场景：仅适用于少量数据排序
 *
 * @author 廖子杨
 * CreateTime: 2025/5/21 - 10:32
 * Version - v 1.0
 */


public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,3,8,5,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        int[] arrays = {5,3,8,5,4,6,4,6,5,9,0};
        bubbleSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }
    //冒泡排序
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {       // 外层循环控制轮数
            for (int j = 0; j < n - 1 - i; j++) {       // 内层循环比较相邻元素
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    //冒泡排序优化
    public static void bubbleSortOptimized(int[] arr) {
        int n = arr.length;
        boolean swapped; // 标记是否发生交换
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;     //发生交换
                }
            }
            if (!swapped) {
                break; // 如果没有交换，提前结束
            }
        }
    }
}
