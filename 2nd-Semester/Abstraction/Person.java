public class Person{
	private String name;
	private int age;

	Person(){
		setName("Abdullah");
		setAge(20);
	}

	Person(String n, int a){
		setName(n);
		setAge(a);
	}

	public void setName(String n){
		name = n;
	}

	public void setAge(int a){
		age = a;
	}

	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
}