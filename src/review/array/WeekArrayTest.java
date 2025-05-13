package review.array;

import java.util.Scanner;

/**
 * ClassName: WeekArrayTest
 * Package: review.array
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/13 - 17:21
 * Version - v 1.0
 */


public class WeekArrayTest {
    public static void main(String[] args) {
        //1.声明并初始化星期的数组
        String[] weeks = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //2.从Scanner获取1~7的范围的整数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入[1~7]范围的整数:");
        int number = scanner.nextInt();
        if (number < 1 || number > 7) {
            System.out.println("你的输入无效！");
        }else {
            //3.根据输入的整数，到数组中相应的索引位置获取指定元素（即：星期几）
            System.out.println("对应的星期为：" + weeks[number - 1]);
        }
        scanner.close();
    }
}
