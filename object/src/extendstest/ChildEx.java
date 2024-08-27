package extendstest;

public class ChildEx {
    public static void main(String[] args) {

        // 부모 클래스는 자신에게 선언된 멤버와 메소드만 접근 가능
        Parnet parnet = new Parnet();
        parnet.print();

        // 자식 클래스는 부모의 멤버와 메소드 + 자신의 멤버와 메소드 접근 가능
        Child child = new Child();
        child.print(); // 부모 메소드 호출 가능
        child.play(); // 자식 메소드 호출

    }

}
