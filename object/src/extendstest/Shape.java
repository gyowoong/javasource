package extendstest;

// 도형 클래스 정의
public class Shape {
    private String color = "black";

    void draw() {
        System.out.printf("[color = %s]\n", color);
    }

    public String getColor() {
        return color;
    }
}
