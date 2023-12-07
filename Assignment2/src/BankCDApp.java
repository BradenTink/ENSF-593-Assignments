/**
 * Class representing command-line interface to compute 
 * yearly and daily compounded certificate of deposit.
 *  
 * @Braden Tink
 *
 */
//Import the number formatter so we can translate our maturity value to canadian currency format
import java.text.NumberFormat;
import java.util.Locale;


public class BankCDApp {
	
	//private BankCD bank;
	private InteractiveCLI cli;
	
	
	public BankCDApp() {
		cli = new InteractiveCLI();
	}
	
	public void run() {
		
		NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.CANADA);

		//Construct a new BankCD object passing in intial values (3 doubles) AS arguments
		BankCD bankObj = new BankCD(0.0, 0.0, 0.0);
		//place holder for return for both methods to use the currency formatter against 
		double mydouble = 0.0;
		
		//Print messages
		System.out.println("************************ OUTPUT ********************");
		System.out.println("Compare daily and annual compunding for a Bank CD.");
		//Prompt user for principal then store it in bankObj.principal
		this.cli.prompt(" Input CD inital principal, e.g. 1000.55 > ");
		bankObj.principal = this.cli.getKeyboardDouble();
		
		//Prompt user for rate then store it in bankObj.rate
		this.cli.prompt(" Input CD Interest rate, e.g. 6.5 > " );
		bankObj.rate = this.cli.getKeyboardDouble();
		
		//Prompt user for years then store it in bankObj.years
		this.cli.prompt(" Input the number of years to maturity e.g., 10.5 > ");
		bankObj.years = this.cli.getKeyboardDouble();
		
		//print current bankObj
		System.out.println("For Principal = " + bankObj.principal + " Rate = " + bankObj.rate + " Years = " + bankObj.years + "");
		
		//call calcYearly method storing result double in mydouble
		//Print the maturity for yearly pasing it into the currency formatter
		mydouble = bankObj.calcYearly();
		System.out.println(" The maturity value compounded yearly is: " + currencyFormatter.format(mydouble) + "");
		
		//call calcDaily method storing result double in mydouble
		//Print the maturity for yearly pasing it into the currency formatter
		mydouble = bankObj.calcDaily();
		System.out.println(" The maturity value compounded daily is: " + currencyFormatter.format(mydouble) + "");
		
		System.out.println("************************ OUTPUT ********************");
	
	}

	public static void main(String[] args) {
		//constuctor for the BankCDApp
		BankCDApp app = new BankCDApp();
		app.run();
		
	}

}
