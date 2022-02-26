import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter basic salary of employee: ");
        int salary = in.nextInt();
        double rent, bonus, totalSalary;

        switch (salary / 10000) {
            case 3:
                rent = 0.40 * salary;
                bonus = 0.15 * salary;
                break;
            case 2:
                rent = 0.45 * salary;
                bonus = 0.12 * salary;
                break;
            case 1:
                rent = 0.50 * salary;
                bonus = 0.10 * salary;
                break;

            default:
                rent = 0.35 * salary;
                bonus = 0.20 * salary;
                break;
        }

        totalSalary = rent + salary + bonus;
        System.out.println("Total Salary: " + totalSalary);
    }
}
