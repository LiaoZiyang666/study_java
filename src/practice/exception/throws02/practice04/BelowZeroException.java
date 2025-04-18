package practice.exception.throws02.practice04;

/**
 * ClassName: DivisionDemo
 * Package: practice.exception.throws02.practice04
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/18 - 11:06
 * Version - v 1.0
 */
public class BelowZeroException extends Exception{
    static final long serialVersionUID = 3213353451L; //serialVersionUID
    public BelowZeroException() {}
    public BelowZeroException(String message) {
        super(message);
    }
}
