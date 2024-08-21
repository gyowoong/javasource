package ch3;

import java.util.Scanner;

public class ifEx3 {
    public static void main(String[] args) {
        // 점수를 입력받아서
        // 90 이상이면 A, 98이상이면 A+, 94 이상이면 A0, 94미만이면 A-
        // 80 이상이면 B, 88이상이면 B+, 84 이상이면 B0, 84미만이면 B-

        char grade = ' ', opt = '0';

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 입력 >> ");

        int jumsu = sc.nextInt(); // 입력 받는 코드

        if (jumsu >= 90) {
            grade = 'A';
            if (jumsu >= 98) {
                opt = '+';
            } else if (jumsu < 94) {
                opt = '-';
            }
        } else if (jumsu >= 80) {
            grade = 'B';
            if (jumsu >= 88) {
                opt = '+';
            } else if (jumsu < 84) {
                opt = '-';
            }
        }

        System.out.printf("점수 : %d, 학점 : %c%c", jumsu, grade, opt);
        sc.close();

    }

}
