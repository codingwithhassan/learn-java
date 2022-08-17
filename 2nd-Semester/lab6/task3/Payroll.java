public class Payroll{
	private String name;
	private int idNumber;
	private double hourlyPayRate;
	private double numberOfHoursWorked;

	public double grossPay()	// mutator
	{
		return hourlyPayRate * numberOfHoursWorked;
	}

	public Payroll setName(String name){
		this.name = name;
		return this;
	}

	public Payroll setIdNumber(int id){
		idNumber = id;
		return this;
	}

	public Payroll setHourlyPayRate(double hours){
		hourlyPayRate = hours;
		return this;
	}

	public Payroll setNumberOfHoursWorked(double hours){
		numberOfHoursWorked = hours;
		return this;
	}

	public String getName()	// accessor
	{
		return name;
	}

	public int getIdNumber(){
		return idNumber;
	}

	public double getHourlyPayRate(){
		return hourlyPayRate;
	}

	public double getNumberOfHoursWorked(){
		return numberOfHoursWorked;
	}

	public String getRecord(){
		return String.format(
			"Name: %s\nID: %d\nHourly Rate: %.2f\nWorking Hours: %.2f",
			getName(),
			getIdNumber(),
			getHourlyPayRate(),
			getNumberOfHoursWorked()
		);
	}
}