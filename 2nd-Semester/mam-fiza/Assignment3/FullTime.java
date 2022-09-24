import java.util.ArrayList;
import java.util.List;

public class FullTime extends Employee{

    private int years;
    private List<Loan> loans;

    public FullTime() {
        this.years = 0;
        this.loans = new ArrayList<Loan>();
    }

    public FullTime(int years) {
        this.years = years;
        this.loans = new ArrayList<Loan>();
    }

    public FullTime(int id, String name, int years) {
        super(id, name);
        this.loans = new ArrayList<Loan>();
        this.years = years;
    }

    public FullTime(int id, String name, int years, List<Loan> loans) {
        super(id, name);
        this.loans = loans;
        this.years = years;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void addLoan(Loan loan){
        loans.add(loan);
    }

    public void removeLoan(Loan loan){
        loans.remove(loan);
    }

    public List<Loan> getLoans(){
        return this.loans;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "\nFullTime [years=" + years + "]";
    }

}
