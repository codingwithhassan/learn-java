import java.util.Scanner;

class CharacterPositionLab1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter string: ");
		String word = in.nextLine();
		System.out.print("Enter Position: ");
		int position = in.nextInt();
		while(position < 0){
			System.out.print("Invalid! Enter Positive Number Position: ");
			position = in.nextInt();
		}

		System.out.println("Character at position "+ position +" is: " + charAtPosition(word, position));
	}

	public static char charAtPosition(String word, int position){
		return word.charAt(position);
	}
}