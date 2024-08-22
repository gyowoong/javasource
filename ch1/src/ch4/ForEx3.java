package ch4;

public class ForEx3 {
    public static void main(String[] args) {
        // 구구단 5단 출력
        // 5 * 1 = 5
        // 5 * 2 = 10
        // 5 * 3 = 15
        // 5 * 4 = 20
        for (int i = 1; i < 10; i++) {
            // System.out.printf("5 * %d = %2d\n", i, (5 * i));
            System.out.printf("5 * %d = %2d\t", i, (5 * i)); // t = 옆으로 배열
        }

        for (int i = 1, j = 1; i < 10 && i * j < 50; i++, j += 2) {

        }
    }

}
