package practice.exception.throws02.practice03;

/**
 * ClassName: NoLifeValueException
 * Package: practice.exception.throws02.practice03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/18 - 10:31
 * Version - v 1.0
 */
public class NoLifeValueException extends RuntimeException{
    static final long serialVersionUID = 13124345345L;

    public NoLifeValueException() {}

    public NoLifeValueException(String message) {
        super(message);
    }
}
