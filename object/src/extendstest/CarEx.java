package extendstest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        // Car car = new Car(); (X)

        Car car = new SportsCar("포르쉐");
        car.drive();
        car.stop();
    }

}
