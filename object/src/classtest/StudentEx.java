package classtest;

public class StudentEx {
    public static void main(String[] args) {

        // new Student(): dafault 생성자 호출(무조건)
        Student student1 = new Student();
        Student student2 = new Student("s12345678");
        Student student3 = new Student("s12345678", "홍길동");
        Student student4 = new Student("s12345678", "성춘향", "서울시 구로구");
        Student student5 = new Student("s12345678", "이승기", "서울시 구로구", "010-4567-3469");

        // 객체 배열 생성
        Student[] students = { student1, student2, student3, student4, student5 };

        // 이름 조회
        // 메소드 호출
        // 1) 리턴타입이 있는 경우 : 변수에 담거나 출력문에서 호출
        // String name = student3.getName();
        // System.out.println("3번 학생의 이름은 " + name + "입니다.");
        // System.out.println("4번 학생의 이름은 " + student4.getName() + "입니다.");

        System.out.println("3번 학생의 이름은 " + students[2].getName() + "입니다.");
        System.out.println("4번 학생의 이름은 " + students[3].getName() + "입니다.");

    }
}
