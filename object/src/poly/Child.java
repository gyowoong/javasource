package poly;

public class Child extends Parnet {

    String name;

    void play() {
        System.out.println("놀자!!!!");
    }

    @Override // 오버라이딩하면 부모 메소드가 자식메소드에게 가려짐
    // super.print(); => 가려져 있는 부모의 메소드 호출
    void print() {
        super.print();
        System.out.println("자식 메소드");
    }
}
