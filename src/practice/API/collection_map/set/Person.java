package practice.API.collection_map.set;

import java.util.Objects;

/**
 * ClassName: Person
 * Package: practice.API.collection_map.set
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/29 - 09:07
 * Version - v 1.0
 */


public class Person {
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Person person = (Person) object;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
