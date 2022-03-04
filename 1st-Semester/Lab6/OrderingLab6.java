import java.util.Scanner;
public class OrderingLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        double n1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        double n2 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        double n3 = in.nextInt();

        if((n1 >= n2 && n2 >= n3) ||n1 <= n2 && n2 <= n3){
            System.out.println("Integers are in order.");
        }else{
            System.out.println("Integers are not in order.");
        }
    }
}
