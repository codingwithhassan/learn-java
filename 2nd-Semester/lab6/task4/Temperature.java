public class Temperature{
	private double ftemp;

	public Temperature setFahrenheit(double temp){
		ftemp = temp;
		return this;
	}

	public double getFahrenheit(){
		return ftemp;
	}

	public double getCelsius(){
		return (5.0/9.0) * (ftemp - 32.0);
	}

	public double getKelvin(){
		return ( (5.0/9.0) * (ftemp - 32.0) ) + 273.0;
	}

	public void display(){
		System.out.printf(
			"Fahrenheit: %.2f\nCelsius: %.2f\nKelvin: %.2f\n",
			getFahrenheit(),
			getCelsius(),
			getKelvin()
		);
	}
}