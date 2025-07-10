package practice.generic.use02.exercise02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * ClassName: Exercise
 * Package: practice.generic.use02.exercise02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 22:35
 * Version - v 1.0
 */


public class Exercise {
    //编写一个泛型方法，实现任意引用类型数组指定位置元素交换
    public static <E> void method1(E[] e, int a, int b) {
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }
    
    @Test
    public void test01(){
        String[] arr = new String[]{"AA","BB","CC"};
        method1(arr,0,2);
        for (String s : arr) {
            System.out.println(s);
        }
    }

    //编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    public static <E> void method2(E[] e){
        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }
    @Test
    public void test02(){
        Integer[] arr = new Integer[]{23,456,243,456,56,23,9,8,25,87,100};
        method2(arr);
        System.out.println(Arrays.toString(arr));
    }

}
