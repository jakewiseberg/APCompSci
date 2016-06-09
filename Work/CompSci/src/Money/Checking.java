package Money;

/**
 *
 * @author jacob.wiseberg
 */
public class Checking implements BankAccount{
    private double balance;
    private static int nextNum = 0;
    private int aNum;
    public Checking(int init, int aNum) {
        this.balance = init;
        this.aNum = aNum;
        this.nextNum++;
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
}
