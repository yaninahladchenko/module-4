package task2;

import java.util.Observable;

public class BankAccount extends Observable {

    protected double accountBalance;
    protected double creditFundsFeePercent = 5;
    protected double personalFundsFeePercent = 1;
    protected double withdrawalLimit;
    protected boolean isCreditLineAvailable;

    public BankAccount(double accountBalance, double withdrawalLimit, boolean isCreditLineAvailable) {
        this.accountBalance = accountBalance;
        this.withdrawalLimit = withdrawalLimit;
        this.isCreditLineAvailable = isCreditLineAvailable;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
        setChanged();
        notifyObservers(accountBalance);
    }

    public void addMoney(double addAmount) {
        System.out.println("Money added on balance: " + addAmount);
        setAccountBalance(accountBalance + addAmount);
    }

    public double withdrawMoney(double withdrawalAmount) {
        if (withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > withdrawalLimit) {
            System.out.println("It is impossible to get more money than your withdrawal limit: " + withdrawalLimit);
        } else if (isCreditLineAvailable == false && withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > accountBalance) {
            System.out.println("It is impossible to get more money than the account currently has.");
        } else {
            System.out.println("Money withdrawn from balance: " + withdrawalAmount);
            System.out.println("Fee: " + calculateWithdrawalFee(withdrawalAmount));
            accountBalance = accountBalance - withdrawalAmount - calculateWithdrawalFee(withdrawalAmount);
            setAccountBalance(accountBalance);
        }
        return accountBalance;
    }

    public double calculateWithdrawalFee(double withdrawalAmount) {
        if (isCreditLineAvailable) {
            return withdrawalAmount * creditFundsFeePercent / 100;
            //ToDo: fix. In this case it will take 5% fee even if personal funds available.
        } else {
            return withdrawalAmount * personalFundsFeePercent / 100;
        }
    }

}
