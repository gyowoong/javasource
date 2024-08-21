package ch3;

public class ifEx1 {
    public static void main(String[] args) {
        // 조건문
        // ~~~가 참이라면 ~~ 를 해주세요
        // 조건1 이 참이라면 문장1을 수행하고 조건2가 참이라면 문장2를 수행하기

        // if (조건식 && 조건식 && 조건식) {
        // 수행할 구문;
        // 수행할 구문;
        // 수행할 구문;
        // }

        int num = 50;
        // if(){} : {} 을 생략가능한 경우는 수행할 구문이 하나의 행인 경우만 가능
        if (num < 100) {
            System.out.println("100보다 작다");
        }

        // 100보다 크다 or 100보다 작다 둘중에 하나 출력
        if (num < 100) {
            System.out.println("100보다 작다");
        } else {
            // if에서 사용된 조건이 아닌 나머지
            System.out.println("100보다 크거나 같다");
        }

        // 점수가 100~90 사이일때 등급은 A 입니다.
        // 점수가 89~80 사이일때 등급은 B 입니다.
        // 점수가 79~70 사이일때 등급은 C 입니다.
        // 점수가 69~60 사이일때 등급은 D 입니다.
        // 나머지 점수는 등급은 F 입니다.
        int jumsu = 85;

        if (jumsu >= 90) {
            System.out.println("등급은 A 입니다.");
        } else if (jumsu >= 80) {
            System.out.println("등급은 B 입니다.");
        } else if (jumsu >= 70) {
            System.out.println("등급은 C 입니다.");
        } else if (jumsu >= 60) {
            System.out.println("등급은 D 입니다.");
        } else {
            System.out.println("등급은 F 입니다.");
        }

        // 중첩가능
        // if (조건1) {
        // if (조건2) {

        // }
        // }

    }
}