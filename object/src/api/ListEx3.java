package api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // 배열 => 리스트
        // Arrays : 배열을 다루는데 유용한 메소드 정의
        String frult[] = { "사과", "포도", "멜론", "수박", "참외", "바나나" };

        List<String> list = Arrays.asList(frult);

        System.out.println(list.get(2));

        System.out.println(list);

        // 배열을 리스트로 변환 시 추가 작업은 안됨
        // list.add("딸기"); // java.lang.UnsupportedOperationException

        List<String> list2 = new ArrayList<>(Arrays.asList(frult));
        list2.add("딸기");
        System.out.println(list2);

        // List => 배열
        Object[] arr = list2.toArray();
        System.out.println(Arrays.toString(arr));
    }

}
