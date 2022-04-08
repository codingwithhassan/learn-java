import java.util.Scanner;
public class Loops3Lab10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        for(int i = 100; i >= 0; i -= 5){
            System.out.print(i);
            if(i != 0){
                System.out.print(", ");
            }
        }
    }
}