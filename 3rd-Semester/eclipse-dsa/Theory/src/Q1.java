import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		List<Integer> ll1 = new LinkedList<Integer>();
		ll1.add(2);
		ll1.add(3);
		List<Integer> ll2 = new LinkedList<Integer>();
		ll2.add(3);
		ll2.add(23);
		ll2.add(100);
		
		if(isIncreasing(ll1) && isIncreasing(ll2)) {
			System.out.println(merged(ll1, ll2));
		}else {
			System.out.println("List are not in increasing order.");
		}

	}
	
	public static boolean isIncreasing(List<Integer> ll) {
		for(int i = 1; i < ll.size(); i++) {
			if(ll.get(i) < ll.get(i - 1)) {
				return false;
			}
		}
		return true;
	}

	private static List<Integer> merged(List<Integer> ll1, List<Integer> ll2) {

		List<Integer> merged = new LinkedList<Integer>();
		int max = Math.max(ll1.size(), ll2.size());
		
		for(int index = 0; index < max; index++) {
			
			if(ll1.size() <= index) {
				merged.add(0 - ll2.get(index));
				continue;
			}
			
			if(ll2.size() <= index) {
				merged.add(ll1.get(index));
				continue;
			}
			
			int value1 = ll1.get(index);
			int value2 = ll2.get(index);
			
			merged.add(value1 - value2);
		}
		
		return merged;
	}

}
