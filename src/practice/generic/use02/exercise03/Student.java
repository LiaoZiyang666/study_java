package practice.generic.use02.exercise03;

import java.util.Objects;

/**
 * ClassName: Student
 * Package: practice.generic.use02.exercise03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 22:53
 * Version - v 1.0
 */


public class Student<S> {
    private String name;
    private S score;

    public Student() {
    }

    public Student(String name, S score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public S getScore() {
        return score;
    }

    public void setScore(S score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Student<?> student = (Student<?>) object;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
