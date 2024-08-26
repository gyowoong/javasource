package classtest;

public class Card {
    // 멤버 변수
    private String kind; // heart, ...
    private int number;

    // 클래스 변수
    static int width = 100;
    static int height = 250;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

}
