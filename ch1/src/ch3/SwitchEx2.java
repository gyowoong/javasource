package ch3;

public class SwitchEx2 {
    public static void main(String[] args) {

        char grade = 'B';

        switch (grade) {
            // grade A 이거나 a 일때 우수회원
            case 'A':
            case 'a':
                System.out.println("우수회원");
                break;
            case 'B':
            case 'b':
                System.out.println("일반회원");
                break;
            default:
                System.out.println("손님");
                break;
        }

        // if-else if-else
        if (grade == 'A' || grade == 'a') {
            System.out.println("우수회원");
        } else if (grade == 'B' || grade == 'b') {
            System.out.println("일반회원");
        } else {
            System.out.println("손님");
        }
    }

}
