import java.util.Scanner;
public class Q4{

    public static double getTax(int salary){
        double tax = 0.0;

        if(salary >= 2000){
            tax += 0.05 * 1000;
        }

        if(salary >= 3000){
            tax += 0.04 * 1000;
        }
        
        if(salary > 3000){
            tax += 0.03 * 1000;
        }

        return tax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter salary: ");
        int salary = in.nextInt();

        System.out.printf("You Tax: %.2f%%",getTax(salary));
    }
}