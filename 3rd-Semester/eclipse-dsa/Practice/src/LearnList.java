import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		/**
		 * 1) Always use Wrapper class
		 */
		
//		List values = new ArrayList();
//		values.add(3);
//		values.add("2");
//		
//		int sum = 0;
//		for(int i = 0; i < 2; i++) {
//			sum += (int)values.get(i);	// explicit type casting	// runtime error
//		}
//		
//		System.out.print(sum);
		
		

//		List<Integer> values0 = new ArrayList<Integer>();
		ArrayList<Integer> values2 = new ArrayList<Integer>();
		values2.add(2);
		values2.add(new Integer("3"));
//		values2.add("3"); // compile time error
		
		for(int x : values2) {
			System.out.println(x);
		}
	}

}