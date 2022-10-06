public class Q4 {
    public static void main(String[] args) {
        int previous;
        for(int i = 1; i<=5; i++){
            previous = 1;
            for(int j = 1; j <= 5; j++){
                System.out.print((previous + i) + " ");
                previous = i + previous;
            }
            System.out.println();
        }
    }
}
