package Q3;

public class XI{
    public static int diffInMinutes(int hour1, int minute1, int hour2, int minute2){
        minute1 += hour1 * 60;
        minute2 += hour2 * 60;

        return (int)Math.abs(minute1 - minute2);
    }

    public static void main(String args[]){
        System.out.println(diffInMinutes(2,30,2,15));
    }
}