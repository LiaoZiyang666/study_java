package practice.API.string_api;

import org.junit.Test;

/**
 * ClassName: EfficiencyTest
 * Package: practice.API.string_api
 * Description:
 * – StringBuffer:可变的字符序列；线程安全（方法有 synchronized 修饰），效
 * 率低；底层使用 char[]数组存储 (JDK8.0 中)
 * – StringBuilder:可变的字符序列； jdk1.5 引入，线程不安全的，效率高；底
 * 层使用 char[]数组存储(JDK8.0 中)
 * --------效率测试
 *
 * @author 廖子杨
 * CreateTime: 2025/5/27 - 16:53
 * Version - v 1.0
 */


public class EfficiencyTest {
    public static void main(String[] args) {
        //初始设置
        long startTime = 0L;
        long endTime = 0L;
        String text = "";
        StringBuffer buffer = new StringBuffer("");
        StringBuilder builder = new StringBuilder("");
        //开始对比
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的执行时间" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的执行时间" + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的执行时间" + (endTime - startTime));
    }
    //StringBuffer的执行时间2毫秒
    //StringBuilder的执行时间1
    //String的执行时间171
    @Test
    public void test(){
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);//Cannot invoke "String.length()" because "str" is null
        System.out.println(sb1);//NullPointerException

    }
}
