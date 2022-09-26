import java.util.Scanner;
public class Comission{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pay = 0;
		long total = 0;
		while(pay != -1){
			System.out.print("Enter a gross pay of employee: ");
			pay = sc.nextInt();

			pay += (pay * 0.09) + 200;

			total += pay;

			System.out.println("Employee Pay : " + pay);
			System.out.println("Total of all employees : " + total);
		}
	}
}
