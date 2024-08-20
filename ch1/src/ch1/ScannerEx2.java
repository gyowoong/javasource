package ch1;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {

        // 키보드에서 입력받을 준비
        Scanner sc = new Scanner(System.in);

        // 사용자가 어떤 값을 입력해야 하는지 알려주기
        System.out.println("숫자 하나를 입력해주세요");

        // 사용자가 입력하는 값을 변수에 담기
        int num = sc.nextInt();
        System.out.printf("num = %d\n", num);

        sc.close(); // 키보드 입력 종료
    }

}