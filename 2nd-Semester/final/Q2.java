import java.util.Scanner;
class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = s.nextDouble();
        System.out.print("Enter job experience: ");
        int years = s.nextInt();
        
        if(salary >= 100000 && years >= 3){
            System.out.println("You are qualified for Loan.");
        }else{
            System.out.println("You are not qualified for Car Loan");
        }
    }
}