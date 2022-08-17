package lab6.task1;

/**
 * @author 211370007
 * @version 1.0.0
 */
public class RunCar {
	
	
	/**
	 * @param String args[]
	 * @return void
	 */
	public static void main(String args[]) {
		Car car = new Car();

		car.setMake("Audi");
		car.setSpeed(100);
		car.setYearModel(2017);

		car.display();
	}
}
