import java.util.Scanner;
public class TwoPairsLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        System.out.print("Enter 1st number: ");
        double n1 = in.nextInt();
        System.out.print("Enter 2nd number: ");
        double n2 = in.nextInt();
        System.out.print("Enter 3rd number: ");
        double n3 = in.nextInt();
        System.out.print("Enter 4th number: ");
        double n4 = in.nextInt();

        if(
            n1 == n2 && n3 == n4 ||
            n1 == n3 && n2 == n4 ||
            n1 == n4 && n2 == n3

        ){
            System.out.print("There exist two pairs.");
        }else{
            System.out.print("There do not exist two pairs.");
        }
    }
}
