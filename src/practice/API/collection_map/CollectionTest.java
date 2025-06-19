package practice.API.collection_map;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: CollectionTest
 * Package: practice.API.list
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/19 - 10:12
 * Version - v 1.0
 */


public class CollectionTest {
    class Person{
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
            Person person = (Person) object;
            return age == person.age && Objects.equals(name, person.name);
        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(name, age);
//        }
    }
    @Test
    public void test01(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Object());
        coll.add(new Person("Tom",12));

        System.out.println(coll);//[AA, 123, java.lang.Object@5e316c74, Person{name='Tom', age=12}]

        Collection collection = new ArrayList();
        collection.add("BB");
        collection.add(456);

        coll.addAll(collection);
        System.out.println(coll);//[AA, 123, java.lang.Object@5e316c74, Person{name='Tom', age=12}, BB, 456]
        
        coll.add(collection);
        System.out.println(coll);//[AA, 123, java.lang.Object@5e316c74, Person{name='Tom', age=12}, BB, 456, [BB, 456]]
    }

    @Test
    public void test02(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom",12));

        System.out.println(coll.size());
        System.out.println(coll.isEmpty());
        System.out.println(coll.contains(123));
        System.out.println(coll.contains(new Person("Tom",12)));//比较内容时，要重写equals方法

        Collection coll1 = new ArrayList();
        coll1.add("AA");
        coll1.add(123);

        System.out.println("kj" + coll.containsAll(coll1));

    }

    @Test
    public void test03(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom",12));

        System.out.println(coll);
//        coll.clear();
//        System.out.println(coll);//[] size = 0

//        System.out.println(coll.remove("AA"));
//        System.out.println(coll);

//        Collection coll1 = new ArrayList();
//        coll1.add("AA");
//        coll1.add(123);
//        System.out.println(coll.removeAll(coll1));
//        System.out.println(coll);

        Collection coll1 = new ArrayList();
        coll1.add("AA");
        System.out.println(coll.retainAll(coll1));
        System.out.println(coll);

    }
    @Test
    public void test04(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom",12));

        System.out.println(coll);

        Object[] arr = coll.toArray();
        System.out.println(Arrays.toString(arr));

        System.out.println(coll.hashCode());//552700789
    }
    
    @Test
    public void test05(){
        Collection coll = new ArrayList();

        //add()
        coll.add("AA");
        coll.add(123);
        coll.add(new Person("Tom",12));

        System.out.println(coll);

        Iterator iterator = coll.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * 增强for循环          for(元素的数据类型 形参名 : 容器名){ 方法体 }
     *                      容器会将元素赋值给形参，可以用形参执行遍历-----> 只适用遍历
     *                      增强for循环的底层仍然使用的时迭代器
     */
    @Test
    public void test06(){
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        for (int i : arr) {
            System.out.println(i);
        }

        String[] str = new String[]{"aa", "bb", "cc", "dd"};
        for (String s : str){
            System.out.println(s);
        }
    }





}
