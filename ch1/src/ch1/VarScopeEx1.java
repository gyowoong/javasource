package ch1;

public class VarScopeEx1 {
    public static void main(String[] args) {
        // 로컬 변수(지역 변수) 유효 범위
        // 변수를 선언한 가장 가까운 블록내에서만 유효함

        int a = 25;
        int c;
        int d;

        {
            int b = 35;
            System.out.println(b);
            c = b + 50;
            System.out.println(c);
        }
        // System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        // local variable d may not have been initialized : 로컬 변수는 사용하기 전 반드시 초기화해야 함
        // System.out.println(d);
    }

}
