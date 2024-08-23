package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 78, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int max = scores[0], min = scores[0];
        // for (int i = 1; i < scores.length; i++) {
        // if (scores[i] > max) {
        // max = scores[i];
        // }
        // if (scores[i] < min) {
        // min = scores[i];
        // }
        // }

        for (int score : scores) {
            if (score > max) {
                max = score;
            }
            if (score < min) {
                min = score;
            }

        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
    }

}
