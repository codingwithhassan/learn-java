import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double units,total,rate = 0;
        
        System.out.print("Enter Consumed Units: ");
        units = in.nextDouble();
        
        if(units >= 0 && units <= 100){
            rate = 1.0;
        }else if(units > 100 && units <= 200){
            rate = 1.5;
        }else if(units > 200 && units <= 300){
            rate = 2.0;
        }else if(units > 300 && units <= 400){
            rate = 2.75;
        }else if(units > 400 && units <= 500){
            rate = 3.5;
        }else if(units > 500 && units <= 600){
            rate = 4.7;
        }else if(units > 600 && units <= 700){
            rate = 5.0;
        }else if(units > 700){
            rate = 8.5;
        }else{
            System.out.println("Units can't be negative");
            System.exit(0);
        }
        
        total = rate * units;
        System.out.println("Total Bill: " + total);
    }
}
