public class Bird extends Pet {
    private String featherColor;
    private double wingSpan;
    private String beakType;
    private boolean canFly;

    public Bird() {
        super();
        this.setFeatherColor("blue");
        this.setWingSpan(1.2);
        this.setBeakType("Seed-eater");
        this.setCanFly(true);
    }// default constructor

    public Bird(String featherColor, double wingSpan, String beakType, boolean canFly) {
        super();
        this.setFeatherColor(featherColor);
        this.setWingSpan(wingSpan);
        this.setBeakType(beakType);
        this.setCanFly(canFly);
    }// four-argument overloaded constructor

    public Bird(String featherColor, double wingSpan, String beakType, boolean canFly,
            String eyeColor, double age, double weight, String location) {
        super(eyeColor, age, weight, location);
        this.setFeatherColor(featherColor);
        this.setWingSpan(wingSpan);
        this.setBeakType(beakType);
        this.setCanFly(canFly);
    }// eight-argument overloaded constructor

    public void setFeatherColor(String featherColor) {
        this.featherColor = featherColor;
    }// setFeatherColor

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }// setWingSpan

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }// setBeakType

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }// setCanFly

    public String getFeatherColor() {
        return this.featherColor;
    }// getFeatherColor

    public double getWingSpan() {
        return this.wingSpan;
    }// getWingSpan

    public String getBeakType() {
        return this.beakType;
    }// getBeakType

    public boolean isCanFly() {
        return this.canFly;
    }// isCanFly

    public void display() {
        System.out.println("Feather color: " + this.getFeatherColor());
        System.out.println("Wing span: " + this.getWingSpan());
        System.out.println("Beak type: " + this.getBeakType());
        System.out.print("Can fly: ");
        if (this.isCanFly()) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        } // if
        super.display();
    }// display()

    public void squawk() {
        System.out.println("The bird is squawking.");
    }// squawk

    public void fly() {
        System.out.println("The bird is flying.");
    }// fly

    public void eat(String foodType) {
        System.out.println("The bird eats " + foodType + ".");
    }// eat

}// class