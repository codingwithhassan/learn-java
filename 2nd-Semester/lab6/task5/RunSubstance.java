import java.util.Scanner;

public class RunSubstance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        int temperature = input.nextInt();

        Substance substance = new Substance(temperature);

        substance.showReport();
    }
}
