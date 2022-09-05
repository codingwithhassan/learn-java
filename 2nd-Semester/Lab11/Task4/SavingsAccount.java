public class SavingsAccount extends BankAccount{
    private double annualInterestRate;

    public SavingsAccount() {
        super();
        this.annualInterestRate = 0.0;
    }

    public SavingsAccount(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public SavingsAccount(int accountNumber, String accountOwner, double accountBalance, double annualInterestRate) {
        super(accountNumber, accountOwner, accountBalance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void depositMonthlyInterest(double amount) {
        this.setAnnualInterestRate(this.getAnnualInterestRate() + (amount * 12.0));
    }

    @Override
    public void accountStatement() {
        super.accountStatement();
        System.out.println("Monthly Interest Rate : " + this.getAnnualInterestRate() + "\n\n");
    }
}
