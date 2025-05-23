package test.test02;

/**
 * ClassName: NoteBook
 * Package: test.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/15 - 20:37
 * Version - v 1.0
 */
public class NoteBook {
    //开机
    public void start(){
        System.out.println("开机");
    }

    //使用USB
    /*
       USB usb = mouse  多态
       USB usb = keyBoard 多态
     */
    public void useUSB(USB usb){
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.open();
            mouse.click();
            mouse.close();
        }else{
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.open();
            keyBoard.input();
            keyBoard.close();
        }
        //usb.open();
        //usb.close();
    }

    //关机
    public void stop(){
        System.out.println("关机");
    }
}
