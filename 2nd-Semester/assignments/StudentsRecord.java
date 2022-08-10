import java.util.Scanner;

public class StudentsRecord{

    public static int askChoice() {
        int choice;
        Scanner input = new Scanner(System.in);
        
        String str = "\nPress 0 to Exit\nPress 1 to Add a New Student\nPress 2 to Search by Name\nPress 3 to Search by Id\nPress 4 to Sort by Name\nPress 5 to Sort By Id\nPress 6 to Display All Students\n\nEnter Your Choice (0 - 6) : ";
        System.out.print(str);
        choice = input.nextInt();

        while(choice < 0 || choice > 6){
            System.out.print("Invalid!\n" + str);
            choice = input.nextInt();
        }

        return choice;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of students (Between 5 and 15 Inclusive): ");
        int total = input.nextInt();
        while(total < 5 || total > 15){
            System.out.print("Invalid!\nEnter total number of students (Between 5 and 15 Inclusive): ");
            total = input.nextInt();
        }
        String students[][] = new String[total][2];
        int currentSize = 0;

        String key;
        int search;

        int choice = 1;
        while(choice != 0){
            choice = askChoice();
            switch (choice) {

                case 1:
                    if(add(students, currentSize))
                        currentSize++;
                    else 
                        System.out.println("Sorry! Seat not Available.");
                    break;

                case 2:
                    System.out.print("Enter key to search: ");
                    key = input.nextLine();
                    search = searchByName(students, currentSize, key);
                    if(search != -1){
                        displayStudent(students,currentSize,search);
                    }else{
                        System.out.println("Not Found!");
                    }
                    break;

                case 3:
                    System.out.print("Enter key to search: ");
                    key = input.nextLine();
                    search = searchById(students, currentSize, key);
                    if(search != -1){
                        displayStudent(students,currentSize,search);
                    }else{
                        System.out.println("Not Found!");
                    }
                    break;

                case 4:
                    sortByName(students, currentSize);
                    break;

                case 5:
                    sortById(students, currentSize);
                    break;

                case 6:
                    display(students, currentSize);
                    break;
            
                default:
                    System.out.print("Good Bye!");
                    break;
            }
        }

    }

    static boolean add(String[][] students, int currentSize){

        if(students.length == currentSize)
            return false;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        students[currentSize][0] = input.nextLine();
        System.out.print("Enter the roll number (Must be a Number): ");
        long roll = input.nextLong();
        students[currentSize][1] = String.valueOf(roll);

        return true;
    }

    static int searchByName(String[][] students, int currentSize, String key){
        for (int i = 0; i < currentSize; i++) {
            if(students[i][0].equals(key)){
                return i;
            }
        }
        return -1;
    }

    static int searchById(String[][] students, int currentSize, String key){
        for (int i = 0; i < currentSize; i++) {
            if(students[i][1].equals(key)){
                return i;
            }
        }
        return -1;
    }

    static void sortByName(String[][] students, int currentSize){
        for (int i = 0; i < currentSize; i++) {
            for (int j = i + 1; j < currentSize; j++) {
                if(students[i][0].compareTo(students[j][0]) > 0){

                    String std[] = students[i];
                    students[i] = students[j];
                    students[j] = std;

                }
            }
        }
    }

    static void sortById(String[][] students, int currentSize){
        long rolls[] = new long[currentSize];

        for (int i = 0; i < currentSize; i++) {
            rolls[i] = Long.parseLong(students[i][1]);
        }

        // sorting roll numbers
        for (int i = 0; i < rolls.length; i++) {
            for (int j = i + 1; j < rolls.length; j++) {
                if(rolls[i] > rolls[j]){
                    
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
        //     for (int k = 0; k < currentSize; k++) {
        //         if( rolls[i] == Long.parseLong(students[k][1]) ){
        //             sortedStudents[i] = students[k];
        //         }
        //     }
        // }
        // display(sortedStudents, currentSize);
    }

    static void display(String[][] students, int currentSize){
        System.out.printf("%-20s      %s\n","Name","ID");
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < currentSize; i++) {
            System.out.printf("%-20s      %s\n",students[i][0],students[i][1]);
        }
    }

    static void displayStudent(String[][] students, int currentSize, int search){

        System.out.printf("%-20s      %s\n","Name","ID");
        
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.printf("%-20s      %s\n",students[search][0],students[search][1]);
    }
}