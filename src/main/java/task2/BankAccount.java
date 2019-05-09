package task2;

import java.util.Observable;

public abstract class BankAccount extends Observable {

    protected double accountBalance;
    protected double withdrawalLimit;
    protected double feePercent;

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        setChanged();
        notifyObservers(accountBalance);
    }

    public void addMoney(double addAmount) {
        setAccountBalance(accountBalance + addAmount);
    }

    public abstract double withdrawMoney(double withdrawalAmount);

    public double calculateWithdrawalFee(double withdrawalAmount) {
        //ToDo: fix. In this case it will take 5% fee even if personal funds available.
        return withdrawalAmount * feePercent / 100;
    }

}
