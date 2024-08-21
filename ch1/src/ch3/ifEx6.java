package ch3;

public class ifEx6 {
    public static void main(String[] args) {
        // 윤년/평년 구하기

        // 윤년 2012, 2016, 2020, 2024
        // 윤년 : 년도를 4로 나눈 나머지가 0 이고, 년도를 100으로 나눈 나머지가 0이 아니거나 년도를 400으로 나눈 나머지가 0인 경우

        // 현재년도가 윤년인지 평년인지 출력
        int year = 2024;

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("윤년");
        } else {
            System.out.println("평년");

        }
    }

}
