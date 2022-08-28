public class RunCourse {
    public static void main(String[] args) {
        
        Course c[] = new Course[5];

        c[0] = new Course("ENG-233","English",2);
        c[1] = new Course("CSS-233","OOP",3);

        c[2] = new Course();
        c[2].setCode("CS-243");
        c[2].setName("Probability");
        c[2].setCredits(2);

        c[3] = new Course("CSS-239","DLD",3);

        c[4] = new Course(c[1]);

        System.out.println("All Courses: ");
        Course.print(c);

        System.out.println("Is fifth object Equal to second object? : " + ( c[4].isEqual(c[1]) ? "Yes" : "No" ));

        System.out.println("Is 'css-239' code found in list? : " + (Course.linearSearch(c, "css-239") != -1 ? "Found" : "Not Found"));

        System.out.println("After Sorting: ");
        Course.sort(c);
        Course.print(c);

        System.out.println("BINARY_SEARCH");
        System.out.println("Is 'oop' course found in list? : " + (Course.search(c, "oop") != -1 ? "Found" : "Not Found"));
    }
}
