import java.util.Scanner;

public class Q3Part2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        double marks = sc.nextDouble();

        switch ((int)marks / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("A+");
                break;
            case 7:
                System.out.println("A-");
                break;
            case 6:
                System.out.println("B");
                break;
            case 5:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;

            default:
                if(marks >= 33 && marks < 40)
                    System.out.println("E");
                else
                    System.out.println("F");
                break;
        }
    }
}
