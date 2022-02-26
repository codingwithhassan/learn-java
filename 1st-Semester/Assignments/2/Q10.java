import java.util.Scanner;
public class Q10{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        String name, roll, className, dpt;
        
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter student roll number: ");
        roll = in.nextLine();
        System.out.print("Enter student class: ");
        className = in.nextLine();
        System.out.print("Enter student department: ");
        dpt = in.nextLine();

        System.out.print("Enter marks of Introduction of Programming (0 - 100): ");
        double i2p = in.nextDouble();
        if(i2p < 0 || i2p > 100){
            System.out.println("Marks must be greater than or equal to 0 and less then and equal to 100");
            System.exit(0);
        }
        System.out.print("Enter marks of Islamic Studies (0 - 100): ");
        double isl = in.nextDouble();
        if(isl < 0 || isl > 100){
            System.out.println("Marks must be greater than or equal to 0 and less then and equal to 100");
            System.exit(0);
        }
        System.out.print("Enter marks of English (0 - 100): ");
        double eng = in.nextDouble();
        if(eng < 0 || eng > 100){
            System.out.println("Marks must be greater than or equal to 0 and less then and equal to 100");
            System.exit(0);
        }
        System.out.print("Enter marks of Mathematics (0 - 100): ");
        double math = in.nextDouble();
        if(math < 0 || math > 100){
            System.out.println("Marks must be greater than or equal to 0 and less then and equal to 100");
            System.exit(0);
        }
        System.out.print("Enter marks of IICT (0 - 100): ");
        double iict = in.nextDouble();
        if(iict < 0 || iict > 100){
            System.out.println("Marks must be greater than or equal to 0 and less then and equal to 100");
            System.exit(0);
        }

        double totalMarks = i2p + isl + eng + math + iict;
        double avgTotalMarks = totalMarks  / 5.0;

        System.out.println(totalMarks);

        // student report
        System.out.println("-------------------------- Student Report --------------------------");
        System.out.println("Student Name: "+name);
        System.out.println("Student Roll Number: "+roll);
        System.out.println("Student Class: "+className);
        System.out.println("Student Department: "+dpt);

        System.out.println("           Subjects         |   Marks  |    Grade  |   Grade Points");
        System.out.println("Introduction of Programming |   "+i2p+"   |    "+getGrade(i2p)+"     |     "+getPoints(i2p));
        System.out.println("Islamic Studies             |   "+isl+"   |    "+getGrade(isl)+"     |     "+getPoints(isl));
        System.out.println("English                     |   "+eng+"   |    "+getGrade(eng)+"     |     "+getPoints(eng));
        System.out.println("Mathematics                 |   "+math+"   |    "+getGrade(math)+"     |     "+getPoints(math));
        System.out.println("IICT                        |   "+iict+"   |    "+getGrade(iict)+"     |     "+getPoints(iict));
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Total                       |   "+totalMarks+"   |    "+getGrade(avgTotalMarks)+"     |     "+getPoints(avgTotalMarks));
        System.out.println("---------------------------------------------------------------------");

        System.out.println();

        if( i2p > 50 && isl > 50 && eng > 50 && math > 50 && iict > 50)
            System.out.println("Congratulations. You have Passed the Examination.");
        else
            System.out.println("Better Luck Next Time.");

    }

    private static String getGrade(double marks){
        if(marks >= 85 && marks <= 100){
            return "A+";
        }else if(marks >= 80 && marks < 85){
            return "A-";
        }else if(marks >= 75 && marks < 80){
            return "B+";
        }else if(marks >= 70 && marks < 75){
            return "B";
        }else if(marks >= 65 && marks < 70){
            return "B-";
        }else if(marks >= 61 && marks < 65){
            return "C+";
        }else if(marks >= 58 && marks < 61){
            return "C";
        }else if(marks >= 55 && marks < 58){
            return "C-";
        }else if(marks >= 50 && marks < 55){
            return "D";
        }else{
            return "F";
        }
    }

    private static double getPoints(double marks){
        if(marks >= 85 && marks <= 100){
            return 4.0;
        }else if(marks >= 80 && marks < 85){
            return 3.7;
        }else if(marks >= 75 && marks < 80){
            return 3.3;
        }else if(marks >= 70 && marks < 75){
            return 3.0;
        }else if(marks >= 65 && marks < 70){
            return 2.7;
        }else if(marks >= 61 && marks < 65){
            return 2.3;
        }else if(marks >= 58 && marks < 61){
            return 2.0;
        }else if(marks >= 55 && marks < 58){
            return 1.7;
        }else if(marks >= 50 && marks < 55){
            return 1.0;
        }else{
            return 0.0;
        }
    }
}