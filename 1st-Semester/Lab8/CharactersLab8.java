public class CharactersLab8{
	public static void main(String[] args) {

		char uppercaseLetter, lowercaseLetter;

		// a - all uppercase letters
		uppercaseLetter = 'A';
		while(uppercaseLetter <= 'Z'){
			System.out.print(uppercaseLetter + " ");
			uppercaseLetter++;
		}

		System.out.println();

		// b - all lowercase letters
		lowercaseLetter = 'a';
		while(lowercaseLetter <= 'z'){
			System.out.print(lowercaseLetter + " ");
			lowercaseLetter++;
		}

		System.out.println();

		// c - uppercase letters between E and T
		uppercaseLetter = 'E';
		while(uppercaseLetter <= 'T'){
			System.out.print(uppercaseLetter + " ");
			uppercaseLetter++;
		}

		System.out.println();

		// d - lowercase letters starting from a and skipping two letters
		lowercaseLetter = 'a';
		while(lowercaseLetter <= 'z'){
			System.out.print(lowercaseLetter + " ");
			lowercaseLetter += 3;	// skipping two letters
		}

		System.out.println();

		// e - uppercase letters from Z to K, by decrementing loop
		uppercaseLetter = 'Z';
		while(uppercaseLetter >= 'K'){
			System.out.print(uppercaseLetter + " ");
			uppercaseLetter--;
		}

	}
}