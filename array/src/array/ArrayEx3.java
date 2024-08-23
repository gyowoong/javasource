package array;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char(타입) 배열 선언, 생성
        // char[] 배열명 = {'a', 'b', 'c', 'd'}
        // char 배열명[] => 둘 다 허용가능

        char[] chArr = { 'a', 'b', 'c', 'd' };

        System.out.println(Arrays.toString(chArr)); // [a, b, c, d]

        for (int i = 0; i < chArr.length; i++) {
            System.out.print(chArr[i] + "\t");
        }
        System.out.println();

        // 향상된 for문
        for (char c : chArr) {
            System.out.print(c + "\t");
        }

        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        for (float f : flArr) {
            System.out.println(f);
        }

        // String 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };

        for (String string : strArr) {
            System.out.println(string);
        }

        // ArrayIndexOutOfBoundsException
        // System.out.println(strArr[3]);
    }

}
