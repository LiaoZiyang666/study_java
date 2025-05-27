package practice.API.string_api;

import org.junit.Test;

/**
 * ClassName: Test01
 * Package: practice.API.string_api
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/5/27 - 13:24
 * Version - v 1.0
 */


public class Test01 {
    /**
     * StringBuffer append(xx)：提供了很多的 append()方法，用于进行字符串追加的方式拼接
     */
    @Test
    public void test01(){
        StringBuilder s = new StringBuilder("你好");    //你好  2
        s.append(",我是张三");  //你好,我是张三  7
        s.append(",来自中国").append(",现在是一名大学生");  //你好,我是张三,来自中国,现在是一名大学生  21

        System.out.println(s);
        System.out.println(s.length());
    }
    /**
     * StringBuffer insert(int index, xx)：在[index]位置之前插入 xx
     */
    @Test
    public void test02(){
        StringBuilder s = new StringBuilder();
        s.append("hello world");    //hellojava world,15
        s.insert(5, "java");

        System.out.println(s + "," + s.length());
    }

    /**
     * StringBuffer delete(int start, int end)：删除[start,end)之间字符
     */
    @Test
    public void test03(){
        StringBuilder s = new StringBuilder("java666");
        s.delete(4,7);  //java,4
        System.out.println(s + "," + s.length());
    }

    /**
     * StringBuffer reverse()：反转
     */
    @Test
    public void test04(){
       StringBuilder s = new StringBuilder("12345");
       s.reverse();
       System.out.println(s + "," + s.length());

    }
    /**
     * void setLength(int newLength) ：设置当前字符序列长度为 newLength
     */
    @Test
    public void test05(){
        StringBuilder s = new StringBuilder("java");//4
        s.setLength(6);
        System.out.println(s.length());
    }


}
