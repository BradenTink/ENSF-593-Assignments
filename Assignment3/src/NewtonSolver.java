
/**
 * @Braden Tink
 *
 */
public class NewtonSolver {
	double N;
	double maxerror;
	double guess;
	int nIter;
	
	//
	//Method that the cli will call to find the value 

	public NewtonSolver(double x, double y, double z) {
		N = x;
		maxerror = y;
		guess = z;
		
		
	}
	//this needs to return a double 
	
	public double sqrt() {
		//Guess is the value you believe to be the square root 
		//N is the value 
		double lastguess = 0;
		double currentguess = this.guess;
		double interValue = 0;
		
		int i = 0; 
		

		while( true ){
			lastguess = currentguess;
			currentguess = (( this.N / lastguess) + lastguess) / 2;
			
			
			//System.out.println("LastGuess " + lastguess + " currentguess " + currentguess + " ");
			
			interValue = (lastguess - currentguess);
			if (interValue < 0) {
				interValue = interValue * -1;
			}	
			if ( interValue < this.maxerror) {
				break;
			}
			i++;
		}
		
		this.nIter = i;
		
		return currentguess;		
	}
	
	//Method for number of iterations 
	
	
	// ;

}
