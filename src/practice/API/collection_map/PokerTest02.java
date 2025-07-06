package practice.API.collection_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * ClassName: PokerTest02
 * Package: practice.API.collection_map
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/6 - 15:07
 * Version - v 1.0
 */


public class PokerTest02 {
    public static void main(String[] args) {
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] color = {"方片", "梅花", "红桃", "黑桃"};
        HashMap map = new HashMap();//存储索引和扑克牌
        ArrayList poker = new ArrayList();//存储索引
        int index = 0;//索引的开始值
        for (String s1 : color) {
            for (String s2 : num) {
                map.put(index, s1.concat(s2));
                poker.add(index);
                index++;
            }
        }

        map.put(index, "小王");
        poker.add(index);
        index++;
        map.put(index, "大王");
        poker.add(index);

        Collections.shuffle(poker);

        // 发牌
        TreeSet Tom = new TreeSet();
        TreeSet Jerry = new TreeSet();
        TreeSet me = new TreeSet();
        TreeSet lastCards = new TreeSet();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i)); // 将 list 集合中的索引添加到TreeSet 集合中会自动排序
            } else if (i % 3 == 0) {
                Tom.add(poker.get(i));
            } else if (i % 3 == 1) {
                Jerry.add(poker.get(i));
            } else {
                me.add(poker.get(i));
            }
        }
        // 看牌
        lookPoker("Tom", Tom, map);
        lookPoker("Jerry", Jerry, map);
        lookPoker("康师傅", me, map);
        lookPoker("底牌", lastCards, map);


    }
    public static void lookPoker(String name, TreeSet ts, HashMap map) {
        System.out.println(name + "的牌是:");
        for (Object index : ts) {
            System.out.print(map.get(index) + " ");
        }
        System.out.println();
    }

}
