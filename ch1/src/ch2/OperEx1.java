package ch2;

public class OperEx1 {
    public static void main(String[] args) {
        // 연산자(operator)
        // 1) 산술연산자 : +, -, *, /, %
        // 2) 비교연산자 : >, <. >=, <=, ==, !=
        // 3) 논리연산자 : &&, |: !
        // 4) 대입연산자 : =

        // 연산자 우선순위
        // 산술 > 비교 > 논리 > 대입 순으로 수행됨

        // 두 개의 정수형 변수를 선언한 후 사칙연산 프로그램 작성
        int num1 = 10, num2 = 20;

        // 10 + 20 = 30
        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        // 나누기는 몫만 출력
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        // System.out.printf("%d / %d = %f\n", num1, num2, (num1 / num2));
        // % : 나머지 출력(% 연산자 기호는 2번 입력), num 앞에 float 붙이면 소숫점 값 나옴 ex)0.5
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));

        float result = num1 + num2;
        System.out.printf("%d + %d = %f\n", num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %f\n", num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %f\n", num1, num2, result);
        result = num1 / (float) num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);

        char ch1 = 'A' + 1;
        System.out.println("ch1 = " + ch1);
    }

}
