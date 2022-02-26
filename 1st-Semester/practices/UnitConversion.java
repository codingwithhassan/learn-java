import java.util.Scanner;
public class UnitConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the length in centimeter: ");
        double centimeter = in.nextDouble();

        double inches = centimeter * 0.393701;
        double yards = inches / 36.0;
        double feet = yards * 3;
    }
}
