package inter;

public interface PlayingCard {

    // 멤버 변수 선언 불가
    // private String name;

    // 상수만 가능
    public static final int SPADE = 4;
    // public static final 생략 가능 => 상수만 가능하기 때문
    int DIAMOND = 3;
    static int HEART = 2;
    final int CLOVER = 1;

    // abstract 키워드는 필수가 아님 => 모든 메소드가 추상이기 때문
    String getCardNumber();

    // 일반 메소드 선언 불가
    // void method1(){}

    // default, static 붙인 메소드는 가능
    default void method1() {
    }

    static void method2() {
    }

}
