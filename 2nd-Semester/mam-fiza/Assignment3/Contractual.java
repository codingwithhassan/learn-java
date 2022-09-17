public class Contractual extends Employee{

    private String startDate;
    private String endDate;
    private Loan loan;

    public Contractual() {
        super();
        this.startDate = null;
        this.endDate = null;
    }

    public Contractual(String startDate, String endDate) {
        super();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Contractual(int id, String name, String startDate, String endDate) {
        super(id, name);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public void setLoan(Loan loan){
        this.loan = loan;
    }

    public Loan getLoan(){
        return this.loan;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return super.toString() + "\nContractual [endDate=" + endDate + ", startDate=" + startDate + "]";
    }
}
