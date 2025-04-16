package practice.exception.throws02.test02;

/**
 * ClassName: TestTriangle
 * Package: practice.exception.throws02.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 17:33
 * Version - v 1.0
 */
public class TestTriangle {
    public static void main(String[] args) {

        Triangle triangle = null;
        try{
            triangle = new Triangle(2,2,3);
            System.out.println("三角形创建成功");
            System.out.println(triangle);//toString
        }catch (NotTriangleException e) {
            System.out.println("三角形创建失败");
            e.printStackTrace();
        }

        try {
            if (triangle != null) {
                triangle.setA(1);
            }
            System.out.println("三角形边长修改成功");
        }catch (NotTriangleException e) {
            System.out.println("三角形边长修改失败");
            e.printStackTrace();
        }

    }
}
