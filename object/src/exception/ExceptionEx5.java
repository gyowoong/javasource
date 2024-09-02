package exception;

public class ExceptionEx5 {
    public static void main(String[] args) {
        try {

            String data1 = args[0];

            System.out.println(3 / 0);

        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("매개변수 확인");
            System.out.println(e.getMessage()); // Index 0 out of bounds for length 0
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누었습니다.");
        }
    }
}
