package h_OOP.b_AttributesAndMethods.j_bankAccount;

class BankAccount {
    // Attributes (속성)
    private String owner;
    private double balance;

    // 생성자
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // Methods (메서드) — 행동
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(amount + "원 입금, 잔액: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("잔액 부족");
            return;   // 조건에 따라 조기 종료
        }
        this.balance -= amount;
        System.out.println(amount + "원 출금, 잔액: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class bankAccount {
    static void main() {
        BankAccount account = new BankAccount("김철수", 10000);
        account.deposit(5000);     // 5000원 입금, 잔액: 15000.0
        account.withdraw(3000);    // 3000원 출금, 잔액: 12000.0
        System.out.println(account.getBalance());   // 12000.0
    }
}
