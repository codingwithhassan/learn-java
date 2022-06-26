import java.util.Scanner;

public class StudentLab2 {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter total number of students: ");
        int len = read.nextInt();
        String[] nameArray = new String[len];
        int[] idArray = new int[len];

        System.out.print("Enter valid ID length: ");
        int idLength = read.nextInt();

        fillArrays(nameArray, idArray, idLength);

        do{
            System.out.print("Enter ID for searching: ");
            int id = read.nextInt();
            getNameOfStudent(nameArray, idArray, id);

            System.out.print("Do you want to repeat (y/n) ?");
            char choice = read.next().toLowerCase().charAt(0);
            if( choice == 'n')
                break;

        }while(true);
    }

    public static boolean isIdValid(int id, int idLength) {
        int minRange = 1;
        for (int i = 0; i < idLength - 1; ++i) {
            minRange *= 10;
        } // for
        int maxRange = (minRange * 10) - 1;
        if (id >= minRange && id <= maxRange) {
            return true;
        } else {
            return false;
        } // if
    }// isIdValid

    public static void fillArrays(String[] nameArray, int[] idArray, int idLength)
    {
        Scanner read = new Scanner(System.in);
        for (int i = 0; i < idArray.length; i++) {
            System.out.printf("Enter the name of the student at index [%d] :",i);
            nameArray[i] = read.nextLine();
            System.out.printf("Enter the id of the student at index [%d]:",i);
            idArray[i] = read.nextInt();
            while(!isIdValid(idArray[i], idLength)){
                System.out.printf("Invalid!\nId length should be %d\nEnter the id of the student at index [%d]:",idLength,i);                idArray[i] = read.nextInt();
                idArray[i] = read.nextInt();
            }
        }
    }
    
    public static String getNameOfStudent(String[] nameArray, int[] idArray, int id)
    {
        for (int i = 0; i < idArray.length; i++) {
            if(id == idArray[i]){
                return nameArray[i];
            }
        }
        return "Not Found";
    }

}