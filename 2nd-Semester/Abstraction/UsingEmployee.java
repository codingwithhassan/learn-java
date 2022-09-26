class UsingEmployee{
	public static void main(String[] args) {
		Employee e1 = new Employee(40, 150);
		System.out.println("State of Employee #1:");
		e1.display();
		System.out.println("Weekly salary of Employee #1: " + e1.weeklySalary());
		System.out.println("Annual salary of Employee #1: " + e1.annualSalary());

		Employee e2 = new Employee(43, 160, "Abdullah", 22);
		System.out.println("\nState of Employee #2:");
		e2.display();
		System.out.println("Weekly salary of Employee #2: " + e2.weeklySalary());
		System.out.println("Annual salary of Employee #2: " + e2.annualSalary());

		Employee e3 = new Employee(45, 165, "Abdulrehman", 19);
		System.out.println("\nState of Employee #3:");
		e3.display();
		System.out.println("Weekly salary of Employee #3: " + e3.weeklySalary());
		System.out.println("Annual salary of Employee #3: " + e3.annualSalary());

		System.out.println("\nChanging the state of Employee #2:");
		e2.setHoursPerWeek(45);
		e2.setSalaryPerHour(170);

		System.out.println("\nChanging the state of Employee #3:");
		e3.setHoursPerWeek(50);
		e3.setSalaryPerHour(180);

		System.out.println("\nDisplaying the state of all objects again...");
		
		System.out.println("\nState of Employee #2:");
		e2.display();
		System.out.println("Weekly salary of Employee #2: " + e2.weeklySalary());
		System.out.println("Annual salary of Employee #2: " + e2.annualSalary());
		
		System.out.println("\nState of Employee #3:");
		e3.display();
		System.out.println("Weekly salary of Employee #3: " + e3.weeklySalary());
		System.out.println("Annual salary of Employee #3: " + e3.annualSalary());
	}
}