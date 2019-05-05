package task2;

import java.util.Observable;
import java.util.Observer;

public class Bank implements Observer {
    double accountBalance;

    @Override
    public void update(Observable bankAccount, Object accountBalance) {
        this.setAccountBalance((double) accountBalance);
        System.out.println("Observed balance changed. Current balance is: " + (accountBalance));
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

}
