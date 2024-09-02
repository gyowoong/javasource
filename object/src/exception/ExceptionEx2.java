package exception;

public class ExceptionEx2 {
    public static void main(String[] args) {
        // 강제로 예외 발생
        try {
            throw new Exception("고의 예외 발생");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
