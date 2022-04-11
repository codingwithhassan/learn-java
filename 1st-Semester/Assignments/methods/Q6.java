import java.util.Scanner;
public class Q6{
    public static int add(int n1, int n2){
        return n1 + n2;
    }
    public static int multiplication(int n1, int n2){
        return n1 * n2;
    }
    public static int subtraction(int n1, int n2){
        return n1 - n2;
    }
    public static int division(int n1, int n2){
        return n1 / n2;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int n1 = in.nextInt();
        System.out.print("Enter Second Number: ");
        int n2 = in.nextInt();
        System.out.print("Enter Operation(+,-,*,/): ");
        String operation = in.next();

        switch(operation.charAt(0)){
            case '+':
                System.out.println("Addition : " + (add(n1,n2)));
                break;
            case '-':
                System.out.println("Subtraction : " + (subtraction(n1,n2)));
                break;
            case '*':
                System.out.println("Multiplication : " + (multiplication(n1,n2)));
                break;
            case '/':
                System.out.println("Division : " + (division(n1,n2)));
                break;
            default:
                System.out.println("Invalid Operation!");
        }
    }
}