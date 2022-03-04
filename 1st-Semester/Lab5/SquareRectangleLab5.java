import java.util.Scanner;
public class SquareRectangleLab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double perimeter, area;

        System.out.print("Enter the value for length: ");
        double length = in.nextDouble();
        System.out.print("Enter the value for width: ");
        double width = in.nextDouble();

        String shape = "Rectangle";
        perimeter = 2 * (length + width);
        area = length * width;
        if(width == length){
            shape = "Square";
            perimeter = 4 * width;
        }

        System.out.println("Your shape is a " + shape);

        System.out.println("The perimeter of this "+shape+" is: "+perimeter+", and area is: "+area+".");
    }
}
