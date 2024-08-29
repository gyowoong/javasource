package extendstest;

public abstract class Car {
    // 멤버 변수
    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 추상 메소드
    abstract void drive();

    // 일반 메소드
    void stop() {
        System.out.println(name + "자동차를 멈춥니다.");
    }

}
