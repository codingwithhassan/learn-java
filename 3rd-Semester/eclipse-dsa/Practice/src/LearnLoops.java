
public class LearnLoops {

	public static void main(String[] args) {

		System.out.print("Loops: \n\n");
		
//		for(int i = 0; i <= 10 ;i++) {
//			System.out.println("i: " + i);
//		}
		
		int[] values = new int[10]; // last value -> values[0] // index -> 0 to 9
		for(int i = 0; i < 10 ;i++) {
		
			System.out.printf("values[%d] = 2\n",i);
			values[i] = 2;
		}
		
		// 1) declare variable 
		// 2) : list/array
		for(int aliVar: values) {
			// we access aliVar inside loop
			System.out.println(aliVar);
		}

	}

}
