package classtest;

public class AccountEx3 {
    public static void main(String[] args) {
        Account2 account2 = new Account2("111", "홍길동", 100000);
        System.out.println(account2); // classtest.Account2@5ca881b5

        // toString() 오버라이딩 후
        // Account2 [accountNo=111, owner=홍길동, balance=100000]

        Account2 accounts[] = new Account2[2];
        accounts[0] = new Account2("111", "홍길동", 100000);
        accounts[1] = new Account2("111", "홍길동", 100000);

    }
}