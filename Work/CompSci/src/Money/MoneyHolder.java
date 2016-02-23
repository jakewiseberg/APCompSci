package Money;

/**
 *
 * @author jacob.wiseberg
 */
public interface MoneyHolder {
    double getBalance();
    double deposit(double amt);
    double withdraw(double amt);
}
