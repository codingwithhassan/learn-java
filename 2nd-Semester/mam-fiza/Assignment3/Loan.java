public class Loan{

    private int voucherNo;
    private double amount;
    private String takenDate;
    private String returnDate;
    
    public Loan() {
        this.voucherNo = 0;
        this.amount = 0.0;
        this.takenDate = null;
        this.returnDate = null;
    }
    
    public Loan(int voucherNo, double amount, String takenDate, String returnDate) {
        this.voucherNo = voucherNo;
        this.amount = amount;
        this.takenDate = takenDate;
        this.returnDate = returnDate;
    }

    public int getVoucherNo() {
        return voucherNo;
    }

    public void setVoucherNo(int voucherNo) {
        this.voucherNo = voucherNo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTakenDate() {
        return takenDate;
    }

    public void setTakenDate(String takenDate) {
        this.takenDate = takenDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Loan [amount=" + amount + ", returnDate=" + returnDate + ", takenDate=" + takenDate + ", voucherNo=" + voucherNo + "]";
    }

}
