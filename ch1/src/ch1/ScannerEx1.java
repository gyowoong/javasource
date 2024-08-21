package ch1;

import java.time.LocalDate;

import java.util.Scanner;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 대문자로 시작을 한다면 class or interface 라고 생각하면 됨
        // Scanner 는 어디에 선언된 class인가 알려줘야 함
        // System.in(키보드) 로부터 입력받기 위해 필요한 객체
        // System.out(화면)
        Scanner sc = new Scanner(System.in); // => 키보드에서 입력받고 싶은 프로그램을 만드세요 할 때
        System.out.print("두자리 정수를 입력해 주세요 >> ");

        // 오른쪽 코드부터 해석
        // ex) 25 엔터 ==> "25"
        String input = sc.nextLine();
        // "25" ==> 25로 변경 후 num 변수에 담기
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        sc.close();
    }
}
