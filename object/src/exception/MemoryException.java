package exception;

// 사용자 정의 예외 클래스 설계

public class MemoryException extends Exception {
    public MemoryException() {
        super();
    }

    public MemoryException(String message) {
        super(message);
    }
}
