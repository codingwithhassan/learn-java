public class RunStudent {
    public static void main(String[] args) {
        Student std = new Student();

        std.setName("hassan");
        std.setSection( "A");

        System.out.println(std.getSection());
        System.out.println(std.getName());
    }

}
