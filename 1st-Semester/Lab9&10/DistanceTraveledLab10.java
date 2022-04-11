import java.util.Scanner;
public class DistanceTraveledLab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(char choice = 'y';choice != 'n' && choice != 'N';){
            System.out.print("Enter speed of a vehicle (in miles-per-hour) :");
            int speed = in.nextInt();
            while(speed < 0){
                System.out.print("Invalid Number! Speed must be positive\nEnter speed of a vehicle (in miles-per-hour) :");
                speed = in.nextInt();
            }
            System.out.print("Enter number of hours it has traveled: ");
            int hours = in.nextInt();
            while(hours < 1){
                System.out.print("Invalid Number! Hours Must not be less than 1\nEnter number of hours it has traveled:");
                hours = in.nextInt();
            }
            
            System.out.println("Hours        Distance Traveled");
            System.out.println("-----------------------------");
            int i = 1;
            while(i <= hours){
                System.out.println(i+"                "+ i * speed);
                i++;
            }
            
            System.out.print("Do you repeat (y/n) ? :");
            choice = in.next().charAt(0);
        }
    }
}