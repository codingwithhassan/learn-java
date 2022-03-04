import java.util.Scanner;
public class BMILab5 {
    public static void main(String[] args) {
        double weight, height, bmi;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter weight in pounds: ");
        weight = in.nextDouble();
        System.out.println("Enter height in inches: ");
        height = in.nextDouble();

        bmi = weight * 703 / height * height;

        if(bmi < 18.5){
            System.out.println("Underweight");
        }else if(bmi > 25.0){
            System.out.println("Overweight");
        }else{
            System.out.println("Optimal");
        }
    }
}
