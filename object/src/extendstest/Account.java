package extendstest;

public class Account {
    private String accountNo; // 계좌번호(accountNo) : 101-11-12345
    private String owner;// 계좌주(owner) : 홍길동
    private int balance;// 잔액(balance) : 1000000
    public final static int max_balance = 1000000;
    public final static int min_balance = 0;

    public Account(String accountNo, String owner, int balance) {
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;

    }

    // 기능
    // 예금하다(deposit)
    // 잔액 = 잔액 + 예금액
    // 리턴 없음
    void deposit(int amount) {
        balance += amount;
    }

    // 출금하다(withdraw)
    // 잔액 = 잔액 - 출금액
    // 잔액 return
    int withdraw(int amount) {
        if (amount > balance) {
            return -1;
        }
        balance -= amount;
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return balance;
    }

    public int getOwner() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account [accountNo=" + accountNo + ", owner=" + owner + ", balance=" + balance + "]";
    }

}
