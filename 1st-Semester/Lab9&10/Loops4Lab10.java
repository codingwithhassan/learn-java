import java.util.Scanner;
public class Loops4Lab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int count = 0;
        for(char choice = 'y';choice != 'n' && choice != 'N';){
            count++;
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            
            System.out.print("Do you repeat (y/n) ? :");
            choice = in.next().charAt(0);
        }
        
        System.out.println("Total Numbers Entered : " + count);
    }
}