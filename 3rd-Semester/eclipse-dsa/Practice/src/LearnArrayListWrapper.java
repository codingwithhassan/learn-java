import java.util.ArrayList;

public class LearnArrayListWrapper {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(2, "hassan")); // add to list
		
		Student student0 = new Student(3, "abdullah"); // variable
		
		students.add(student0); // add student0 to list
		
//		System.out.println(students.size());
		for(Student x:students) {
			System.out.println(x);
	
		}
	}
}


class Student{
	private int id;
	private String name;
	
	public Student(int id, String name) {
		setId(id);
		setName(name);
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id; 	// this means this class
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String sname) {
		name = sname;
	}
	
	public String display() {
		return "Name: " + getName()+ "\nRoll: " + getId();
	}
	
	@Override
	public String toString() {
		return display();
	}
	
}
