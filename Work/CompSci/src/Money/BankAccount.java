package Money;

/**
 *
 * @author jacob.wiseberg
 */
public interface BankAccount extends MoneyHolder {
    double chargeFee();
    int getAccountNum();
}
