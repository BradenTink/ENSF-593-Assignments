 /**
 * @Braden Tink 
 *The class Temperature converts a temperature value with a base unit of Fahrenheit
 *into celsius using the getCelcius method  
 *Two conversions are perfomred  
 */

public class Temperature {
	double degrees = 0.0;
	
	/**
	 * define temperature constructor 
	 *
	 */
	public Temperature(double degrees) {
		this.degrees = degrees;
	}
	/**
	 *takes in the degrees value 
	 *no conversion as degrees is based in F
	 */
	double getFahrenheit() {
		return (double) this.degrees;
	}
	/**
	 *converts the temp from F to C 
	 *using the degrees double 
	 */
	double getCelsius() {
		return (double) (5 * (this.degrees - 32) / 9);
		
	}
	/**
	 *Main method   
	 *creates to object from the constructor Temperature
	 *converts both temperature values from F to C
	 *Prints the results and if need rounds to decimal places for accuracy
	 */
	public static void main(String[] args) {
		//Init temperature variables 
		double temp1 = 20.0, temp2 = 98.6;
		
		
		//should pass out the temp to a double instead of assigning it to the thermometer
		Temperature thermometer1 = new Temperature(temp1);
		thermometer1.degrees = thermometer1.getFahrenheit();
		System.out.println("The temperature of thermometer1 is " + temp1 + " degrees Fahrenheit.");
		thermometer1.degrees = thermometer1.getCelsius();
		System.out.printf("The temperature of thermometer1 is " + "%.2f", thermometer1.degrees);
		System.out.println(" degrees Celsius.");
		
		Temperature thermometer2 = new Temperature(temp2);
		thermometer2.degrees = thermometer2.getFahrenheit();
		System.out.println("The temperature of thermometer1 is " + temp2 + " degrees Fahrenheit.");
		thermometer2.degrees = thermometer2.getCelsius();
		System.out.println("The temperature of thermometer1 is " +  thermometer2.degrees + " degrees Celsius.");
		
	//use string format 	
	}

}
