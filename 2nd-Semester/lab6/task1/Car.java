package lab6.task1;
/**
 * @author 211370007
 * @version 1.0.0
 */
public class Car {

	/**
	 * Year of made
	 */
	private int yearModel;

	/**
	 * author who make this car
	 */
	private String make;

	/**
	 * current speed of car
	 */
	private int speed;

	/**
	 * @return the yearModel
	 */
	public int getYearModel() {
		return yearModel;
	}

	/**
	 * @param yearModel
	 *            the yearModel to set
	 */
	public void setYearModel(int yearModel) {
		this.yearModel = yearModel;
	}

	/**
	 * @return the make
	 */
	public String getMake() {
		return make;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		} else {
			this.speed = 0;
		}
	}

	/**
	 * Display car description
	 * 
	 * @return void
	 */
	public void display() {
		System.out.printf("Year: %d\nMake: %s\nSpeed: %d", this.getYearModel(), this.getMake(), this.getSpeed());
	}

	/**
	 * Speed up 5
	 * 
	 * @return void
	 */
	public void accelerate() {
		setSpeed(getSpeed() + 5);
	}

	/**
	 * speed down 5
	 * 
	 * @return void
	 */
	public void brake() {
		setSpeed(getSpeed() + 0);
	}

}
