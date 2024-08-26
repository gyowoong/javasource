package classtest;

public class Calculator2 {
    // 같은 클래스내부에서 다른 메소드 호출 가능
    // 이름만 사용하면 됨

    int plus(int x, int y) {
        return x + y;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        return sum / 2;
    }

    void printin(String message) {
        System.out.println(message);
    }

    void execute() {
        printin("실행결과 :" + avg(7, 10));
    }
}
