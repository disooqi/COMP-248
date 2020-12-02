package tutorial_10_More_on_Classes;

public class Q2 {

	public static void main(String[] args) {
		Temperature tmp1 = new Temperature(30, 'F');
		Temperature tmp2 = new Temperature(15, 'C');
		

		System.out.println("Temperature in Celsius is " + tmp2.getTempInCelsius());
		
		System.out.println(tmp1.isHotter(tmp2));
		System.out.println(Temperature.isHotter(tmp1, tmp2));
		System.out.println(Temperature.isHotter(tmp2, tmp1));
		
		System.out.println();
		System.out.println(tmp1);
		System.out.println(tmp2);
		
		System.out.println();
		System.out.println(Temperature.add(tmp1, tmp2));
		

	}

}

class Temperature {
	private double value;
	private char scale;

	public Temperature() {
		value = 0;
		scale = 'C';
	}

	public Temperature(double v, char s) {
		value = v;

		if (s == 'C' || s == 'F')
			scale = s;
		else
			scale = 'C';
	}

	public double getTempInCelsius() {
		// Celsius = (5/9)*(Fahrenheit-32)
		if (scale == 'C')
			return value;
		else
			return (5.0 / 9) * (value - 32);
	}
	
	public void setTemp(double v, char s) {
		value = v;
		
		if (s == 'C' || s == 'F')
			scale = s;
		else
			scale = 'C';
	}
	
	public boolean isHotter(Temperature t) {
		if(scale == t.scale)
			return value > t.value;
			

		if(scale == 'F')
			return this.getTempInCelsius() > t.value;
		else
			return value > t.getTempInCelsius();		
	}
	
	static boolean isHotter (Temperature in1, Temperature in2) {
		
		if (in1.scale == in2.scale)
            return in1.value > in2.value;

        if(in1.scale == 'F')
            return in1.getTempInCelsius() > in2.value;
        else
            return in1.value > in2.getTempInCelsius();
	}
	
	public String toString() {
		return "The temperature is "+value+scale;
    }
	
	static double add(Temperature in1, Temperature in2) {
//		if (in1.scale == in2.scale && in1.scale == 'C')
//            return in1.value + in2.value;
//		if(in1.scale == in2.scale && in1.scale == 'F')
//            return in1.getTempInCelsius() + in2.getTempInCelsius();
//		
//		if(in1.scale == 'F')
//            return in1.getTempInCelsius() + in2.value;
//        else
//            return in1.value + in2.getTempInCelsius();

		return in1.getTempInCelsius() + in2.getTempInCelsius();
	} 


}
