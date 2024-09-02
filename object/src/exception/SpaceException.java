package exception;

// 사용자 정의 예외 클래스 설계

public class SpaceException extends Exception {
    public SpaceException() {
        super();
    }

    public SpaceException(String message) {
        super(message);
    }
}
