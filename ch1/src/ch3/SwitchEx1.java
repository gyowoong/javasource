package ch3;

public class SwitchEx1 {
    public static void main(String[] args) {
        // switch : if ~ else if ~ else 대체

        // switch (char or String or int) {
        // case value:

        // break;

        // default:
        // break;
        // }

        // Switch case는 break 부문이 중요하다!! 만약에 break가 없을 시에 그 다음 값까지 나옴

        int random = (int) (Math.random() * 6) + 1;

        switch (random) {
            case 1: // (random == 1) 이라는걸 함축
                System.out.println("주사위 1이 나옴");
                break;
            case 2: // (random == 2) 이라는걸 함축
                System.out.println("주사위 2이 나옴");
                break;
            case 3: // (random == 3) 이라는걸 함축
                System.out.println("주사위 3이 나옴");
                break;
            case 4: // (random == 4) 이라는걸 함축
                System.out.println("주사위 4이 나옴");
                break;
            case 5: // (random == 5) 이라는걸 함축
                System.out.println("주사위 5이 나옴");
                break;
            case 6: // (random == 6) 이라는걸 함축
                System.out.println("주사위 6이 나옴");
                break;

            default: // else
                break;
        }
    }

}
