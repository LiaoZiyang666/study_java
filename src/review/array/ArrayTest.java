package review.array;

/**
 * ClassName: ArrayTest
 * Package: review.array
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/13 - 17:15
 * Version - v 1.0
 */


public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[]{8,2,1,0,3};
        int[] index = new int[]{2,0,3,4,0,1,3,2,3,3,};
        String tel = "";
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("联系方式：" + tel);
    }
}
