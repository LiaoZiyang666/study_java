package practice.generic.use03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Package: practice.generic.use03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/10 - 09:28
 * Version - v 1.0
 */


public class GenericTest {
    
    
    @Test
    public void test1(){
        Object object = null;
        String string = "AA";

        object = string;    //基于继承性的多态的使用

        Object[] objects = null;
        String[] strings = null;

        objects = strings;    //基于继承性的多态的使用
    }
    /**
     * 1. 类SuperA是类A的父类，则G<SuperA> 与 G<A>的关系：G<SuperA> 和 G<A>是并列的两个类，没有任何子父类的关系。
     *
     * 比如：ArrayList<Object> 、ArrayList<String>没有关系
     *
     * 2. 类SuperA是类A的父类或接口，SuperA<G> 与 A<G>的关系：SuperA<G> 与A<G> 有继承或实现的关系。
     * 即A<G>的实例可以赋值给SuperA<G>类型的引用（或变量）
     *
     * 比如：List<String> 与 ArrayList<String>
     */
    @Test
    public void test4(){
        List<String> list1 = null;
        ArrayList<String> list2 = new ArrayList<>();

        list1 = list2;

        list1.add("AA");

        method(list2);
    }

    public void method(List<String> list){

    }

}
