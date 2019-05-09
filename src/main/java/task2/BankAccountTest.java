package task2;

public class BankAccountTest {

    public static void main(String[] args) {
        Bank bankObserver = new Bank();

        BankAccount debitBankAccountObservable = new DebitBankAccount(0.00, 1000.00, 1);
        debitBankAccountObservable.addObserver(bankObserver);

        debitBankAccountObservable.addMoney(200);
        debitBankAccountObservable.withdrawMoney(100);
        debitBankAccountObservable.withdrawMoney(99);

        BankAccount creditBankAccountObservable = new CreditBankAccount(0.00, 1000.00, 5);
        creditBankAccountObservable.addObserver(bankObserver);

        creditBankAccountObservable.withdrawMoney(200);
        creditBankAccountObservable.withdrawMoney(1000);
    }
}
