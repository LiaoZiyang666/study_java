package practice.exception.throws02.practice02;

/**
 * ClassName: MyException
 * Package: practice.exception.throws02.practice02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 17:57
 * Version - v 1.0
 */
class MyException extends Exception {
    static final long serialVersionUID = 1123342335L;
    private int score;

    public MyException(){}
    public MyException(String message, int number) {
        super(message);
        this.score = number;
    }

    public int getScore() {
        return score;
    }
}
