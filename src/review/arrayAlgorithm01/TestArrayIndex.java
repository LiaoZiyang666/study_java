package review.arrayAlgorithm01;

/**
 * ClassName: TestArrayIndex
 * Package: review.arrayAlgorithm
 * Description:找最值及其第一次出现的下标
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 11:01
 * Version - v 1.0
 */


public class TestArrayIndex {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 1, 9};
        //找最大值以及第一个最大值下标
        int max = arr[0];
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        System.out.println("max = " + max);
        System.out.println("index = " + index);

        //遍历数组，看哪些元素和最大值是一样的，找最值及其所有最值的下标
        // for(int i=0; i<arr.length; i++){
        // if(max == arr[i]){
        // System.out.print(i+"\t");
        // }
        // }
        // System.out.println();
    }
}
