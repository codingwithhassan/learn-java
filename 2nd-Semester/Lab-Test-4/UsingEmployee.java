public class UsingEmployee{
    public static void main(String[] args) {
        Employee em = new Employee();
        Employee em2 = new Employee("Ali", "male", 0310, 8, 40, 30);

        em.setGender("female");
        em.setName("Maria");

        em.isWorking();
        em.pay();

        em.display();

        em2.display();
    }
}