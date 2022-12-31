package task3;

public class Main {

	public static void main(String[] args) {
		BoundedType type = new BoundedType();
		
		Integer n1 = new Integer("20");
		double n2 = 34.8;
		int n3 = 32;
		
		type.largestValue(n1, n2, n3);
	}

}
