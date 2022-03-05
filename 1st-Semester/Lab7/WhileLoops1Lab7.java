import java.util.Scanner;
public class WhileLoops1Lab7{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int i = 0;
		while(i++ < 100)
			System.out.println(i);

		System.out.print("Enter a number: ");
		int n = sc.nextInt();

		System.out.println("\n============================Cube Numbers================================");

		i = 0;
		while(true){
			long cube = i * i * i;
			if(cube > n)
				break;
			System.out.print(cube + " ");
			i++;
		}

		System.out.println("\n====================Numbers which are divisible by 5======================");

		i = 1;
		while(i < n){
			if(i % 5 == 0)
				System.out.print(i + " ");
			++i;
		}

		System.out.println("\n====================Numbers which are Power of 2========================");
		i = 1;
		while(i * i < n){
			System.out.print(i * i +" ");
			i++;
		}

		System.out.println("\n======================== Sequence of Numbers ==========================");

		i = 2;
		while(i <= 20){
			System.out.print(i +" ");
			i += 3;
		}
		
	}
}