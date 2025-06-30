package practice.API.collection_map.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer01
 * Package: practice.API.collection_map.set
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/29 - 09:54
 * Version - v 1.0
 */


public class Exer01 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add(32);
        list.add(32);
        list.add(32);
        list.add(98);
        list.add(98);
        list.add(98);
        list.add(53);
        list.add(53);
        list.add(53);

        List newList = duplicateList(list);
        System.out.println(newList);
    }

    public static List duplicateList(List list) {
//        //方式1
//        HashSet set = new HashSet();
//        for (Object obj : list) {
//            set.add(obj);
//        }
//
//        List list1 = new ArrayList();
//        for (Object obj : set){
//            list1.add(obj);
//        }

        //方式2
        HashSet set = new HashSet(list);
        List list1 = new ArrayList(set);
        return list1;
    }
}
