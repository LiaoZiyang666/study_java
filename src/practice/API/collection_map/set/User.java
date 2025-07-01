package practice.API.collection_map.set;

import java.util.Objects;

/**
 * ClassName: User
 * Package: practice.API.collection_map.set
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/6/29 - 09:15
 * Version - v 1.0
 */


public class User implements Comparable{
    private String name;
    private int age;

    public User() {
    }

    public User(String name, int age) {
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
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    /*
     * 比如：先比较年龄从小到大排列，如果年龄相同，则继续比较姓名，从大到小
     * */
    @Override
    public int compareTo(Object o) {
        if (this == o) {
            return 0;
        }

        if (o instanceof User) {
            User u = (User)o;
            int value = this.age - u.age;
            if (value != 0) {
                return value;
            }
            return -this.name.compareTo(u.name);

        }
        throw new RuntimeException("类型不匹配");
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        User user = (User) object;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
