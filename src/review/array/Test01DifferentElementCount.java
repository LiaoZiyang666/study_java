package review.array;

/**
 * ClassName: Test01DifferentElementCount
 * Package: review.array
 * Description:
 *
 *
 * @author 廖子杨
 * CreateTime: 2025/5/13 - 19:16
 * Version - v 1.0
 */

/*
1
2 2
3 3 3
4 4 4 4
5 5 5 5 5
*/

public class Test01DifferentElementCount {
    public static void main(String[] args) {
        //  1.先创建总行数为5的二维数组arrays[5][]
        int[][] arrays = new int[5][];
        //  2.通过遍历增添一维数组元素

        for (int i = 0; i < arrays.length; i++) {
            arrays[i] = new int[i+1];
            for (int j = 0; j <= i; j++) {
                arrays[i][j] = i + 1;
            }
        }

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.print(arrays[i][j]);
            }
            System.out.println();
        }
    }
}
//  (1)先确定总行数
//  元素的数据类型[][] 二维数组名 = new 元素的数据类型[总行数][];     此时只是确定了总行数，每一行里面现在是 null
//  (2)再确定每一行的列数，创建每一行的一维数组
//  二维数组名[行下标] = new 元素的数据类型[该行的总列数];--此时已经 new 完的行的元素就有默认值了，没有 new 的行还是 null
//  (3)再为元素赋值
//  二维数组名[行下标][列下标] = 值;

