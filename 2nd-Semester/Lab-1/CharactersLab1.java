import java.util.Scanner;

public class CharactersLab1{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a string: ");
		wordInfo(in.nextLine());

	}

	public static void wordInfo(String word){
		int len = word.length();
		System.out.println("Vowels Characters: ");
		for(int i = 0; i < len; i++){
			char letter = word.charAt(i);
			if(
				letter == 'a' || letter == 'A' ||
				letter == 'e' || letter == 'E' ||
				letter == 'i' || letter == 'I' ||
				letter == 'o' || letter == 'O' ||
				letter == 'u' || letter == 'U'
			){
				System.out.println(letter);
			}
		}

		System.out.println("Total Characters: " + len);
	}
}