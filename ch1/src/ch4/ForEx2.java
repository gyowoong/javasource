package ch4;

public class ForEx2 {
    public static void main(String[] args) {
        // 1 ~ 100까지의 합
        int sum = 0;
        for (int i = 1; i < 101; i++) {
            sum = sum + i;
        }
        System.out.println("1~100의 합 : " + sum);

        // 1~100까지 홀수의 합
        sum = 0;
        for (int i = 1; i < 101; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100까지의 홀수의 합 : " + sum);
    }

}
