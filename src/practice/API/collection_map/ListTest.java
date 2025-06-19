package practice.API.collection_map;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: ListTest
 * Package: practice.API.collection_map
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/19 - 15:47
 * Version - v 1.0
 */


public class ListTest {
    /*
    * 增
        add(Object obj)
        addAll(Collection coll)
    删
        remove(Object obj)
        remove(int index)
    改
        set(int index, Object ele)
    查
        get(int index)
    插
        add(int index, Object ele)
        addAll(int index, Collection eles)
    长度
        size()
    遍历
        iterator() ：使用迭代器进行遍历
        增强for循环
        一般的for循环
    *
    * */

    @Test
    public void test01() {

        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add("BB");
        list.add(123);//自动装箱
        list.add(new Person("Tom", 12));

        System.out.println(list.toString());

        //add(int index, Object ele)
        list.add(2, "CC");
        System.out.println(list);

        //addAll(int index, Collection eles)
        List list1 = Arrays.asList(1, 2, 3);
        list.addAll(1, list1);
//        list.add(1,list1); //将list1整体作为一个元素，插入到索引1的位置
        System.out.println(list);
    }

    @Test
    public void test02() {
        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add("BB");
        list.add(123);//自动装箱
        list.add(2);//自动装箱
        list.add(new Person("Tom",12));

//        查   get(int index)
        System.out.println(list.get(2));
        //删除索引2的元素
        list.remove(2);
        System.out.println(list);
        System.out.println(list.get(2));

    }

    @Test
    public void test03(){
        List list = new ArrayList();
        //add(Object obj)
        list.add("AA");
        list.add("BB");
        list.add(123);//自动装箱
        list.add(2);//自动装箱
        list.add(new Person("Tom", 22));

        //遍历方式1：使用迭代器
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //遍历方式2：增强for循环
//        for (Object object : list) {
//            System.out.println(object);
//        }

        //遍历方式3：一般的for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    class Person {
        String name;
        int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        @Override
        public boolean equals(Object object) {
            if (object == null || getClass() != object.getClass()) {
                return false;
            }
            CollectionTest.Person person = (CollectionTest.Person) object;
            return age == person.age && Objects.equals(name, person.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }


}
