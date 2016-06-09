package Money;

/**
 *
 * @author jacob.wiseberg
 */
public class Wallet implements MoneyHolder {
    private double balance;
    public Wallet(int init) {
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
