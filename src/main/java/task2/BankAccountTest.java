package task2;

public class BankAccountTest {

    public static void main(String[] args) {
        DebitBankAccount debitBankAccount = new DebitBankAccount(10000.00, 20000.00);
        double addAmount = 100.00;
        double withdrawAmount = 200.00;

        System.out.println("Bank Account Balance is: " + debitBankAccount.getAccountBalance());
        System.out.println("Added amount is: " + addAmount);
        debitBankAccount.addMoney(addAmount);
        System.out.println("Bank Account Balance is: " + debitBankAccount.getAccountBalance());

        System.out.println("Withdrawal amount is: " + withdrawAmount);
        System.out.println("Withdrawal fee is: " + debitBankAccount.calculateWithdrawalFee(withdrawAmount));
        debitBankAccount.withdrawMoney(withdrawAmount);
        System.out.println("Bank account balance is: " + debitBankAccount.getAccountBalance());

        System.out.println("Trying to withdraw all money. 1% commission should be paid");
        debitBankAccount.withdrawMoney(debitBankAccount.getAccountBalance());

        System.out.println("Trying to withdraw more money then allowed by withdrawal limit");
        debitBankAccount.withdrawMoney(30000.00);







    }
}
