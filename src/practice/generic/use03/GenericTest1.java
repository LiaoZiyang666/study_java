package practice.generic.use03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Package: practice.generic.use03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/10 - 09:42
 * Version - v 1.0
 */


public class GenericTest1 {

    /**
     * " ? " 的使用
     */
    @Test
    public void test1(){
        List<?> list = null;
        List<Object> list1 = null;
        List<String> list2 = null;

        list = list1;
        list = list2;

        method1(list1);
        method1(list2);

    }

    public void method1(List<?> list){

    }

    @Test
    public void test2(){
        List<?> list = null;

        List<String> list1 = new ArrayList<>();

        list1.add("AA");

        list = list1;

        Object object = list.get(0);
        System.out.println(object);
    }
    
    
    @Test
    public void test3(){
        List<? extends Father> list = null;     //extends 代表 ≤  ：   ? ≤ Father

        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

//        list = list1;
        list = list2;
        list = list3;
    }

    @Test
    public void test4(){
        List<? super Father> list = null;     //super 代表 ≥ ：   ? ≥ Father

        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
//        list = list3;
    }


    /*
     * 针对于? extends A的读写
     * */
    @org.junit.Test
    public void test3_1(){
        List<? extends Father> list = null;

        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());
        list = list1;

        //读取数据：可以的
        Father father = list.get(0);

        //写入数据：不可以的。例外：null
        list.add(null);
//        list.add(new Father());
//        list.add(new Son());
    }

    @org.junit.Test
    public void test5(){
        List<? super Father> list = null;

        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

        list = list1;
        list = list2;
//        list = list3;
    }

    @org.junit.Test
    public void test5_1(){
        List<? super Father> list = null;
        List<Father> list1 = new ArrayList<>();
        list1.add(new Father());

        list = list1;
        //读取数据：可以的
        Object obj = list.get(0);

        //写入数据：可以将Father及其子类的对象添加进来
        list.add(null);
//        list.add(new Object());
        list.add(new Father());
        list.add(new Son());
    }

}
