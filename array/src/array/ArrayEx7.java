package array;

import java.util.Arrays;

public class ArrayEx7 {
    public static void main(String[] args) {
        // 정수 10개를 배열 생성
        // 배열 요소 섞기

        int[] numArr = new int[10];

        // 배열을 0~9의 숫자로 초기화
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = i;
        }

        System.out.println(Arrays.toString(numArr));

        // 100번 loop 돌리기
        for (int i = 0; i < 100; i++) {
            // 0 ~ 9 임의의 숫자 추출
            int n = (int) (Math.random() * 10);

            int temp = numArr[0];
            numArr[0] = numArr[n];
            numArr[n] = temp;
        }

        System.out.println(Arrays.toString(numArr));
    }

}
