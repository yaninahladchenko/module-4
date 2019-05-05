package task2;

public class BankAccountTest {

    public static void main(String[] args) {
        Bank bankObserver = new Bank();

        BankAccount debitBankAccountObservable = new BankAccount(0.00, 1000.00, false);
        debitBankAccountObservable.addObserver(bankObserver);

        debitBankAccountObservable.addMoney(200);
        debitBankAccountObservable.withdrawMoney(100);
        debitBankAccountObservable.withdrawMoney(99);

        BankAccount creditBankAccountObservable = new BankAccount(0.00, 1000.00, true);
        creditBankAccountObservable.addObserver(bankObserver);

        creditBankAccountObservable.withdrawMoney(200);
        creditBankAccountObservable.withdrawMoney(1000);
    }
}
