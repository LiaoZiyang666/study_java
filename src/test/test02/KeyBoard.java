package test.test02;

/**
 * ClassName: KeyBoard
 * Package: test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/15 - 20:36
 * Version - v 1.0
 */
public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘开启");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭");
    }

    //特有功能
    public void input(){
        System.out.println("来呀,敲我呀!");
    }
}
