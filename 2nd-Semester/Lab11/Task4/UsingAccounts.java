public class UsingAccounts {
    public static void main(String[] args) {
        SavingsAccount savingAccount0 = new SavingsAccount();        
        SavingsAccount savingAccount1 = new SavingsAccount(2);
        SavingsAccount savingAccount2 = new SavingsAccount(323,"Ali",2,5);

        savingAccount0.accountStatement();
        savingAccount1.accountStatement();
        savingAccount2.accountStatement();

        savingAccount0.depositMonthlyInterest(20);
        savingAccount0.deposit(50);
        savingAccount0.withdraw(30);
        savingAccount0.withdraw(50);
        
        savingAccount0.accountStatement();
        savingAccount1.accountStatement();
        savingAccount2.accountStatement();

        CheckingAccount account0 = new CheckingAccount();
        CheckingAccount account1 = new CheckingAccount(50);
        CheckingAccount account2 = new CheckingAccount(3233,"M Ali",2,5);

        account0.accountStatement();
        account1.accountStatement();
        account2.accountStatement();

        account0.deposit(60);
        account0.withdraw(600);

        account0.accountStatement();
        account1.accountStatement();
        account2.accountStatement();
    }
}