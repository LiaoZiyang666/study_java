package practice.API.collection_map.map;

import org.junit.jupiter.api.Test;
import practice.API.collection_map.set.User;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMap
 * Package: practice.API.collection_map.map
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/1 - 10:59
 * Version - v 1.0
 */


public class TreeMapTest {
    /**
     * 自然排序
     */
    @Test
    public void test1(){
        TreeMap map = new TreeMap();

        map.put("cc", 29);
        map.put("dd", 234);
        map.put("jj", 94);
        map.put("ii", 932);

//        map.put(34,43);//报错。因为key的类型（Integer)与之前的key的类型（String）不一致

        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            System.out.println(entry);
        }
    }


    @Test
    public void test2(){
        TreeMap map = new TreeMap();

        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Rose",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        map.put(u1,78);
        map.put(u2,76);
        map.put(u3,88);
        map.put(u4,45);
        map.put(u5,99);

        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            System.out.println(entry);
        }
    }
    
    @Test
    public void test3(){
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User)o1;
                    User u2 = (User)o2;

                    int value = u1.getName().compareTo(u2.getName());
                    if (value != 0) {
                        return value;
                    }
                    return u1.getAge() - u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        };

        TreeMap map = new TreeMap();

        User u1 = new User("Tom",23);
        User u2 = new User("Jerry",43);
        User u3 = new User("Rose",13);
        User u4 = new User("Jack",23);
        User u5 = new User("Tony",33);

        map.put(u1,78);
        map.put(u2,76);
        map.put(u3,88);
        map.put(u4,45);
        map.put(u5,99);

        Set entrySet = map.entrySet();
        for (Object entry : entrySet) {
            System.out.println(entry);
        }


    }
}
