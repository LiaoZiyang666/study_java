package practice.exception.throws02.practice03;

/**
 * ClassName: Person
 * Package: practice.exception.throws02.practice03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/18 - 10:35
 * Version - v 1.0
 */
public class Person {
    //
    private String name;
    private int lifeValue;
    //

    public Person() {
    }

    public Person(String name, int lifeValue) {
        this.name = name;
        setLifeValue(lifeValue);
    }
    //


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) throws NoLifeValueException {
        if (lifeValue < 0) {

            throw new NoLifeValueException("生命值不能为负数" + lifeValue);
        }
        this.lifeValue = lifeValue;
    }
}
