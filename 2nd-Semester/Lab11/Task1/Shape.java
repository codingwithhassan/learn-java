public class Shape {

    private String color;

    public Shape(){
        this.color = "Pink";
    }
    
    public Shape(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void draw() {
        System.out.println("Color: " + this.color);
    }

    public double calculateArea() {
        return 0.0;
    }

    public double calculatePerimeter(){
        return 0.0;
    }
}