package exception;

public class ExceptionEx3 {
    public static void main(String[] args) {
        // method1();

        // 컴파일 예외
        try {
            Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    static void method1() throws Exception {
        // method2();
    }

    // method2() 실행 시 Exception 발생함
    // method2 에서 처리하지 않음(try~catch) => 메소드를 호출하는 쪽에서 처리하기
    static void method2() throws Exception {
        // throw new Exception();
    }

}
