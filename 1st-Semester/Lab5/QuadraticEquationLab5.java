import java.util.Scanner;
public class QuadraticEquationLab5{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		double a,b,c,d,x1,x2;
		
		System.out.print("Enter the value of a: "); // prompt message
		a = in.nextDouble();
		System.out.print("Enter the value of b: "); // prompt message
		b = in.nextDouble();
		System.out.print("Enter the value of c: "); // prompt message
		c = in.nextDouble();
		// System.out.println(b*b - 4.0 * a * c); // it will not work if it is negative
		d = b*b - 4.0 * a * c;
		if(d < 0){
			System.out.println("The roots of this equation are imaginary.");
		}else if(d > 0){
			x1 = (-b - Math.sqrt(d) ) / 2.0 * a;
			x2 = (-b + Math.sqrt(d) ) / 2.0 * a;

			System.out.println("The roots of equation are: x = "+ x1 +", x = " + x2);
		}else{
			x1 = (-b - 0 ) / 2.0 * a;

			System.out.println("The root of equation is: x = "+ x1);
		}
	}
}