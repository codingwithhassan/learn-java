package Task1;

/*
 * javac -d . ./DayOfYear.java
 */

import java.util.Scanner;
public class DayOfYear {
    private int day;
    private int month;

    public void input() {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the month as a number: ");
        int m = read.nextInt();
        System.out.print("Enter the day of the month: ");
        int d = read.nextInt();
        set(m, d);

        if(getDay() == -1 || getMonth() == -1)
            validate(m,d);
    }

    public void validate(int m, int d) {

        System.out.println("Invalid Data!");

        Scanner read = new Scanner(System.in);
        System.out.print("Enter the month as a number: ");
        m = read.nextInt();
        System.out.print("Enter the day of the month: ");
        d = read.nextInt();
        set(m, d);

        if(getDay() == -1 || getMonth() == -1)
            validate(m,d);
    }

    public void set(int m, int d) {
        setMonth(m);
        setDay(d);
    }

    public void setDay(int d) {
        int validDays = 0;
        int m = getMonth();

        day = -1;   // default
        if(m != -1){

            int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
            validDays = daysOfMonth[m - 1];

            if(d > 0 && d <= validDays)
                day = d;
        }

    }

    public void setMonth(int m) {
        if(m > 0 && m <= 12)
            month = m;
        else
            month = -1;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void output() {
        System.out.printf("month = %d, day = %d\n\n",month,day);
    }
}
