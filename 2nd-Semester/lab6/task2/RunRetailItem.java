import java.util.Scanner;
public class RunRetailItem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter total number of records: ");
		int n = input.nextInt();

		RetailItem items[] = new RetailItem[n];

		for (int i = 0; i < n ; i++) {

			items[i] = new RetailItem();

			System.out.printf("\nFor Item %d: \n", (i + 1) );

			input.nextLine();	// clear buffer

			System.out.print("Enter Description: ");
			items[i].setDescription(input.nextLine());

			System.out.print("Enter Units on Hand: ");
			items[i].setUnitOnHands(input.nextInt());

			System.out.print("Enter price: ");
			items[i].setPrice(input.nextDouble());
		}

		RunRetailItem.display(items);
	}

	public static void display(RetailItem items[]){

		System.out.println("-----------------------------------");
		System.out.println("Units On Hand | Price | Description");
		for (int i = 0; i < items.length ; i++) {
			System.out.printf(
				"%-13d | %5.2f | %s\n",
				items[i].getUnitOnHand(),
				items[i].getPrice(),
				items[i].getDescription()
			);
		}

	}

}
