/**
 * Class representing a certificate of deposit.
 * 
 * @Braden Tink 
 *
 */

public class BankCD {
	double principal;
	double rate;
	double years;
	
	//Constuctor for BankCD 
	//Takes three doubles as the arguments
	public BankCD(double x, double y, double z) {
		principal = x;
		rate = y;
		years = z;
	}
	//Calc Yearly method which calcualtes the yearly maturity  
	//Value calculated based on whats currenlty held in bankObj i.e BankCD
	//returns a double yearly which is the maturity
	public double calcYearly() {
		double yearly = 0;
		this.rate = this.rate / 100;
		
		yearly = this.principal * Math.pow(1 + this.rate, this.years);
		
		return yearly;
	}
	//Calc Daily method which calcualtes the daily maturity  
	//Value calculated based on whats currenlty held in bankObj i.e BankCD
	//returns a double daily which is the maturity
	public double calcDaily() {
		double daily = 0;
		
		daily = this.principal * Math.pow(1 + this.rate/365, 365*this.years);
		return daily;
	}	
	
}
