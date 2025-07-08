package practice.generic.use01.test01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.function.Predicate;

/**
 * ClassName: EmployeeTest
 * Package: practice.generic.use01.test01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/8 - 17:21
 * Version - v 1.0
 */


public class EmployeeTest {
    public static void main(String[] args) {
        TreeSet<Employee> employees = new TreeSet<>();
        Employee e1 = new Employee("Tom", 23, new MyDate(2000, 2, 23));
        Employee e2 = new Employee("Jack", 34, new MyDate(2003, 3, 23));
        Employee e3 = new Employee("Tone", 13, new MyDate(1999, 4, 13));
        Employee e4 = new Employee("Rose", 66, new MyDate(2032, 4, 9));
        Employee e5 = new Employee("S", 54, new MyDate(2004, 12, 24));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

    @Test
    public void test(){
        Comparator<Employee> comparator = new Comparator<Employee>(){
            @Override
            public int compare(Employee o1, Employee o2) {
                int yearGap = o1.getBirthday().getYear() - o2.getBirthday().getYear();
                if (yearGap != 0){
                    return yearGap;
                }

                int monthGap = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if (monthGap != 0 ){
                    return monthGap;
                }

                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
            }
        };

        TreeSet<Employee> employees = new TreeSet<>(comparator);



        Employee e1 = new Employee("Tom", 23, new MyDate(2000, 2, 23));
        Employee e2 = new Employee("Jack", 34, new MyDate(2003, 3, 23));
        Employee e3 = new Employee("Tone", 13, new MyDate(1999, 4, 13));
        Employee e4 = new Employee("Rose", 66, new MyDate(2032, 4, 9));
        Employee e5 = new Employee("S", 54, new MyDate(2004, 12, 24));

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
    
    
    
    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (99 - 0 + 1));
            list.add(random);
        }
        for (Integer i : list) {
            System.out.println(i);
        }
        System.out.println("-------");
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }

    }
}
