package ch3;

import java.util.Scanner;

public class ifEx4 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받은 후 입력 받은 숫자가 짝수, 홀수 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 >> ");

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        sc.close();

    }

}
