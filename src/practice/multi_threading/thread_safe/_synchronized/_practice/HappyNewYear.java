package practice.multi_threading.thread_safe._synchronized._practice;

/**
 * ClassName: HappyNewYear
 * Package: practice.multi_threading.thread_safe._synchronized._practice
 * Description:模拟新年倒计时，每隔1秒输出一个数字，依次输出10,9,8......1，最后输出：新年快乐！
 *
 * @author 廖子杨
 * CreateTime: 2025/4/26 - 11:18
 * Version - v 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {
        System.out.println("新年倒计时!");
        for (int i = 10; i > 0; i--) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
        System.out.println("新年快乐！");

    }
}
