public class CelsiusToKelvinLab8{
	public static void main(String[] args) {
		int celcius = 0;
		double kelvin;
		System.out.println("Celsius | Kelvin");
		while(celcius <= 100){
			kelvin = celcius + 273.15;
			System.out.println(celcius + " | " + kelvin );
			celcius += 10;
		}
	}
}