package practice.exception.throws02.test02;

/**
 * ClassName: Triangle
 * Package: practice.exception.throws02.test02
 * Description:
 *
 * @author 廖子杨
 * CreateTime: 2025/4/16 - 17:21
 * Version - v 1.0
 */
public class Triangle {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) throws NotTriangleException{
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new NotTriangleException("三角形的边长必须是整数");
        }
        if (a+b <= c || b+c <= a || c+a <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形， 三角形任意两边之和必须大于第三边");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) throws NotTriangleException {
        if (c <= 0) {
            throw new NotTriangleException("三角形的边长必须是整数");
        }
        if (a+b <= c || b+c <= a || c+a <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形， 三角形任意两边之和必须大于第三边");
        }
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) throws NotTriangleException{
        if (b <= 0) {
            throw new NotTriangleException("三角形的边长必须是整数");
        }
        if (a+b <= c || b+c <= a || c+a <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形， 三角形任意两边之和必须大于第三边");
        }
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) throws NotTriangleException {
        if (a <= 0) {
            throw new NotTriangleException("三角形的边长必须是整数");
        }
        if (a+b <= c || b+c <= a || c+a <= b) {
            throw new NotTriangleException(a + "," + b + "," + c + "不能构造三角形， 三角形任意两边之和必须大于第三边");
        }
        this.a = a;
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + "}";
    }
}
