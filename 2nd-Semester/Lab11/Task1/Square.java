public class Square extends Shape {
    private double length;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Square() {
        super();
        this.length = 0.0;
    }

    public Square(double length, String color) {
        super.setColor(color);
        this.length = length;
    }
    
    public void draw() {
        System.out.println(
            "Color: " + super.getColor() + "\nLength: " + this.getLength()
        );
    }

    @Override
    public double calculateArea() {
        return length * length;
    }

    @Override
    public double calculatePerimeter() {
        return length * 4;
    }
}
