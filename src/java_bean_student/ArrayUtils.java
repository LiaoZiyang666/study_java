package java_bean_student;

/**
 * ClassName: ArrayUtils
 * Package: java_bean_student
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/13 - 20:32
 * Version - v 1.0
 */
public class ArrayUtils {
    private ArrayUtils(){

    }

    public static int findIndexById(Student[] students,int id,int count){
        //遍历,查找
        for (int i = 0; i < count; i++) {
            if (id==students[i].getId()){
                return i;
            }
        }

        return -1;
    }
}
