public class Lab2Task7{
    public static void main(String[] args){
        
        int x, y, swap;

        x = 3;
        y = 4;

        
        System.out.println("Before Swapping");

        System.out.println("x : " + x);
        System.out.println("y : " + y);

        swap = x;
        x = y;
        y = swap;

        System.out.println("After Swapping");

        System.out.println("x : " + x);
        System.out.println("y : " + y);

    }
}