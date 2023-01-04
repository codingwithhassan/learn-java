package Task8;

public class Main {

	public static void main(String[] args) {

		String[][] list = new String[3][2];
		
		list[0][0] = "Owner";
		list[0][1] = "No";
		
		list[1][0] = "Developer";
		list[1][1] = "Yes";
		
		list[2][0] = "Designer";
		list[2][1] = "No";
		
		printArray(list);
		System.out.println("Search for Owner: " + binarySearch(list, "Owner"));
		System.out.println("Search for Developer: " + binarySearch(list, "Developer"));
		System.out.println("Search for Man: " + search(list, "Man"));

	}
	
	public static <T> void printArray(T[][] a) {
		for(int i = 0; i < a.length; i++) {
			System.out.print("[");
			for(int j = 0; j < a[i].length; j++) {
			System.out.print(a[i][j] + " ");
			}

			System.out.println("]");
		}
	}
	
	public static <T> int search(T[][] a, T key) {
		for(int i = 0; i < a.length; i++) {
			if(a[i][0].equals(key.toString())) {
				return i;
			}
		}
		return -1;
	}
	
	public static <T> int binarySearch(String a[][], T key) 
	{
		int l = 0, r = a.length - 1; 
		while (l <= r) {
			int m = l + (r - l) / 2;
			if (a[m][0].equals(key.toString())) 
				return m; 
			if (a[m][0].compareTo(key.toString()) > 0) 
				l = m + 1;
			else
				r = m - 1; 
		}
		return -1; 
	}
	
}
