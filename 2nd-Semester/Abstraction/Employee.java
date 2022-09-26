public class Employee extends Person implements Displayable, Calculateable, Relateable{
	private int hoursPerWeek;
	private double salaryPerHour;

	public Employee(int h, double s){
		super();
		setHoursPerWeek(h);
		setSalaryPerHour(s);
	}

	public Employee(int h, double s, String n, int a){
		super(n, a);
		setHoursPerWeek(h);
		setSalaryPerHour(s);
	}

	public void setHoursPerWeek(int h){
		hoursPerWeek = h;
	}

	public void setSalaryPerHour(double s){
		salaryPerHour = s;
	}

	public int getHoursPerWeek(){
		return hoursPerWeek;
	}

	public double getSalaryPerHour(){
		return salaryPerHour;
	}

	@Override
	public void display(){
		System.out.println("Name: " + super.getName());
		System.out.println("Age: " + super.getAge());
		System.out.println("Hours per week: " + getHoursPerWeek());
		System.out.println("Salary per hour: " + getSalaryPerHour());
	}

	@Override
	public double weeklySalary(){
		return this.getSalaryPerHour() * this.getHoursPerWeek();
	} 

	@Override
	public double annualSalary(){
		return weeklySalary() * 52;
	}

	@Override
	public boolean isRankGreater(Employee e){
		return this.annualSalary() > e.annualSalary();
	} 
}