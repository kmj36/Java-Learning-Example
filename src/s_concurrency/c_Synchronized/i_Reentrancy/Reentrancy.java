package s_concurrency.c_Synchronized.i_Reentrancy;

class Account {
    private long balance;

    synchronized void deposit(long amount) {
        balance += amount;
    }

    synchronized void depositTwice(long amount) {
        // this 모니터 획득 (횟수 1)

        deposit(amount); // 같은 this 모니터 재진입 (횟수 2)
                         // deposit() 종료 → 횟수 감소 (횟수 1), 락은 여전히 보유

        deposit(amount); // 재진입 (횟수 2) -> 종료 (횟수 1)
    }
    // depositTwice() 종료 → this 모니터 반환 (횟수 0, 다른 스레드 진입 가능)

    synchronized long getBalance() {
        return balance;
    }
}

public class Reentrancy {
    static void main(String[] args) {
        Account a = new Account();

        a.depositTwice(10_000);
        a.depositTwice(10_000);
        a.deposit(10_000);

        System.out.println("Balance : " + a.getBalance());
    }
}
