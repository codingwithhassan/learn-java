public class BankAccount {

    private int accountNumber;
    private String AccountOwner;
    private double accountBalance;

    public BankAccount() {
        this.accountNumber = 0;
        AccountOwner = null;
        this.accountBalance = 0.0;
    }

    public BankAccount(int accountNumber, String accountOwner, double accountBalance) {
        this.accountNumber = accountNumber;
        AccountOwner = accountOwner;
        this.accountBalance = accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountOwner() {
        return AccountOwner;
    }

    public void setAccountOwner(String accountOwner) {
        AccountOwner = accountOwner;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void accountStatement(){
        System.out.printf(
            "Account Number : %d\nAccountant: %s\nAccount Balance: %.2f\n",
            this.getAccountNumber(),
            this.getAccountOwner(),
            this.getAccountBalance()
        );
    }
    
    public void deposit(double amount) {
        this.setAccountBalance(this.getAccountBalance() + amount);
    }

    public void withdraw(double amount){
        if(this.getAccountBalance() > 0)
            this.setAccountBalance(this.getAccountBalance() - amount);
        else
            System.out.println("Insufficient Balance");
    }
}
