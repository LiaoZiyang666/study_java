package practice.exception.throws02.test01;

/**
 * ClassName: MyException
 * Package: practice.exception.throws02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 16:55
 * Version - v 1.0
 */
class MyException extends Exception{
    static final long serialVersionUID = 234342342L;
    private int idNumber;

    public MyException () {}

    public MyException(String message, int id) {
        super(message);
        this.idNumber = id;
    }

    public int getIdNumber() {
        return idNumber;
    }
}
