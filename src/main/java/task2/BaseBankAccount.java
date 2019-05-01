package task2;

public abstract class BaseBankAccount {

    protected double accountBalance;
    protected double creditFundsFeePercent = 5;
    protected double personalFundsFeePercent = 1;
    protected double withdrawalLimit;

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double getCreditFundsFeePercent() {
        return creditFundsFeePercent;
    }

    public void setCreditFundsFeePercent(double creditFundsFeePercent) {
        this.creditFundsFeePercent = creditFundsFeePercent;
    }

    public double getPersonalFundsFeePercent() {
        return personalFundsFeePercent;
    }

    public void setPersonalFundsFeePercent(double personalFundsFeePercent) {
        this.personalFundsFeePercent = personalFundsFeePercent;
    }

    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }

    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }

    //ToDo: update below methods for Credit card support with negative balance and creditFundsFeePercent

    public double addMoney(double addAmount) {
        return accountBalance + addAmount;
    }

    public double withdrawMoney(double withdrawalAmount) {
        if (withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > withdrawalLimit) {
            System.out.println("It is impossible to get more money than your withdrawal limit: " + withdrawalLimit);
        } else if (withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > accountBalance) {
            System.out.println("It is impossible to get more money than the account currently has.");
        } else {
            accountBalance = accountBalance - withdrawalAmount - calculateWithdrawalFee(withdrawalAmount);
        }
        return accountBalance;
    }

    public double calculateWithdrawalFee(double withdrawalAmount) {
        return withdrawalAmount * personalFundsFeePercent / 100;
    }
}
