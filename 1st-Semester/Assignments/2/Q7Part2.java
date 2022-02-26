import java.util.Scanner;
public class Q7Part2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Year: ");
        int year = in.nextInt();
        
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println(year + " is Leap Year.");
                }else
                    System.out.println("Not Leap Year.");
            }else
                System.out.println("Not Leap Year.");
        }else
            System.out.println("Not Leap Year.");
        
    }
}