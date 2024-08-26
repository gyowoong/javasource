package classtest;

public class CalculatorEx {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // 메소드 호출 => 해당 메소드 실행
        calculator.powerOn();

        // return 존재 시 1) 변수에 담기 2) 사용
        int result = calculator.plus(8, 6);
        System.out.println("연산결과" + result);

        System.out.println("연산결과" + calculator.plus(9, 8));

        double divResult = calculator.divide(9, 2);
        System.out.println("나눗셈 결과 : " + divResult);

        // System.out.println(calculator.powerOff());
        // 넘어오는게 있어야 출력가능 void라면 호출만 가능하다.
        calculator.powerOff();

        Calculator2 calculator2 = new Calculator2();
        calculator2.execute();
    }
}
