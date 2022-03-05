import java.util.Scanner;
public class TaxCalculation{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter martial status (s for single and m for married) :");
        char martial = sc.next().charAt(0);

        System.out.print("Enter salary :");
        double amount = sc.nextDouble();

        if(martial == 's' || martial == 'S'){
            if(amount > 0 && amount <= 8000){
                final double tax = 0.1 * amount; // 10%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);

            }else if(amount > 8000 && amount <= 32000){
                amount -= 8000;
                final double tax = (0.16 * amount) + 850 ; // $850 + 16%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);
            }else if(amount > 32000){
                amount -= 32000;
                final double tax = (0.26 * amount) + 4700; // $4700 + 26%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);
            }else{
                System.out.println("Invalid Amount!");
            }
        }else if(martial == 'M' || martial == 'm'){
            if(amount > 0 && amount <= 18000){
                final double tax = 0.1 * amount; // 10%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);
            }else if(amount > 18000 && amount <= 70000){
                amount -= 18000;
                final double tax = (0.16 * amount) + 1900 ; // $1900 + 16%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);
            }else if(amount > 70000){
                amount -= 70000;
                final double tax = (0.26 * amount) + 8900 ; // $8900 + 26%

                System.out.println("Tax : " + tax);

                amount -= tax;

                System.out.println("Salary after deducting tax: " + amount);
            }else{
                System.out.println("Invalid Amount!");
            }
        }else{
            System.out.println("Invalid martial status!");
        }
    }
}