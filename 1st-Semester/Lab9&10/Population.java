import java.util.Scanner;
public class Population{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the starting population: ");
        double population = in.nextDouble();
        while(population < 2){
            System.out.print("Invalid! Please enter the starting population: ");
            population = in.nextDouble();
        }

        System.out.print("Percentage of increase in population: ");
        double perc = in.nextDouble();
        while(perc < 0){
            System.out.print("Invalid! Percentage of increase in population: ");
            perc = in.nextDouble();
        }

        System.out.print("Enter the number of days: ");
        int days = in.nextInt();
        while(days < 1){
            System.out.print("Inavlid! Enter the number of days: ");
            days = in.nextInt();
        }

        System.out.println("Days              Population");
        System.out.println("-------------------------------");
        for(int i = 1;i <= days; i++){
            System.out.println(i+"                 " + population);
            population += population * (perc / 100.0);
        }
    }
}