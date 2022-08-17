import java.util.Scanner;

public class InputArray {

    public Scanner read;

    private int[] array;

    public InputArray(){
        this.read = new Scanner(System.in);
    }

    public int[] initArrayWithLenght() {
        System.out.print("Enter the length of array: ");
        return initArray(this.read.nextInt());
    }

    public int[] initArray(int len){
        this.array = new int[len];
        fillArray();
        return getArray();
    }

    public void setLength(int length){
        this.array = new int[length];
    }

    public void setArray(int array[]){
        this.array = array;
    }

    public int[] getArray(){
        return this.array;
    }

    private void fillArray() {
        for (int i = 0; i < this.array.length; i++) {
            System.out.printf("Enter number at %d position: ",i);
            this.array[i] = this.read.nextInt();
        }
    }

    public void fillArrayWithPrompt(String str) {
        for (int i = 0; i < this.array.length; i++) {
            System.out.printf(str,i);
            this.array[i] = this.read.nextInt();
        }
    }
}
