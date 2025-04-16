package practice.exception.throws02.practice02.deepseek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreValidator {
    /**
     * 从键盘接收并验证学生成绩
     * @return 有效的成绩值
     * @throws InvalidScoreException 当输入无效时抛出
     */
    public static int getValidScore() throws InvalidScoreException {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("请输入学生成绩（0-100）：");
            int score = scanner.nextInt();

            // 验证成绩范围
            if (score < 0 || score > 100) {
                throw new InvalidScoreException("成绩超出有效范围");
            }

            return score;
        } catch (InputMismatchException e) {
            // 处理非数字输入
            throw new InvalidScoreException("请输入数字格式的成绩");
        } finally {
            scanner.close();
        }
    }

    public static void main(String[] args) {
        try {
            int finalScore = getValidScore();
            System.out.println("有效成绩：" + finalScore);
        } catch (InvalidScoreException e) {
            System.out.println("输入错误：" + e.getMessage());
        }
    }
}
