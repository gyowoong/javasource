package modifier;

public class SingleTon {

    // 자기 자신 인스턴스 생성
    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return singleTon;
    }

}
