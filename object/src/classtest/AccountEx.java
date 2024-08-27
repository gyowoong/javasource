package classtest;

public class AccountEx {
    public static void main(String[] args) {
        Account account = new Account("101-11-12345", "홍길동", 0);

        // 예금하다
        account.deposit(100000);
        // 잔액조회
        System.out.println("입금 후 현재 잔액 : " + account.getBalance());

        // 출금하다
        int balance = account.withdraw(50000);
        if (balance == -1) {
            System.out.println("잔액 부족");
        } else {
            System.out.println("출금 후 현재 잔액 :" + balance);
        }

        printAccount(account);
    }

    static void printAccount(Account account) {

    }

}
