package array;

public class ArrayEx8 {
    public static void main(String[] args) {
        // 45개의 정수값을 저장하는 배열 생성
        int[] array = new int[45];

        // 1 ~ 45 로 배열 요소 초기화
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < 6; i++) {
            // 0 ~ 44 무작위 숫자 추출
            int n = (int) (Math.random() * 45);

            int temp = array[i];
            array[i] = array[n];
            array[n] = temp;
        }

        for (int i = 0; i < 6; i++) {
            System.out.printf("array[%d] = %d\n ", i, array[i]);

        }
    }

}
