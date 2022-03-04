import java.util.Scanner;
public class PaycheckLab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double salary;

        System.out.print("Enter name: ");
        String name = in.next();
        
        System.out.print("Enter hourly salary: ");
        double hourlySalary = in.nextDouble();

        System.out.print("Enter hours per week: ");
        double hoursPerWeek = in.nextDouble();

        salary = hourlySalary * hoursPerWeek;
        System.out.println("Salary:" + salary);

        if(hoursPerWeek > 45){
            double extraHours = hoursPerWeek - 45;
            double half = 0.5 * hourlySalary; // half of salary

            double overtimeSalary = extraHours * half;

            System.out.println("Salary:" + overtimeSalary);
            salary += overtimeSalary;
        }


        System.out.println("Salary:" + salary);
    }
}
