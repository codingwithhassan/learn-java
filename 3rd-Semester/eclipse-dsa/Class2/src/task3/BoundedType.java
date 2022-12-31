package task3;

public class BoundedType {
	public <T extends Number> void largestValue(T number1,
			T number2, T number3) {
		double larger;
		if(number1.doubleValue() > number2.doubleValue()) {
			larger = number1.doubleValue();
		}else {
			larger = number2.doubleValue();
		}
		
		if(larger > number3.doubleValue()) {
			System.out.println(larger + " is largest.");
		}else {
			System.out.println(number3.doubleValue());
		}
	}

}
