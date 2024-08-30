package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // 날짜 시간 : Calendar

        Date d = new Date();
        System.out.println(d); // Fri Aug 30 16:13:40 KST 2024

        // 원하는 포맷으로 날짜 분리
        // Date ==> SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        System.out.println(sdf.format(d));

        // 월 : M / 분 : m
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:MM:ss");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 D번째 날");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 d번째 날");
        System.out.println(sdf.format(d));

        // LocalDate / LocalTime
        // LocalDateTime
        LocalDate today = LocalDate.now();
        LocalTime now = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(today); // 2024-08-30
        System.out.println(now); // 16:39:29.793402
        System.out.println(localDateTime); // 2024-08-30T16:40:47.271089200

        System.out.println("year " + today.getYear());
        System.out.println("month " + today.getMonthValue());
        System.out.println("day " + today.getDayOfMonth());

        System.out.println("시 : " + now.getHour());
        System.out.println("분 : " + now.getMinute());
        System.out.println("초 : " + now.getSecond());

        // 날짜 연산
        System.out.println(today.plusDays(15));
        System.out.println(today.minusMonths(3));

    }

}
