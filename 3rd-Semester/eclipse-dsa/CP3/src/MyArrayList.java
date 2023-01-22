import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList<T> implements ZarooriMethods<T>{
	private T[] array;
	private int counter;

	public MyArrayList() {
		array = (T[]) new Object[2];
		counter = 0;
	}// default

	public MyArrayList(int size) {
		if (size < 5) {
			array = (T[]) new Object[10];
		} else {
			array = (T[]) new Object[size];
		}
		counter = 0;
	}// overloaded

	@Override
	public String toString() {
		return "MyArrayList [array=" + Arrays.toString(array) + ", counter=" + counter + "]";
	}

	private void checkCapacity() {
		if (counter >= array.length) {
			// kch karna hai
			T[] newArray = (T[]) new Object[array.length * 2];
			for (int i = 0; i < array.length; i++) {
				newArray[i] = this.array[i];
			} // for end
			array = newArray;
		} else
			return;
	}

	public void add(T value) {
		checkCapacity();
		array[counter] = value;
		counter++;
	}

	public T get(int p) {
		return array[p];
	}

	public void add(T value, int position) {
		checkCapacity();
		if (position < 0 || position > counter) {
			System.out.println("Input ghalat hia");
			return;
		} // if
		for (int i = counter; i > position; i--) {
			this.array[i] = this.array[i - 1];
		} // for

		array[position] = value;
		counter++;

	}

	public T remove(int position) {
		if (position < 0 || position > counter) {
			System.out.println("Input ghalat hia");
			return null;
		} else {
			T oldValue = array[position];
			for (int i = position; i < counter; i++) {
				array[i] = array[i + 1];
			}
			counter--;
			return oldValue;
		}
	}

	public T replace(T value, int position) {
		if (position < 0 || position > counter) {
			System.out.println("Input ghalat hia");
			return null;
		} else {
			T puraniValue = array[position];
			array[position] = value;
			return puraniValue;
		}
	}

	public void clear() {
		counter = 0;
	}

	public boolean isEmpty() {
		return counter == 0;
	}

	public int search(T value) {
		for (int i = 0; i < counter; i++) {
			if (array[i] == value) {
				return i;
			}
		}
		return -1;
	}

	public int getLength() {
		return this.counter;
	}
}