package test.test02;

/**
 * ClassName: Mouse
 * Package: test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/15 - 20:35
 * Version - v 1.0
 */
public class Mouse implements USB{
    @Override
    public void open() {
        System.out.println("鼠标开启");
    }

    @Override
    public void close() {
        System.out.println("鼠标关闭");
    }

    //特有方法
    public void click(){
        System.out.println("来呀,快点我");
    }
}
