package review.array;

/**
 * ClassName: TriangleTest
 * Package: review.array
 * Description:
 * 案例 3：使用二维数组打印一个 10 行杨辉三角。
 * 提示：
 * 18. 第一行有 1 个元素, 第 n 行有 n 个元素
 * 19. 每一行的第一个元素和最后一个元素都是 1
 * 20. 从第三行开始, 对于非第一个元素和最后一个元素的元素。即：
 *triangleArrays[i][j] = triangleArrays[i - 1][j - 1] + triangleArrays[i - 1][j];
 *
 * @author 廖子杨
 * CreateTime: 2025/5/13 - 20:19
 * Version - v 1.0
 */


public class TriangleTest {
    public static void main(String[] args) {
        //1.创建总行数为10的二维数组
        int[][] triangleArrays = new int[10][];
        //2.用for循环，设置列数
        for (int i = 0; i < triangleArrays.length; i++) {
            triangleArrays[i] = new int[i + 1];
        }
        //3.杨辉三角
        for (int i = 0; i < triangleArrays.length; i++) {
            for (int j = 0; j < triangleArrays[i].length; j++) {
                if (j == 0) {                                 //j==0指向第一列
                    triangleArrays[i][j] = 1;
                } else if (j == triangleArrays[i].length - 1) {//j==triangleArrays[i].length - 1指向最后一列
                    triangleArrays[i][j] = 1;
                } else {
                    //给外层数组元素中的非首元素和非末元素赋值
                    //从 i == 2 开始执行
                    //非首元素和非末元素的角标范围1-8
                    triangleArrays[i][j] = triangleArrays[i - 1][j - 1] + triangleArrays[i - 1][j];
                }
            }
        }
        //遍历---运行成功
        for (int i = 0; i < triangleArrays.length; i++) {
            for (int j = 0; j < triangleArrays[i].length; j++) {
                System.out.print(triangleArrays[i][j] + "   ");
            }
            System.out.println();
        }


        //1. 动态初始化的方式创建二维数组
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //2. 给数组元素赋值
            // 2.1 给外层数组元素中的首元素和末元素赋值
            yangHui[i][0] = yangHui[i][i] = 1;
            //2.2 给外层数组元素中的非首元素和非末元素赋值（难）
            //if(i > 1){ //从 i == 2 开始执行
            for (int j = 1; j < yangHui[i].length - 1; j++) { //非首元素和非末元素的角标范围
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1]
                        [j];
            }
            //}
        }
        //3. 遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
