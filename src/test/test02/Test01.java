package test.test02;

/**
 * ClassName: Test01
 * Package: test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/15 - 20:37
 * Version - v 1.0
 */
public class Test01 {
    public static void main(String[] args) {
        NoteBook noteBook = new NoteBook();
        Mouse mouse = new Mouse();
        noteBook.start();
        noteBook.useUSB(mouse);
        noteBook.stop();

        System.out.println("===========");
        KeyBoard keyBoard = new KeyBoard();
        noteBook.start();
        noteBook.useUSB(keyBoard);
        noteBook.stop();
    }
}
