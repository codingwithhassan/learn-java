
import java.util.*;

public class Q3 {

	public static Stack<Integer> sort(Stack<Integer> st) {
		Stack<Integer> sorted = new Stack<Integer>();

		while (!st.isEmpty()) {
			int value = st.pop();

			while (!sorted.isEmpty() && sorted.peek() < value) {
				st.push(sorted.pop());
			}

			sorted.push(value);
		}

		return sorted;
	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();

		st.add(78);
		st.push(98);
		st.push(90);
		st.add(-3);
		st.push(2);

		System.out.println("Stack: " + st);
		Stack<Integer> sst = sort(st);
		System.out.println("Sorted Stack in decreasing order: " + sst);

		List<Integer> ll = new LinkedList<Integer>();
		while (!sst.isEmpty()) {
			int value = sst.pop();
			ll.add(value);
		}

		// No need to reverse LinkedList because automatically reversed
		System.out.println("LinkedList: " + ll);

	}

}
