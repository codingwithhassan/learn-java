import java.util.Arrays;

public class RunStudents {
    public static void main(String[] args) {
        MyArrayList<Student> students = new MyArrayList<Student>();

        students.add(new Student());
        students.add(new Student(1, "hassan 1", "CS", 3, "03060000080"));
        students.add(new Student(3, "hassan 2", "CS", 3, "03060000080"));
        students.add(new Student(5, "hassan 3", "CS", 3, "03060000080"));
        students.add(new Student(3, "hassan 5", "CS", 3, "03060000080"));
        students.add(new Student(6, "hassan 7", "CS", 4, "03060000080"));
        students.add(new Student(1, "hassan 8", "CS", 3, "03060000080"));
        students.add(new Student(70, "hassan 9", "CS", 3, "03060000080"));
        students.add(new Student(10, "hassan 11", "CS", 3, "03060000080"));

        Student[] array2 = new Student[students.getLength()];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = students.get(i);
		}

		Arrays.sort(array2, new SortById());

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
		}
    }
}
