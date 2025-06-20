package practice.API.collection_map.listTest01;

import java.util.ArrayList;
import java.util.Collection;

/**
 * ClassName: ListTest01
 * Package: practice.API.collection_map.listTest01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/20 - 16:21
 * Version - v 1.0
 */


public class ListTest01 {
    public static void main(String[] args) {

        //需求1：随机生成30个字符，存放在ArrayList中
        ArrayList list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            //'a' - 'z' [97,122]
            list.add((char)(Math.random() * (122 - 97 + 1) + 97) + "");
        }
        System.out.println(list);

        int aCount = listTest(list, "a");
        int bCount = listTest(list, "b");
        int cCount = listTest(list, "c");
        int xCount = listTest(list, "x");

        System.out.println("a:" + aCount);
        System.out.println("b:" + bCount);
        System.out.println("c:" + cCount);
        System.out.println("x:" + xCount);
    }

    //需求2：遍历ArrayList，查找指定元素出现的次数
    public static int listTest(Collection list, String s){
        int count = 0;
        for (Object obj : list ) {
            if (s.equals(obj)) {
                count++;
            }
        }
        return count;
    }
}
