import java.util.Scanner;
public class Rectangle{

	private Scanner in;

	public Rectangle() {
		this.in = new Scanner(System.in);
	}
	
	public double getLength(){
		System.out.print("Enter Length of Rectangle: ");
		return this.in.nextDouble();
	}

	public double getWidth(){
		System.out.print("Enter Width of Rectangle: ");
		return this.in.nextDouble();
	}

	public double getArea(double width, double length){
		return width * length;
	}

	public void display(double width, double length, double area){
		System.out.println("Rectangle: ");

		System.out.printf("Width: %f\nLength: %f\nArea: %f", width, length, area);
	}

}