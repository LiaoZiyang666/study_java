package review.arrayAlgorithm01;

/**
 * ClassName: TestScore
 * Package: review.arrayAlgorithm
 * Description:     评委打分
 * （1）在编程竞赛中，有 10 位评委为参赛的选手打分，分数分别为：5，4，
 * 6，8，9，0，1，2，7，3
 * （2）求选手的最后得分（去掉一个最高分和一个最低分后其余 8 位评委打分的
 * 平均值）
 *
 * @author 廖子杨
 * CreateTime: 2025/6/8 - 11:35
 * Version - v 1.0
 */


public class TestScore {
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};
        int max = scores[0];
        int min = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (max < scores[i]) {
                max  = scores[i];
            }
            if (min > scores[i]) {
                min = scores[i];
            }
        }
        
        int sum = 0;
        for (int i = 0; i <scores.length ; i++) {
            sum += scores[i];
        }

        sum -= (max + min);
        System.out.println("Scores:" + sum/8);
    }
}
