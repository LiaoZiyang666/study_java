package practice.generic.use02.test01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * ClassName: GenericTest
 * Package: practice.generic.use02.test01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 16:15
 * Version - v 1.0
 */


public class GenericTest {


    @Test
    public void test(){
        //实例化时，就可以指明类的泛型参数的类型
        Order order = new Order();
        Object obj = order.getT();

        //泛型参数在指明时，是不可以使用基本数据类的！但是可以使用包装类替代基本数据类型
//        Order<int> order1 = new Order<int>();   错误的
        //在实例化时，可以指明类的泛型参数的具体类型！一旦指明了泛型的类型，
        //则在泛型类中凡是使用泛型参数的位置，都可以替代为指定的类型
        Order<Integer> order1 = new Order<>();
        Integer t = order1.getT();

        Order<String> order2 = new Order<>();
        order2.setT("AA");
        String t1 = order2.getT();
        System.out.println(t1);

        

    }

    //测试Order的子类
    @Test
    public void test3(){
        //实例化SubOrder1
        SubOrder1 sub1 = new SubOrder1();
        Object t = sub1.getT();

//        SubOrder1<Integer> sub2 = new SubOrder1<>();//因为SubOrder1不是泛型类，此处编译错误
    }

    @Test
    public void test4(){
        SubOrder2 sub1 = new SubOrder2();
        Integer t = sub1.getT();


        SubOrder3<String> sub2 = new SubOrder3<>();
        String t1 = sub2.getT();
        sub2.show("AA");

        SubOrder4<String> sub3 = new SubOrder4<>();
        Integer t2 = sub3.getT();
        String e = sub3.getE();

        SubOrder5<String,Integer>  sub4 = new SubOrder5<>();
        String t3 = sub4.getT();
        Integer e1 = sub4.getE();



    }

    //测试泛型方法的使用
    @Test
    public void test5(){
        Order<String> order1 = new Order<>();

        Integer[] arr = new Integer[]{1,2,3,4,5};
        ArrayList<Integer> list = order1.copyFromArrayToList(arr);
        for(Integer i : list){
            System.out.println(i);
        }
    }
}
