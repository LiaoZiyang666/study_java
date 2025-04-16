package practice.exception.throws02.practice02;

/**
 * ClassName: ScoreReception
 * Package: practice.exception.throws02.practice02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 18:03
 * Version - v 1.0
 */
public class ScoreReception {


    public int method(int score) throws MyException {

        if (score < 0 || score > 100) {
            throw new MyException("学生成绩无效", 0);
        }else {
            System.out.println("学生成绩有效");
        }
        return score;


    }
}
