import java.util.Scanner;

public class AirplaneSeating {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int seats[][] = new int[13][6];
        int choice = 0;

        do {
            String askChoice = "1) Show Seats\n2) Add Seat\n3) Exit\nEnter Option: ";
            System.out.print(askChoice);
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    showSeats(seats);
                    break;
                case 2:
                    addSeat(seats);
                    break;
                case 3:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        } while (choice != 0);
    }

    public static void addSeat(int seats[][]) {
        Scanner input = new Scanner(System.in);
        int type;
        int[] validRows = new int[2];
        showSeats(seats);

        String askTicketType = "1) First Class\n2) Business Class\n3) Economy Class\nEnter Ticket Type (1,2,3): ";
        System.out.print(askTicketType);
        type = input.nextInt();
        while (type < 0 || type > 3) {
            System.out.print("Invalid!\n" + askTicketType);
            type = input.nextInt();
        }

        switch (type) {
            case 1:
                validRows = new int[] { 0, 1 };
                break;
            case 2:
                validRows = new int[] { 2, 6 };
                break;
            case 3:
                validRows = new int[] { 7, 12 };
                break;
        }

        String askSeatRow = String.format("Select Row between %d and %d : ", validRows[0] + 1, validRows[1] + 1);
        System.out.print(askSeatRow);
        int row = input.nextInt() - 1;
        while (row < validRows[0] || row > validRows[1]) {
            System.out.print("Invalid!\n" + askSeatRow);
            row = input.nextInt();
        }

        String askSeat = "Select Seats between A and F : ";
        System.out.print(askSeat);
        char col = input.next().toLowerCase().charAt(0);
        while (col < 97 || col > 102) {
            System.out.print("Invalid!\n" + askSeat);
            col = input.next().toLowerCase().charAt(0);
        }

        seats[row][col - 97] = 1;
    }

    public static void showSeats(int seats[][]) {

        System.out.println("         A B C D E F");
        for (int i = 0; i < seats.length; i++) {

            System.out.printf("Row %2d   ", i + 1);

            for (int j = 0; j < seats[i].length; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();

        }

    }
}
