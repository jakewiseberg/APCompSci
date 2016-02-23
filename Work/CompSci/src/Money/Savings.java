package Money;

/**
 *
 * @author jacob.wiseberg
 */
public class Savings implements BankAccount, InterestBearing {
    private double balance;
    private double interest;
    private int aNum;
    public Savings(int init, int aNum) {
        this.balance = init;
        this.aNum = aNum;
        this.interest = .09;
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
    
    public double chargeFee() {
        double fee = balance*Math.random()*.3;
        this.balance -= fee;
        return fee;
    }
    public int getAccountNum() {
        return aNum;
    }
    
    public double payInterest() {
        this.balance -= balance*interest;
        return balance;
    }
    public double getRate() {
        return interest;
    }
}
