package practice.generic.use01;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Package: practice.generic.use01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/8 - 16:47
 * Version - v 1.0
 */


public class CollectionMapTest {


    //体会集合中使用泛型前的场景
    @Test
    public void test01() {
        List list = new ArrayList();
        list.add(69);
        list.add(100);
        list.add(34);
//        1.问题①：类型不安全。因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功
//        list.add("aa");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            //2.问题2：需要使用强转操作，繁琐。还有可能导致ClassCastException异常。
            Integer i = (Integer) iterator.next();
            int score = i;
            System.out.println(score);
        }
    }

    //在集合中使用泛型的例子
    @Test
    public void test02(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(78);
        list.add(76);
        list.add(66);

//        list.add("aa");           编译报错，保证类型的安全
//        'java.util.List' 中的 'add(java.lang.Integer)' 无法应用于 '(java.lang.String)'
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            //因为添加的都是Integer类型，避免了强转操作
            Integer i = iterator.next();
            int score = i;
            System.out.println(i);
        }
    }


    /*
     * 泛型在Map中使用的例子
     * */
    @Test
    public void test03(){
//        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //类型推断
        HashMap<String, Integer> map = new HashMap<>();

        map.put("aa", 99);
        map.put("tang", 34);
        map.put("ss", 66);

//        Set<Map.Entry<String, Integer>> entries = map.entrySet();
//        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();



        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            String key = next.getKey();
            Integer value = next.getValue();
            System.out.println(key + "--->" + value);
//            System.out.println("====" + next);
        }

    }






}
