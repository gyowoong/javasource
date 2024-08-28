package poly;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Computer computer) {
        // money 보다 물건가격이 적은지 확인
        if (money < computer.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        // money = money - 물건가격
        money -= computer.price;
        // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
        bonusPoint += computer.bonusPoint;
        System.out.println(computer + "을/를 구입하셨습니다.");
    }

    void buy(Air air) {
        // money 보다 물건가격이 적은지 확인
        if (money < air.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        // money = money - 물건가격
        money -= air.price;
        // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
        bonusPoint += air.bonusPoint;
        System.out.println(air + "을/를 구입하셨습니다.");
    }
}
