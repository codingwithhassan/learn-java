package Task7;

public class Student<T> implements Person {
	public int id;
	public String name;
	public double cgpa;
	
	public Student() {
		super();
	}

	public Student(int id, String name, double cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cgpa=" + cgpa + "]";
	}

	@Override
	public T work() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T sleep() {
		// TODO Auto-generated method stub
		return null;
	}
}
