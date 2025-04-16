package practice.exception.throws02.test02;

/**
 * ClassName: NotTriangleException
 * Package: practice.exception.throws02.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 17:18
 * Version - v 1.0
 */
public class NotTriangleException extends Exception{
    static final long serialVersionUID = 123234435L;
    public NotTriangleException(){}
    public NotTriangleException(String message){
        super(message);
    }
}
