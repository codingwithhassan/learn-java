import java.util.Scanner;
public class Q7Part1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = in.nextInt();
        
        if(age <= 25){
            System.out.println("You are young.");
        }else{
            System.out.println("You are old.");
        }
        
    }
}