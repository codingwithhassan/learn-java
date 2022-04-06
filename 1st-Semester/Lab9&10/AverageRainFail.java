import java.util.Scanner;
public class AverageRainFall{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the number of years: ");
        int years = in.nextInt();
        while(years < 1){
            System.out.print("Invalid! Please enter the number of years: ");
            years = in.nextInt();
        }

        double sum = 0;

        for(int i = 1; i <= years; i++){
            for(int j = 1; j <= 12; j++){
                System.out.print("Please enter the inches of rainfall for year "+i+" of month "+j+": ");
                double inches = in.nextDouble();
                while(inches < 0){
                    System.out.print("Invalid! Please enter the inches of rainfall for year "+i+" of month "+j+": ");
                    inches = in.nextDouble();
                }
                sum += inches;
            }
        }

        double average = sum / (years * 12);

        System.out.println("Number of years: "+ years);
        System.out.println("Total inches of rainfall: "+ sum);
        System.out.println("Average Rainfall per month: "+ average);
    }
}