package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        // 프로그램에서 구현할 부분을 코드로 작성
        // 제 나이는 25이고, 이름은 홍길동입니다. 출력
        // 변경되는 부분은 변수로 작성함
        // 변수 선언 후 사용 : 타입 변수명 = 초기값;
        // 타입 : 정수형, 실수형, 문자형, 논리형
        // 1) 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
        // 2) 실수형 : float(4byte), double(8byte)
        // 3) 문자형 : char(2byte)
        // 4) 논리형 : boolean(1byte)
        // 주 타입은 int, double, char, boolean
        // 변수명 : 개발자가 정해서 변수명 입력 규칙 -> 대소문자 구별, 예약이 사용불가, 숫자로 시작하면 안됨, 특수문자는 _, $만 가능함
        // 소문자로 시작(한글보다는 영어) : ex) age, name, curPos(두 개의 단어가 혼합된다면 뒤의 단어를 대문자로 시작)
        // 변수명을 보고 용도를 알게 해주는 것이 중요함

        // 변수 선언 후 초기화
        byte age = 35;
        String name = "홍길동";

        // 초기화된 값 변경
        age = 40;

        // print() 화면 출력
        // println() : 화면 출력 후 엔터까지 포함
        // printf() : 포맷을 적용한 출력(엔터는 포함되어 있지 않음)
        // %d(정수형), %f(실수형), %c(문자형), %s(문자열형), %b(논리형)

        // 자바는 문자와 문자열 다름
        // 문자 : 하나 => 'a'
        // 문자열 : 문자 여러개 => "abc" or "a"
        System.out.print("제 나이는 " + age + " 이고, 이름은 " + name + "입니다.");
        System.out.println("제 나이는 " + age + " 이고, 이름은 " + name + "입니다.");
        // \n == enter, \t == tab
        System.out.printf("제 나이는 %d 이고, 이름은 %s 입니다.\n", age, name);
        // 안녕\\하세요 => 백슬레쉬 출력시 두번 입력
        System.out.println("안녕\\하세요");
    }
}
