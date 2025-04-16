package practice.exception.throws02.test01;

/**
 * ClassName: MyExceptionTest
 * Package: practice.exception.throws02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 16:59
 * Version - v 1.0
 */
class MyExceptionTest {
    public void regist(int number) throws MyException{
        if (number < 0) {
            throw new MyException("人数为负值，不合理", 3);
        } else {
            System.out.println("登记人数：" + number);
        }
    }
    public void manager(){
            try {
                regist(-1);
            }catch (MyException e) {
                e.printStackTrace();
                System.out.println("登记失败，出错种类" + e.getIdNumber());
            }
            System.out.println("本次登记操作结束");
        }


    public static void main(String[] args) {
        MyExceptionTest test = new MyExceptionTest();
        test.manager();
    }
}
