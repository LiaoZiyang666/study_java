package practice.API.string_api;

import org.junit.Test;

/**
 * ClassName: StringDome01
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/11 - 10:20
 * Version - v 1.0
 */


public class StringDome01 {
    @Test
    public void test(){
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s2 == s1);
        
    }
    @Test
    public void test01(){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s2.replace('l','w');
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
