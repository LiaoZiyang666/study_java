package practice.exception.throws02.practice02.deepseek;

/**
 * ClassName: InvalidScoreException
 * Package: practice.exception.throws02.practice02.deepseek
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 18:43
 * Version - v 1.0
 */
// 自定义异常类
public class InvalidScoreException extends Exception{
    public InvalidScoreException(String message) {
        super(message);
    }
}

