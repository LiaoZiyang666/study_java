package practice.API.collection_map.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: Exer02
 * Package: practice.API.collection_map.set
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/29 - 10:06
 * Version - v 1.0
 */


public class Exer02 {
    public static void main(String[] args) {

        Set set = new HashSet();

        while (set.size() < 10) {
            int random = (int) (Math.random() * (10 - 1 + 1) + 1);
            set.add(random);
        }

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
