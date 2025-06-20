package practice.API.collection_map.listTest;

import java.util.Objects;

/**
 * ClassName: Students
 * Package: practice.API.collection_map.listTest
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/20 - 15:06
 * Version - v 1.0
 */


public class Students {

    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Students students = (Students) object;
        return age == students.age && Objects.equals(name, students.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age);
//    }
}
