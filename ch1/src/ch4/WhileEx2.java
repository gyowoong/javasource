package ch4;

public class WhileEx2 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            System.out.printf("5 * %d = %2d\t", i, (5 * i));
            i++;

        }

        i = 0;
        while (i < 3) {
            int j = 1;
            while (j < 11) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        int sum = 0;
        i = 0;
        // switch, 반복문
        // break : 자신이 포함된 하나의 반복문 또는 switch 구분을 빠져 나옴
        while (true) {
            if (sum > 100) {
                break;
            }
            i++;
            sum += i;
        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);

        // continue : 자신이 포함된 반복문의 끝으로 이동
        // continue 이후의 문장들은 수행되지 않음
        for (int j = 0; j < 11; j++) {
            if (j % 3 == 0)
                continue;
            System.out.println(j);

        }

    }

}
