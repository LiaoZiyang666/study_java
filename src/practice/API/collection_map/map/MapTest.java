package practice.API.collection_map.map;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * ClassName: MapTest
 * Package: practice.API.collection_map.map
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/30 - 08:48
 * Version - v 1.0
 */


public class MapTest {
    @Test
    public void test01(){
        Map map = new HashMap();    //HashMap:主要实现类;线程不安全的，效率高;可以添加null的key和value值;

        map.put(null, null);

        System.out.println(map);    //{null=null}
    }

    @Test
    public void test02(){
        Map map = new Hashtable();  //Hashtable:古老实现类;线程安全的，效率低;不可以添加null的key或value值;

//        map.put(null,null); //NullPointerException
//        map.put(null,123);  //NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
//        map.put("AA",null); //NullPointerException

        map.put("aa", 123); //{aa=123}

        System.out.println(map);
    }
    
    @Test
    public void test03(){
        HashMap map = new HashMap();

        //put(Object key, Object value)
        map.put("AA", 49);
        map.put(12,24);
        map.put(23, "aa");
        map.put(new Person("Mike", 23), 33);

        System.out.println(map);
        //size()
        System.out.println(map.size());

        //Object remove(Object key)
        Object value = map.remove("AA");
        System.out.println(value);//49
        System.out.println(map);

        //修改：Object put(Object key, Object value)
        Object oldValue = map.put(23, "cc");
        System.out.println(oldValue);//aa
        System.out.println(map);

        //Object get(Object key)
        Object value1 = map.get(12);
        System.out.println(value1);//24
    }
    
    @Test
    public void test04(){
        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put(new Person("Jerry",12),56);

        //遍历key集：Set keySet()
        Set keySet = map.keySet();
        //使用迭代器
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //遍历value集：Collection values()
        ///方式1：推荐
        Collection values = map.values();
        //for
        for (Object o : values) {
            System.out.println(o);
        }
    }

    @Test
    public void test05(){
        HashMap map = new HashMap();

        map.put("AA",56);
        map.put(67,"Tom");
        map.put("BB",78);
        map.put(new Person("Jerry",12),56);

        //方式1：遍历entry集， Set entrySet()
        Set entrySet = map.entrySet();
        Iterator iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            //①
//            System.out.println(iterator.next());
            //②
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
        //方式2：遍历entry集：keySet() 、get(key)
//        Set keySet = map.keySet();
//        for (Object key : keySet){
//            System.out.println(key + "---->" + map.get(key));
//        }
    }
}
