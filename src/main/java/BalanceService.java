import com.sun.source.util.SourcePositions;

public class BalanceService {

    private int balance = 0;

    public void add(int count) {
        System.out.println("log 1");
        balance += count;
    }
    public void withdraw(int count) {
        balance -= count;
    }

    public int getBalance() {
        return balance;
    }
}
