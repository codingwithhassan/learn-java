public class Student {

    private int id;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student() {
        this.id = 0;
        this.firstName = null;
        this.lastName = null;
        this.gpa = 0.0;
    }

    public Student(int id, String firstName, String lastName, double gpa) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public Student(Student std) {
        this.setId(std.getId());
        this.setFirstName(std.getFirstName());
        this.setLastName(std.getLastName());
        this.setGpa(std.getGpa());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return this.getFirstName() + " " + this.getLastName();
    }

    public void setName(String name) {
        String parts[] = name.split(" ");
        this.setFirstName(parts[0]);
        this.setLastName(parts[1]);
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("\nID: %d\nName: %s\nGPA: %.2f\n",
                this.getId(),
                this.getName(),
                this.getGpa());
    }

    public void print() {
        System.out.print(this);
    }

    public boolean isEqual(Student student) {
        return this.getId() == student.getId();
    }

    public boolean isGPALesser(Student std) {
        return this.getGpa() < std.getGpa();
    }

    public static void sort(Student students[]) {

        // System.out.print(this); // we can't use this reference in static context

        for (int i = 0; i < students.length; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[j].isGPALesser(students[i])) {
                    Student tmp = students[j];
                    students[j] = students[i];
                    students[i] = tmp;
                }
            }
        }
    }

    public static int linearSearch(Student students[], int key) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == key) {
                return i;
            }
        }
        return -1;
    }

    public static void search(Student students[], int key) {
        Student filterData[] = new Student[students.length];
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId() == key)
                filterData[counter++] = students[i];
        }

        for (int i = 0; i < counter; i++) {
            filterData[i].print();
        }

        if (counter == 0)
            System.out.println("No Student Found");
    }

    public static int binarySearch(Student students[], double key) {

        Student.sort(students); // array must be sorted to implement binary search

        return innerBinarySearch(students, key);
    }

    private static int innerBinarySearch(Student students[], double key) {

        int mid = students.length / 2;

        if (students[mid].getGpa() == key){
            return mid;
        }

        if (students[mid].getGpa() > key){
            return innerBinarySearch(getArrayBetweenRange(students, 0, mid - 1), key);
        }

        if (students[mid].getGpa() < key){
            return innerBinarySearch(getArrayBetweenRange(students, mid + 1, students.length - 1), key);
        }

        return -1;
    }

    /**
     * Get sub part of array with Inclusive ranges
     * 
     * @param students
     * @param from
     * @param to
     * @return Student[]
     */
    private static Student[] getArrayBetweenRange(Student students[], int from, int to) {
        Student subPart[] = new Student[to - from + 1];
        int c = 0;
        for (; to <= from; to++) {
            subPart[to] = students[c++];
            subPart[to].print();
        }
        return subPart;
    }
}
