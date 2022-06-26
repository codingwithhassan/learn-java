import java.util.ArrayList;

public class ArrayPrintCommonLab2 {
    public static void main(String[] args) {
        InputArray arr1 = new InputArray();
        InputArray arr2 = new InputArray();

        arr1.initArrayWithLenght();
        arr2.initArrayWithLenght();
        
        printCommon(arr1.getArray(), arr2.getArray());
    }

    static void printCommon(int[] firstArray, int[] secondArray){
        System.out.print("Common Numbers: ");
        ArrayList<Integer> common = new ArrayList<Integer>();
        for (int i = 0; i < secondArray.length; i++) {
            for (int j = 0; j < firstArray.length; j++) {
                if (secondArray[i] == firstArray[j] && !common.contains(secondArray[i])) {
                    common.add(secondArray[i]);
                }
            }
        }

        printArray(common);
    }

    public static void printArray(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
