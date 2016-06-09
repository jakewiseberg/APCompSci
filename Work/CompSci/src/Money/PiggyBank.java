package Money;

/**
 *
 * @author jacob.wiseberg
 */
public class PiggyBank implements MoneyHolder {
    private double balance;
    public PiggyBank(int init) {
        this.balance = init;
    }
    
    public double getBalance() {
        return balance;
    }
    public double deposit(double amt) {
        this.balance += amt;
        return balance;
    }
    public double withdraw(double amt) {
        this.balance -= amt;
        return balance;
    }
    
}
