package extendstest;

// 은행 계좌 + 직불카드
public class CheckingAccount extends Account {

    private String cardNo;

    public CheckingAccount(String accountNo, String owner, int balance, String cardNo) {
        super(accountNo, owner, balance);
        this.cardNo = cardNo;
    }

    // 사용금액을 지불한다.
    // int pay() : 사용금액, 카드번호
    // 카드번호 일치 시 금액 인출
    int pay(String Cardno, int amout) {
        if (cardNo.equals(this.cardNo)) {
            return -1;
        }

        // 일치 시 금액 인출
        // 잔액 = 잔액 - 사용액;

        // balance = super.getBalance() - amout;
        return withdraw(amout);
    }

}
