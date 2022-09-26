public class Fish extends Pet {

    private boolean jawless;
    private boolean dorsalFin;
    private int swimSpeed;

    public Fish() {
        super();
        this.setJawless(false);
        this.setDorsalFin(false);
        this.setSwimSpeed(5);
    }// default constructor

    public Fish(boolean jawless, boolean dorsalFin, int swimSpeed) {
        super();
        this.setJawless(jawless);
        this.setDorsalFin(dorsalFin);
        this.setSwimSpeed(swimSpeed);
    }// three-argument overloaded constructor

    public Fish(boolean jawless, boolean dorsalFin, int swimSpeed,
            String eyeColor, double age, double weight, String location) {
        super(eyeColor, age, weight, location);
        this.setJawless(jawless);
        this.setDorsalFin(dorsalFin);
        this.setSwimSpeed(swimSpeed);
    }// seven-argument overloaded constructor

    public void setJawless(boolean jawless) {
        this.jawless = jawless;
    }// setJawless

    public void setDorsalFin(boolean dorsalFin) {
        this.dorsalFin = dorsalFin;
    }// setDorsalFin

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed = swimSpeed;
    }// setSwimSpeed

    public boolean isJawless() {
        return this.jawless;
    }// isJawless

    public boolean isDorsalFin() {
        return this.dorsalFin;
    }// isDorsalFin

    public int getSwimSpeed() {
        return this.swimSpeed;
    }// getSwimSpeed

    public void display() {
        System.out.print("Jawless: ");
        if (this.isJawless()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } // if

        System.out.print("Dorsal fin: ");
        if (this.isDorsalFin()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } // if

        System.out.println("Swim speed: " + this.getSwimSpeed());
        super.display();
    }// display()

    public void swim(String direction) {
        System.out.println("The fish is swimming " + direction + ".");
    }// purr

    public void eat(String foodType) {
        System.out.println("The fish eats " + foodType + ".");
    }// eat

}// class