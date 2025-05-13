package review.array;

import java.util.Scanner;

/**
 * ClassName: ScoreTest
 * Package: review.array
 * Description:
 * 案例 3：从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * • 成绩>=最高分-10 等级为’A’
 * • 成绩>=最高分-20 等级为’B’
 * • 成绩>=最高分-30 等级为’C’
 * • 其余 等级为’D’
 * 提示：先读入学生人数，根据人数创建 int 数组，存放学生成绩。
 *
 * @author 廖子杨
 * CreateTime: 2025/5/13 - 17:28
 * Version - v 1.0
 */
//方法1：最高分     方法2：分组

public class ScoreTest {
    public static void main(String[] args) {
        //  1.从键盘输入学生人数和成绩
        //① 获取学生人数
        System.out.print("请输入学生的人数：");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextByte(); //index代表了学生人数，也是成绩数组的长度
        //② 创建成绩数组（成绩的范围：0~100）
        int[] scoreArray = new int[index];
        //③ 通过遍历输入成绩
        for (int i = 0; i < scoreArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位学生的成绩：");
            int number = scanner.nextInt();
            scoreArray[i] = number;
        }
        //④ 调用最高分方法
        int max = maxScore(scoreArray);
        System.out.println("最高分为：" + max);

        //⑤ 输出学生成绩等级的方法
        grouping(scoreArray, max);
        //资源关闭
        scanner.close();


    }

    //2.最高分方法
    public static int maxScore(int[] scoreArray){
        int maxNumber = scoreArray[0];
        int temp;
        for (int i = 1; i < scoreArray.length; i++) {
            if (maxNumber < scoreArray[i]){
                temp = maxNumber;
                maxNumber = scoreArray[i];
                scoreArray[i] = temp;
            }
        }
        return maxNumber;
    }
    //3.输出学生成绩等级的方法
    // * • 成绩>=最高分-10 等级为’A’
    // * • 成绩>=最高分-20 等级为’B’
    // * • 成绩>=最高分-30 等级为’C’
    // * • 其余 等级为’D’
    public static void grouping(int[] scoreArray, int max) {
        for (int i = 0; i < scoreArray.length; i++) {
            if (scoreArray[i] >= max - 10) {
                System.out.println("第一位的学生成绩等级为：A");
            }else if (scoreArray[i] >= max - 20) {
                System.out.println("第一位的学生成绩等级为：B");
            }else if (scoreArray[i] >= max - 30) {
                System.out.println("第一位的学生成绩等级为：C");
            }else{
                System.out.println("第一位的学生成绩等级为：D");
            }
        }
    }
}
