package Task7;

public class RunStudent {

	public static void main(String[] args) {

		Student<String> student0 = new Student<String>();
		student0.setId("0fdha-324-32-423");
		student0.setName("Muhammad Hassan");
		student0.setCgpa(2.9);
		

		Student<Integer> student1 = new Student<Integer>(1, "Araiz", 2);

		System.out.println(student0);
		System.out.println(student1);
		
	}

}
