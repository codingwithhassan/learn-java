import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentsRecord {

    // TODO: how to make Generic Method
    // public static <T> T input() { ... }
    
    public static int input() {
        Scanner input = new Scanner(System.in);
        do{
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Incorrect Input Type!\nEnter again: ");
                input.next();
            } finally {
                System.out.flush();
            }
        }while(true);
    }

    public static int askChoice() {
        int choice;

        String str = "\nPress 0 to Exit\n" +
                "Press 1 to Add a New Student\n" +
                "Press 2 to Search by Name\n" +
                "Press 3 to Search by Id\n" +
                "Press 4 to Update by Name\n" +
                "Press 5 to Update by Id\n" +
                "Press 6 to Delete by Id\n" +
                "Press 7 to Sort by Name\n" +
                "Press 8 to Sort By Id\n" +
                "Press 9 to Display All Students\n" +
                "\nEnter Your Choice (0 - 9) : ";

        System.out.print(str);
        choice = input();

        while (choice < 0 || choice > 9) {
            System.out.print("Invalid!\n" + str);
            choice = input();
        }

        return choice;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of students (Between 5 and 15 Inclusive): ");
        int total = input.nextInt();
        while (total < 5 || total > 15) {
            System.out.print("Invalid!\nEnter total number of students (Between 5 and 15 Inclusive): ");
            total = input.nextInt();
        }
        String students[][] = new String[total][2];
        int currentSize = 0;

        String key;
        int search;

        int choice = 1;
        while (choice != 0) {
            choice = askChoice();
            switch (choice) {

                case 1:
                    if (add(students, currentSize))
                        currentSize++;
                    else
                        System.out.println("Sorry! Seat not Available.");
                    break;

                case 2:
                    System.out.print("Enter name to search: ");
                    key = input.nextLine();
                    search = searchByName(students, currentSize, key);
                    if (search != -1) {
                        displayStudent(students, currentSize, search);
                    } else {
                        System.out.println("Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter ID to search: ");
                    key = input.nextLine();
                    search = searchById(students, currentSize, key);
                    if (search != -1) {
                        displayStudent(students, currentSize, search);
                    } else {
                        System.out.println("Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter name to search: ");
                    key = input.nextLine();
                    search = searchByName(students, currentSize, key);
                    if (search != -1) {
                        displayStudent(students, currentSize, search);
                        updateStudentAt(students,search);
                        displayStudent(students, currentSize, search);
                    } else {
                        System.out.println("Not Found!");
                    }
                    break;
                case 5:
                    System.out.print("Enter ID to search: ");
                    key = input.nextLine();
                    search = searchById(students, currentSize, key);
                    if (search != -1) {
                        displayStudent(students, currentSize, search);
                        updateStudentAt(students,search);
                        displayStudent(students, currentSize, search);
                    } else {
                        System.out.println("Not Found!");
                    }
                case 6:
                    System.out.print("Enter ID to search: ");
                    key = input.nextLine();
                    search = searchById(students, currentSize, key);
                    if (search != -1) {
                        deleteStudentAt(students,currentSize,search);
                        currentSize--;
                        display(students, currentSize);
                    } else {
                        System.out.println("Not Found!");
                    }
                    break;

                case 7:
                    sortByName(students, currentSize);
                    break;

                case 8:
                    sortById(students, currentSize);
                    break;

                case 9:
                    display(students, currentSize);
                    break;

                default:
                    System.out.print("Good Bye!");
                    break;
            }
        }

    }

    static boolean add(String[][] students, int currentSize) {

        if (students.length == currentSize)
            return false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        students[currentSize][0] = input.nextLine();
        System.out.print("Enter the roll number (Must be a Number): ");
        long roll = input.nextLong();
        students[currentSize][1] = String.valueOf(roll);

        return true;
    }

    static int searchByName(String[][] students, int currentSize, String key) {

        // for binary search, array must be sorted
        sortByName(students, currentSize);

        int left = 0;
        int right = currentSize - 1;
        int middle;

        while (left <= right) {

            middle = (left + right) / 2;

            if (students[middle][0].compareTo(key) == 0) {
                return middle;
            } else if (students[middle][0].compareTo(key) < 0) {
                left = middle + 1;
            } else if (students[middle][0].compareTo(key) > 0) {
                right = middle - 1;
            }

        }

        return -1;
    }

    static int searchById(String[][] students, int currentSize, String key) {

        // for binary search, array must be sorted
        sortById(students, currentSize);

        int left = 0;
        int right = currentSize - 1;
        int middle;

        while (left <= right) {

            middle = (left + right) / 2;

            if (Long.parseLong(students[middle][1]) == Long.parseLong(key)) {
                return middle;
            } else if (Long.parseLong(students[middle][1]) < Long.parseLong(key)) {
                left = middle + 1;
            } else if (Long.parseLong(students[middle][1]) > Long.parseLong(key)) {
                right = middle - 1;
            }

        }

        return -1;
    }

    public static void updateStudentAt(String[][] students, int index){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name to replace: ");
        students[index][0] = input.nextLine();
        System.out.print("Enter the roll number (Must be a Number) to replace: ");
        long roll = input.nextLong();
        students[index][1] = String.valueOf(roll);
    }

    public static void deleteStudentAt(String[][] students, int currentSize, int index){
        
        for (int i = index; i < currentSize - 1; i++) {
            students[i] = students[i + 1];
        }

    }

    static void sortByName(String[][] students, int currentSize) {
        for (int i = 0; i < currentSize; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if (students[i][0].compareTo(students[j][0]) > 0) {

                    String std[] = students[i];
                    students[i] = students[j];
                    students[j] = std;

                }
            }
        }
    }

    static void sortById(String[][] students, int currentSize) {
        long rolls[] = new long[currentSize];

        for (int i = 0; i < currentSize; i++) {
            rolls[i] = Long.parseLong(students[i][1]);
        }

        // sorting roll numbers
        for (int i = 0; i < rolls.length; i++) {
            for (int j = i + 1; j < rolls.length; j++) {
                if (rolls[i] > rolls[j]) {

                    // for roll numbers
                    long tmp = rolls[i];
                    rolls[i] = rolls[j];
                    rolls[j] = tmp;

                    // for students
                    String std[] = students[i];
                    students[i] = students[j];
                    students[j] = std;
                }
            }
        }

        // String sortedStudents[][] = new String[students.length][2];
        // for (int i = 0; i < currentSize; i++) {
        // for (int k = 0; k < currentSize; k++) {
        // if( rolls[i] == Long.parseLong(students[k][1]) ){
        // sortedStudents[i] = students[k];
        // }
        // }
        // }
        // display(sortedStudents, currentSize);
    }

    static void display(String[][] students, int currentSize) {
        System.out.printf("%-20s      %s\n", "Name", "ID");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < currentSize; i++) {
            System.out.printf("%-20s      %s\n", students[i][0], students[i][1]);
        }
    }

    static void displayStudent(String[][] students, int currentSize, int search) {

        System.out.printf("%-20s      %s\n", "Name", "ID");

        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.printf("%-20s      %s\n", students[search][0], students[search][1]);
    }
}