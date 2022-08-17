public class RunBook {
    public static void main(String[] args) {
        Book maths = new Book();
        Book english = new Book();

        System.out.println("For maths:");
        maths.get();
        System.out.println("For english:");
        english.get();

        maths.show();
        english.show();

        // changing values for maths
        System.out.println("\nChange values for maths: ");
        maths.get();

        System.out.println("The details of the costliest book are:");
        maths.show();
        english.show();
    }
}
