public class Pet {
    private String eyeColor;
    private double age;
    private double weight;
    private String location;

    public Pet() {
        this.setEyeColor("Black");
        this.setAge(1);
        this.setWeight(2);
        this.setLocation("Australia");
    }// default constructor

    public Pet(String eyeColor, double age, double weight, String location) {

        this.setEyeColor(eyeColor);
        this.setAge(age);
        this.setWeight(weight);
        this.setLocation(location);

    }// overloaded constructor

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }// setEyeColor

    public void setAge(double age) {
        this.age = age;
    }// setAge

    public void setWeight(double weight) {
        this.weight = weight;
    }// setWeight

    public void setLocation(String location) {
        this.location = location;
    }// setLocation

    public String getEyeColor() {
        return this.eyeColor;
    }// getEyeColor

    public double getAge() {
        return this.age;
    }// getAge

    public double getWeight() {
        return this.weight;
    }// getWeight

    public String getLocation() {
        return this.location;
    }// getLocation

    public void display() {
        System.out.println("Eye color: " + this.getEyeColor());
        System.out.println("Age: " + this.getAge());
        System.out.println("Weight: " + this.getWeight());
        System.out.println("Location: " + this.getLocation());
    }// display()

    public void eat(String foodType) {
        System.out.println("The pet eats " + foodType + ".");
    }// eat

    public void sleep(double timeLength) {
        System.out.println("The pet sleeps for " + timeLength + ".");
    }// sleep

}// class