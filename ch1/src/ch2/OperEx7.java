package ch2;

public class OperEx7 {
    public static void main(String[] args) {
        // 복합대입연산자
        int result = 10;

        result = result + 10; // result = result + 10;
        System.out.println("result = " + result);

        result -= 5; // result = result - 5;
        System.out.println("result = " + result);

        result *= 3; // result = result * 3;
        System.out.println("result = " + result);

        result /= 3; // result = result / 3
        System.out.println("result = " + result);

        // 삼항연산자
        // 조건식 ? 식1 : 식2;
        int score = 85;
        // score 가 90 이상이면 A, 아니면 B 출력
        // char ch2 = score >= 90 ? 'A' : 'B';
        // System.out.println("학점 : " + ch2);

        System.out.println("학점 : " + (score >= 90 ? 'A' : 'B'));

        // score 가 90 이상이면 A, 80 이상이면 B, 나머지는 C
        // 조건식 ? 식1 : (조건식2) ? 식1 : 식2;
        char ch2 = score >= 90 ? 'A' : score >= 80 ? 'B' : 'C';
        System.out.println("학점 : " + ch2);

    }

}
