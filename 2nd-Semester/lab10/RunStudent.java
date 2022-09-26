public class RunStudent {
    public static void main(String[] args) {
        Student students[] = new Student[5];

        students[0] = new Student(6,"hassan","javed",2.6);
        students[1] = new Student(7,"ali","javed",2.2);
        students[2] = new Student(9,"husnain","javed",2.0);
        students[3] = new Student(8,"athar","javed",2.8);
        students[4] = new Student(7,"ali","hassan",2.5);

        Student.sort(students);

        for (int i = 0; i < students.length; i++) {
            students[i].print();
            // System.out.print(students[i]);
        }

        // System.out.println(Student.linearSearch(students, 7));

        // Student.search(students,7);

        System.out.println();
        System.out.println("Search Key: " + Student.binarySearch(students, 2.8));
    }
}
