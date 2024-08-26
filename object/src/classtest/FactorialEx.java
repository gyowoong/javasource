package classtest;

public class FactorialEx {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static int factorial(int n) {
        int result = 0;
        if (n == 1) {
            result = 1;
        } else {
            // 재귀호출(recursive call) : 매서드 내부에서 매서드 자신을 호출
            result = n * factorial(n - 1);
        }
        return result;
    }

}
