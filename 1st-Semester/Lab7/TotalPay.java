import java.util.Scanner;
public class TotalPay{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter working days: ");
        int days = in.nextInt();

        if(days > 0){
            long totalPennies = 0,
            salary = 1; // first day salary is 1 penny
            double dollars = 0;

            int i = 1;
            System.out.println("Day | Penny");
            while(i <= days){

                System.out.println(i+"  |  "+salary);
                totalPennies += salary;
                salary *= 2; // double the salary for next day

                i++;
            }
            System.out.println("Total Pennies: " + totalPennies);

            dollars = totalPennies / 100.0;

            System.out.println("Total Dollars: "+ dollars);
        }else
            System.out.println("Number of working days can't be less than 1");
    }
}