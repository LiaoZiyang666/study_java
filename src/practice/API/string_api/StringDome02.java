package practice.API.string_api;

import org.junit.Test;

/**
 * ClassName: StringDome02
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/11 - 10:43
 * Version - v 1.0
 */


public class StringDome02 {
    @Test
    public void test01(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);//true             == 比的是地址
        System.out.println(s1 == s3);//false
        System.out.println(s1 == s4);//false
        System.out.println(s3 == s4);//false

        System.out.println(s1.equals(s3));//true    equals 比的是内容
    }
    /*
     * 测试String的连接符：+
     * */
    @Test
    public void test3(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world"; //通过查看字节码文件发现调用了StringBuilder的toString()---> new String()
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s4);//true
        System.out.println(s3 == s5);//false
        System.out.println(s3 == s6);//false
        System.out.println(s3 == s7);//false
        System.out.println(s5 == s6);//false
        System.out.println(s5 == s7);//false
        System.out.println();

        String s8 = s5.intern(); //intern():返回的是字符串常量池中字面量的地址
        System.out.println(s3 == s8);//true

    }

    @Test
    public void test4(){
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;

        System.out.println(s3 == s5);//true
        System.out.println(s3 == s6);//true
        System.out.println(s3 == s7);//true
    }

    @Test
    public void test5(){
        String s1 = "hello";
        String s2 = "world";

        String s3 = s1.concat(s2);
        String s4 = "hello".concat("world");
        String s5 = s1.concat("world");
        //concat(xxx):不管是常量调用此方法，还是变量调用，同样不管参数是常量还是变量，总之，调用完concat()方法都返回一个新new的对象。

        System.out.println(s3 == s4);//false
        System.out.println(s3 == s5);//false
        System.out.println(s4 == s5);//false

    }
}
