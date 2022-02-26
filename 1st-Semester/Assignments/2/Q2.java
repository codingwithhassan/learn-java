import java.util.Scanner;

public class Q2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double monthlySalary, perHourSalary, overtimePayment, perDaySalary, totalSalary, tax, allowance,
        deductPayment = 0;
        int overtime, leaves;
        System.out.print("Enter Monthly Salary: ");
        monthlySalary = in.nextDouble();
        System.out.print("Enter Number of leaves: ");
        leaves = in.nextInt();
        System.out.print("Enter employee overtime: ");
        overtime = in.nextInt();

        perHourSalary = monthlySalary / 200.0;
        perDaySalary = monthlySalary / 30.0;
        overtimePayment = overtime * perHourSalary;
        allowance  = 0.15 * monthlySalary;

        totalSalary = monthlySalary + overtimePayment + allowance;

        if(leaves > 2){
            deductPayment = perDaySalary * leaves;
            totalSalary -= deductPayment;
        }

        tax = totalSalary * 0.12; // 12% tax of totalSalary

        totalSalary -= tax;

        /*****************Report*****************/
        System.out.println("Hourly Pay: " + perHourSalary);
        System.out.println("Overtime Payment: " + overtimePayment);
        System.out.println("Deduct Payment of "+leaves+" leaves: " + deductPayment);
        System.out.println("Total Salary: " + totalSalary);
    }
}