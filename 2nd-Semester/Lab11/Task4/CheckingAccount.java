public class CheckingAccount extends BankAccount {
    private double insufficientFundsFee;

    public CheckingAccount() {
        super();
        this.insufficientFundsFee = 0.0;
    }

    public CheckingAccount(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public CheckingAccount(int accountNumber, String accountOwner, double accountBalance, double insufficientFundsFee) {
        super(accountNumber, accountOwner, accountBalance);
        this.insufficientFundsFee = insufficientFundsFee;
    }

    public double getInsufficientFundsFee() {
        return insufficientFundsFee;
    }

    public void setInsufficientFundsFee(double insufficientFundsFee) {
        this.insufficientFundsFee = insufficientFundsFee;
    }

    @Override
    public void withdraw(double amount){
        if(super.getAccountBalance() - amount > 0)
            super.setAccountBalance(super.getAccountBalance() - amount);
        else{
            super.setAccountBalance(super.getAccountBalance() - amount - this.getInsufficientFundsFee());
            System.out.println("Insufficient Funds extra Fee : " + this.getInsufficientFundsFee());
        }
        System.out.println("Account Balance : " + this.getAccountBalance());
    }

    @Override
    public void accountStatement() {
        super.accountStatement();
        System.out.println("Insufficient Funds Fee : " + this.getInsufficientFundsFee() + "\n\n");
    }
}
