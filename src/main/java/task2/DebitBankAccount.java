package task2;

public class DebitBankAccount extends BankAccount {
    public DebitBankAccount(double accountBalance, double withdrawalLimit, double feePercent) {
        this.accountBalance = accountBalance;
        this.withdrawalLimit = withdrawalLimit;
        this.feePercent = feePercent;
    }

    public double withdrawMoney(double withdrawalAmount) {
        if (withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > withdrawalLimit) {
            System.out.println("It is impossible to get more money than your withdrawal limit: " + withdrawalLimit);
        } else if (withdrawalAmount + calculateWithdrawalFee(withdrawalAmount) > accountBalance) {
            System.out.println("It is impossible to get more money than the account currently has.");
        } else {
            System.out.println("Money withdrawn from balance: " + withdrawalAmount);
            System.out.println("Fee: " + calculateWithdrawalFee(withdrawalAmount));
            accountBalance = accountBalance - withdrawalAmount - calculateWithdrawalFee(withdrawalAmount);
            setAccountBalance(accountBalance);
        }
        return accountBalance;
    }
}
