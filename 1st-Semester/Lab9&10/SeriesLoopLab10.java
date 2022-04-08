public class SeriesLoopLab10{
    public static void main(String args[]){
        double sum = 0;
        for(int i = 1; i <= 30; i++){
            int div = 30 - i + 1;
            System.out.print(i+"/"+div);
            if(i != 30){
                System.out.print(" + ");
            }
            sum += i / (double)div;
        }
        System.out.println("\nSum of the Series: " + sum);
    }
}