package practice.exception.throws02.practice02;

import java.util.Scanner;

/**
 * ClassName: Test
 * Package: practice.exception.throws02.practice02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 18:13
 * Version - v 1.0
 */
public class Test {
    public static void main(String[] args) {
        ScoreReception scoreReception = new ScoreReception();
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入学生成绩：");
        int score = scanner.nextInt();
        try {
            int number = scoreReception.method(score);
            System.out.println("学生成绩为：" + number);
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("学生成绩无效,学生成绩判为：" + e.getScore());
        }finally {
            System.out.println("资源关闭");
            scanner.close();
        }
    }
}
