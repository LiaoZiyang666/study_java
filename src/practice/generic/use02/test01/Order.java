package practice.generic.use02.test01;

import java.util.ArrayList;

/**
 * ClassName: Order
 * Package: practice.generic.use02.test01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 16:14
 * Version - v 1.0
 */


public class Order<T>{
    T t;
    int number;

    public Order() {
    }

    public Order(T t, int number) {
        this.t = t;
        this.number = number;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Order{" +
                "t=" + t +
                ", number=" + number +
                '}';
    }

    //不可以在静态方法中使用类的泛型
//    public static void method1(){
//        System.out.println("t : " + t);
//    }

    //自定义泛型方法
    public <E> E method(E e){
        return null;
    }
    //定义泛型方法，将E[]数组元素添加到对应类型的ArrayList中，并返回
    public <E> ArrayList<E> copyFromArrayToList(E[] arr){
        ArrayList<E> list = new ArrayList<>();
        for(E e : arr){
            list.add(e);
        }

        return list;
    }
}
