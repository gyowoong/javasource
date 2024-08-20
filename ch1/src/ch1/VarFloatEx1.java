package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        // F or f 가능(실수는 double로 기본타입으로 인식하기 때문에 float를 인지시켜줘야 함)
        float score = 90.14f;

        // D or d 가능(생략가능)
        double score2 = 98.5d;
        score2 = 90d;

        System.out.println("score = " + score);
        System.out.println("score2 = " + score2); // 90.0

        int value1 = 92;
        // 큰 타입 = 작은 타입(O)
        // double(8 byte) > int(4 byte)
        double score3 = value1;
        System.out.println("score3 = " + score3);

        // 작은 타입 = 큰 타입(X) ==> 처리를 할 수는 있으나 값의 손실이 일어날 수 있다.
        // int value2 = score2;
    }
}
