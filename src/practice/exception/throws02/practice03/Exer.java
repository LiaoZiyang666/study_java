package practice.exception.throws02.practice03;

/**
 * ClassName: Exer
 * Package: practice.exception.throws02.practice03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/18 - 10:44
 * Version - v 1.0
 */
public class Exer {
    public static void main(String[] args) {

//        Person person = new Person("Tom", -1);
//        System.out.println(person.getName() + person.getLifeValue());

//        Person person = new Person();
//        person.setLifeValue(1);
//        System.out.println(person.getLifeValue());//1

//        Person person = new Person();
//        person.setLifeValue(-1);
//        System.out.println(person.getLifeValue());
//Exception in thread "main" practice.exception.throws02.practice03.NoLifeValueException: 生命值不能为负数-1

        Person  person = new Person();
        try {
            person.setLifeValue(-9);
        } catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("end");
        }

    }
}
