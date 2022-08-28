/*
 * javac -d . ./RunDayOfYear.java
 */

public class RunDayOfYear {
    public static void main(String[] args) {

        System.out.println("Enter today's date :");
        DayOfYear today = new DayOfYear();
        today.input();
        System.out.print("Today's date ");
        today.output();

        System.out.println("Birthday's date ");
        DayOfYear birthday = new DayOfYear();
        birthday.input();
        birthday.output();

        if( today.getDay() == birthday.getDay() && today.getMonth() == birthday.getMonth() )
            System.out.println("Happy Birthday!");
        else{
            System.out.print("Your Bithday will be at ");
            birthday.output();
        }

    }
}
