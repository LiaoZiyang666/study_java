package practice.API.collection_map;

import java.util.ArrayList;
import java.util.Collections;

/**
 * ClassName: PokerTes他
 * Package: practice.API.collection_map
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/6 - 14:42
 * Version - v 1.0
 */


public class PokerTes01 {
    public static void main(String[] args) {
        String[] num ={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] color = {"方片","梅花","红桃","黑桃"};
        ArrayList poker = new ArrayList();

        //1.生成54张扑克牌
        for (String s1 : color) {
            for (String s2 : num) {
                poker.add(s1.concat(" " + s2));
            }
        }
        poker.add("大王");
        poker.add("小王");

//        System.out.println(poker);
//        [方片 A, 方片 2, 方片 3, 方片 4, 方片 5, 方片 6, 方片 7, 方片 8, 方片 9, 方片 10, 方片 J, 方片 Q, 方片 K,
//        梅花 A, 梅花 2, 梅花 3, 梅花 4, 梅花 5, 梅花 6, 梅花 7, 梅花 8, 梅花 9, 梅花 10, 梅花 J, 梅花 Q, 梅花 K,
//        红桃 A, 红桃 2, 红桃 3, 红桃 4, 红桃 5, 红桃 6, 红桃 7, 红桃 8, 红桃 9, 红桃 10, 红桃 J, 红桃 Q, 红桃 K,
//        黑桃 A, 黑桃 2, 黑桃 3, 黑桃 4, 黑桃 5, 黑桃 6, 黑桃 7, 黑桃 8, 黑桃 9, 黑桃 10, 黑桃 J, 黑桃 Q, 黑桃 K,
//        大王, 小王]

        //2.洗牌  Collections.shuffle() 随机排序
        Collections.shuffle(poker);
        System.out.println("随机排序：" + poker);



        //3.发牌
        ArrayList tomCards = new ArrayList();
        ArrayList jerryCards = new ArrayList();
        ArrayList meCards = new ArrayList();
        ArrayList lastCards = new ArrayList();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {
                lastCards.add(poker.get(i));
            } else if (i % 3 == 0) {
                tomCards.add(poker.get(i));
            } else if (i % 3 == 1) {
                jerryCards.add(poker.get(i));
            }else {
                meCards.add(poker.get(i));
            }
        }

        //4.看牌
        System.out.println("Tom:\n" + tomCards);
        System.out.println("Jerry:\n" + jerryCards);
        System.out.println("me:\n" + meCards);
        System.out.println("底牌:\n" + lastCards);


    }
}
