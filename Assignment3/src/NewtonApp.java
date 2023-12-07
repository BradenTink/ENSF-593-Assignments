
/**
 * @Braden Tink 
 *
 */

// Add in interativeCLI 
//Cli that allows us to interact with the console to take in values
public class NewtonApp {
	
	private InteractiveCLI cli;
	
	public NewtonApp() {
		cli = new InteractiveCLI();
	}
	
	public void run() {
		//Constructor for the netwonsolver obejct init the variables
		NewtonSolver NewtonSolverObj = new NewtonSolver(0.0, 0.0, 0.0);
		
		
		this.cli.display("*** Determine Square Root By Newton ***");
		
		//ask for value needs to be positive
		this.cli.prompt(" Enter a positive value i.e 25.0 > ");
		NewtonSolverObj.N = this.cli.getKeyboardDouble();
		//ask for error
		this.cli.prompt(" Enter a maximum error i.e 0.001 > ");
		NewtonSolverObj.maxerror = this.cli.getKeyboardDouble();
		//inital guess
		this.cli.prompt(" Enter a inital guess i.e 12.0 > ");
		NewtonSolverObj.guess = this.cli.getKeyboardDouble();
		//output user inouts for the three values
		System.out.println("");
		this.cli.display("You Entered the value = "  + NewtonSolverObj.N + ", Error = " + NewtonSolverObj.maxerror + " Inital Guess = " + NewtonSolverObj.guess);
		//output the vakue we are square rooting
		System.out.println("");
		this.cli.display("The sqaure root of " + NewtonSolverObj.N + " is: ");
		
		//output the sqrt value
		System.out.println("Final Value " + NewtonSolverObj.sqrt() + " ");
		System.out.println("");
		//output number of iterations
		System.out.println("Computed in " + NewtonSolverObj.nIter + " iterations");
	
	}
	public static void main(String[] args) {
		NewtonApp NewtonAppObj = new NewtonApp();
		
		NewtonAppObj.run();	
	}

}
