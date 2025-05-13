package practice.API.string_api;

/**
 * ClassName: StringTest
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/12 - 15:16
 * Version - v 1.0
 */

public class StringTest01 {
    public static void main(String[] args) {
        StringObjectTest01 t1 = new StringObjectTest01();
        t1.test001(t1.str, t1.ch);
        System.out.println(t1.str);
        for (int i = 0; i < t1.ch.length; i++) {
            System.out.println(t1.ch[i]);
        }
    }
}

class StringObjectTest01 {
    String str = new String("good");
    char ch[] = {'a', 'b', 'c', 'd'};
    public void test001(String str, char ch[]){
        str = "ok";
        ch[0] = 'y';
    }
}