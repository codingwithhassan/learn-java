import java.util.Scanner;
public class Loops1Lab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(int prod = 1; prod < 150;){
            System.out.print("Enter a number: ");
            int num = in.nextInt();
            prod = num * 5;
            System.out.println("Product is : " + prod);
        }
    }
}