package api;

public class MathEx2 {
    public static void main(String[] args) {

        // Math.random() : 1~3 사이의 임의의 숫자 발생
        // 1 2 3
        // 2 3 1
        // 2 2 2 (같은 숫자가 나오면 멈춤)

        while (true) {
            int num1 = (int) (Math.random() * 3) + 1;
            int num2 = (int) (Math.random() * 3) + 1;
            int num3 = (int) (Math.random() * 3) + 1;

            System.out.printf("%d\t%d\t%d\n", num1, num2, num3);

            if (num1 == num2 && num1 == num3)
                break;

        }

    }

}
