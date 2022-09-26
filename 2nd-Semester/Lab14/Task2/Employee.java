public class Employee{	// parent
	public void display(){
		System.out.println("with no parameter");
	}	

	/**
	*	Method overloading
	*/
	public void display(Employee employees[]){
		System.out.println("with one parameter!");
	}
	
	public void test(){
		System.out.println("test");
	}
}