import java.util.Scanner;
public class NumberOfDaysLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        System.out.print("Enter a month: ");
        int month = in.nextInt();

        System.out.println("Days in month: ");
        if(month == 2){
            System.out.println(28);
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            System.out.println(30);
        }else{
            System.out.println(31);
        }
    }
}
