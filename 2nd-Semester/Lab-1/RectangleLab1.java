public class RectangleLab1{

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();

		double length = rectangle.getLength();
		double width = rectangle.getWidth();
		double area = rectangle.getArea(width,length);

		// display output
		rectangle.display(width,length,area);
	}
}