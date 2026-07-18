package i_ExceptionHandling.i_CustomException;

class InsufficientBalanceException extends Exception {
    private final long shortfall;

    public InsufficientBalanceException(String message, long shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public long getShortfall() {
        return shortfall;
    }
}

class Account {
    private long balance;

    public void deposit(long amount) {
        balance += amount;
    }

    public void withdraw(long amount) throws InsufficientBalanceException {
        if (amount > balance) {
            long shortfall = amount - balance;
            throw new InsufficientBalanceException("잔액이 부족합니다. 부족한 금액: " + shortfall, shortfall);
        }
        balance -= amount;
    }
}

public class CheckedException {
    static void main(String[] args) {
        Account account = new Account();
        try {
            account.deposit(7_000);
            account.withdraw(10_000); // 계좌보다 더 많은 돈을 인출하는 상황.
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}