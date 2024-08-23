package classtest;

public class Student {
    // 속성
    private String hakbun; // 학번 s12345678
    private String name; // 이름 홍길동
    private String address; // 주소 서울시 종로구
    private String mobile;// 핸드폰 010-1234-1234

    // 생성자
    // 클래스 이름(){}
    // 생성자를 명시하지 않는다면 컴파일러가 default 생성자를
    // 자동으로 생성함
    // 생성자의 목적
    // 인스턴스 초기화 메서드
    // 모양이 다른 형태를 만드는건 괄호안에 내용이 다르면 다른 형태로 변함

    // 생성자 오버로딩
    public Student(String hakbun) {
        this.hakbun = hakbun;
    }

    public Student(String hakbun, String name) {
        this.hakbun = hakbun;
        this.name = name;
    }

    public Student(String hakbun, String name, String address) {
        this.hakbun = hakbun;
        this.name = name;
        this.address = address;
    }

    public Student(String hakbun, String name, String address, String mobile) {
        this.hakbun = hakbun;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
    }

    public Student() {
    }

    // 메소드
    // 특정 작업을 수행하는 일련의 문장들을 하나로 묶은 것
    // 메소드 만드는 이유 : 재사용성, 중복된 코드 제거, 프로그램 구조 구조화

    // 리턴타입 메소드명(){}
    // 정수형, 실수형, 논리형, 문자형, 배열, void
    public String getName() {
        return name;
    }

}
