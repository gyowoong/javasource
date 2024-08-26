package classtest;

public class DataEx {
    public static void main(String[] args) {
        Data d = new Data(); // 변수명 쓸 때 앞에 대문자인지 소문자인지 볼 것
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        // change(d.x); 값 복사
        change(d); // 주소 복사
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    // static void change(int x) {
    // x = 10000;
    // System.out.println("change() : x = " + x);
    // }

    static void change(Data d) {
        d.x = 10000;
        System.out.println("change() : x = " + d.x);
    }

}
