package api;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] strArr = { "cat", "dog", "lion", "tiger" };
        // T, E, K, V : 객체로 들어가야함(객체상태)
        Arrays.sort(strArr, Comparator.reverseOrder());

        // int, char => Character, flot => Float...
        Integer arr[] = { 37, 21, 56, 99, 88, 58, 62, 15, 39, 78 };
        // 내림차순
        // Arrays.sort(arr);
        Arrays.sort(arr, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }

}
