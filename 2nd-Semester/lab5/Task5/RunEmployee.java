import java.util.Scanner;

public class RunEmployee {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        
        Employee employees[] = new Employee[in.nextInt()];

        input(employees);

        print(employees);
    }

    public static void input(Employee employees[]) {
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < employees.length; i++){
            
        }
    }
    
}
