package classtest;

public class Method {
    // method 작성

    // 리턴타입 메소드명(){}
    // 정수형(byte,short,int,long), 실수형(float,double), 논리형(boolean), 문자형(char,String),
    // 배열(타입[]), void
    // void가 아닌 이상 중괄호에 무조건 return 이라는 값이 와야함
    int method1() {
        return 0;
    }

    double method2() {
        return 12;
    }

    char method3() {
        return 'a';
    }

    String method4() {
        return "abc";
    }

    int[] method5() {
        return new int[] { 1, 2, 3 };
    }

    void method6() {
        return;
    }

}
