public class Substance{
	private int temperature;

	public void setTemperature(int temperature){
		this.temperature = temperature;
	}

	public int getTemperature(){
		return temperature;
	}

	public boolean isEthylFreezing(){
		boolean value = temperature <= -173;
		return value;
	}

	public boolean isEthylBoiling(){
		if(temperature >= 172)
			return true;
		return false;
	}

	public boolean isOxygenFreezing(){
		return temperature <= -362;
	}

	public boolean isOxygenBoiling(){
		return temperature >= -306;
	}

	public boolean isWaterFreezing(){
		return temperature <= 32;
	}

	public boolean isWaterBoiling(){
		return temperature >= 212;
	}

	public void displayReport(){
		System.out.println(
			"is Ethyl Freezing ? " + isEthylFreezing() + "\n" +
			"is Ethyl Boiling ? " + isEthylBoiling() + "\n" +
			"is Oxygen Freezing ? " + isOxygenFreezing() + "\n" +
			"is Oxygen Boiling ? " + isOxygenBoiling() + "\n" +
			"is Water Freezing ? " + isWaterFreezing() + "\n" +
			"is Water Boiling ? " + isWaterBoiling() + "\n"
		);
	}

}