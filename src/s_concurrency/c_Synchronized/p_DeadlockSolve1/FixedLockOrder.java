package s_concurrency.c_Synchronized.p_DeadlockSolve1;

class Account {
    private final int id;
    private long balance;

    Account(int id, long balance) {
        this.id = id;
        this.balance = balance;
    }

    public long getBalance() {
        return balance;
    }

    public static boolean transfer(Account from, Account to, long amount) {
        Account first = from.id < to.id ? from : to;
        Account second = (first == from) ? to : from;

        synchronized (first) {
            synchronized (second) {
                if (from.balance < amount)
                    return false;

                from.balance -= amount;
                to.balance   += amount;

                return true;
            }
        }
    }
}

public class FixedLockOrder {
    static void main(String[] args) throws InterruptedException {
        Account a = new Account(1, 100_000);
        Account b = new Account(2, 100_000);

        Thread t1 = new Thread(() -> { for (int i = 0; i < 100_000; i++) Account.transfer(a, b, 100); });
        Thread t2 = new Thread(() -> { for (int i = 0; i < 100_000; i++) Account.transfer(b, a, 100); });

        t1.start(); t2.start();
        t1.join();  t2.join();      // 데드락이면 여기서 멈춤

        System.out.println("a=" + a.getBalance() + ", b=" + b.getBalance());   // 합계 200,000이면 정상
    }
}
