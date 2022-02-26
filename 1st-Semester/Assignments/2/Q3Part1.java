import java.util.Scanner;

public class Q3Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter water temperature: ");
        double temp = sc.nextDouble();

        if(temp >= 0 && temp <= 100)
            System.out.println("Liquid");
        else if(temp > 0)
            System.out.println("Stream");
        else if(temp < 0)
            System.out.println("Ice");
    }
}
