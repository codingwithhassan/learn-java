public class Payroll {
    public String name;
    public int idNumber;
    public double hourlyPayRate;
    public double numberOfHoursWorked;

    public Payroll() {
        this.name = null;
        this.idNumber = 0;
        this.hourlyPayRate = 0;
        this.numberOfHoursWorked = 0.0;
    }

    public Payroll(Payroll p) {
        this.name = p.getName();
        this.idNumber = p.getIdNumber();
        this.hourlyPayRate = p.getHourlyPayRate();
        this.numberOfHoursWorked = p.getNumberOfHoursWorked();
    }

    public Payroll(String name, int idNumber, double hourlyPayRate, double numberOfHoursWorked) {
        this.name = name;
        this.idNumber = idNumber;
        this.hourlyPayRate = hourlyPayRate;
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(double numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    public void copy(Payroll p) {
        p.setName(this.getName());
        p.setIdNumber(this.getIdNumber());
        p.setHourlyPayRate(this.getHourlyPayRate());
        p.setNumberOfHoursWorked(this.getNumberOfHoursWorked());
    }

    @Override
    public String toString() {
        return String.format(
                "\nName: %s\nId Number: %d\nHourly Pay Rate: %.2f\nNumber of Hours Worked: %.2f\n",
                getName(), getIdNumber(), getHourlyPayRate(), getNumberOfHoursWorked());
    }

    public void display() {
        System.out.println(this);
    }

    public double grossPay(){
        return hourlyPayRate * numberOfHoursWorked;
    }

    public boolean compare(Payroll payroll) {
        if (payroll.getIdNumber() == this.getIdNumber() &&
                payroll.getIdNumber() == this.getIdNumber() &&
                payroll.getHourlyPayRate() == this.getHourlyPayRate() &&
                payroll.getNumberOfHoursWorked() == this.getNumberOfHoursWorked() &&
                payroll.getName().equals(this.getName()))
            return true;
        return false;
    }

    public boolean isNotEqual(Payroll payroll) {
        if (payroll.getIdNumber() == this.getIdNumber() &&
                payroll.getIdNumber() == this.getIdNumber() &&
                payroll.getHourlyPayRate() == this.getHourlyPayRate() &&
                payroll.getNumberOfHoursWorked() == this.getNumberOfHoursWorked() &&
                payroll.getName().equals(this.getName()))
            return false;
        return true;
    }

    public Payroll create(Payroll p) {
        return new Payroll(
            this.getName() + " " + p.getName(),
            this.getIdNumber() + p.getIdNumber(),
            this.getHourlyPayRate() + p.getHourlyPayRate(),
            this.getNumberOfHoursWorked() + p.getNumberOfHoursWorked()
        );
    }
}
