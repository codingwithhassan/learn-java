public class RunPayroll{
	public static void main(String[] args) {
		Payroll pay = new Payroll();

		pay.setName("M Hassan")		// method chaining
			.setIdNumber(2)
			.setHourlyPayRate(25.5)
			.setNumberOfHoursWorked(8.2);

		System.out.println(pay.getRecord());
	}
}