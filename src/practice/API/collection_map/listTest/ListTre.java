package practice.API.collection_map.listTest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: ListTre
 * Package: practice.API.collection_map.listTest
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/20 - 15:10
 * Version - v 1.0
 */


public class ListTre {
    public static void main(String[] args) {

        System.out.println("请录入学生的信息！");
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("1:继续录入，0:结束录入");
            int index = scanner.nextByte();
            if (index == 0) {
                break;
            }

            System.out.print("请输入学生姓名: ");
            String name = scanner.next();

            System.out.print("请输入学生年龄: ");
            int age = scanner.nextInt();

            Students students = new Students(name,age);
            list.add(students);
        }

        System.out.println("遍历");
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        for (Object i : list) {
//            System.out.println(i);
//        }

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        scanner.close();
    }
}
