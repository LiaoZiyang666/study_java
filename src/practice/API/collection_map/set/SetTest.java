package practice.API.collection_map.set;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * ClassName: SetTest
 * Package: practice.API.collection_map.set
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/29 - 09:09
 * Version - v 1.0
 */


public class SetTest {
    @Test
    public void test01(){
        Set set = new HashSet();

        set.add("AA");
        set.add(123);
        set.add("BB");
        set.add(new Person("Tom", 12));
        set.add(new Person("Tom", 12));//无序性  不可重复性

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test02(){
        Set set = new LinkedHashSet();

        set.add("AA");
        set.add("AA");
        set.add(new Person("Tom",12));
        set.add(123);
        set.add("BB");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
