import java.util.Scanner;
public class ElectricityBill{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter units: ");
		int units = in.nextInt();
		double rate,bill = 0;

		if(units > 0 && units <= 250){
			rate = 4.0;
			bill = rate * units;
		}else if(units > 250 && units <= 650){
			rate = 7.0;
			bill = rate * units;
		}else if(units > 650){
			rate = 12.0;
			bill = rate * units;
		}else{
			System.out.println("Units can not be negative.");
		}

		if(units > 0 && bill > 2600){
			bill += 400;
		}

		System.out.println("Total Bill: " + bill);
	}
}