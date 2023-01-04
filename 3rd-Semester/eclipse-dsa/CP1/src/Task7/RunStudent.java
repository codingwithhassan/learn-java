package Task7;

public class RunStudent {

	public static void main(String[] args) {
		Student student0 = new Student();
		student0.setId(3);
		student0.setName("Syed Zain");
		student0.setCgpa(4.0*2);
		

		Student student1 = new Student(1, "Abdullah", 1.5);

		System.out.println(student0);
		System.out.println(student1);
		
	}

}
