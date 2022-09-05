public class Sheep extends Animal {
    private String name;
    private String color;
    
    public Sheep() {
        this.name = "No Name";
        this.color = "unknown";
    }
    
    public Sheep(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Sheep(String eats, boolean vegeterian, int noOfLegs, String name, String color) {
        super(eats, vegeterian, noOfLegs);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + "Sheep [color=" + color + ", name=" + name + "]\n";
    }
     
    @Override
    public void talk(){
        System.out.println("me me");
    }
}
