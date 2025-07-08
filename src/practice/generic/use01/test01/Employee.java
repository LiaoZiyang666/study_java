package practice.generic.use01.test01;

import java.util.Objects;

/**
 * ClassName: Employee
 * Package: practice.generic.use01.test01
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/8 - 17:17
 * Version - v 1.0
 */


public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Employee employee = (Employee) object;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}
