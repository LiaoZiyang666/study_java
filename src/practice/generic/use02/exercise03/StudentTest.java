package practice.generic.use02.exercise03;

/**
 * ClassName: StudentTest
 * Package: practice.generic.use02.exercise03
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/7/9 - 22:55
 * Version - v 1.0
 */


public class StudentTest {
    public static void main(String[] args) {
        /*
        *   语文老师希望成绩是“优秀”、“良好”、“及格”、“不及格”，数学老师希望成绩是89.5, 65.0，
            英语老师希望成绩是'A','B','C','D','E'
        * */
        Student<String> s1 = new Student<>("Tom", "良好");

        Student<Double> s2 = new Student<>("Java", 87.3);

        Student<Character> s3 = new Student<>("My", 'A');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
