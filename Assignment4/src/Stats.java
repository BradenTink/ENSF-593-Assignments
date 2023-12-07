import java.util.Arrays;

/**
 * Partial implementation of Stats class
 * 
 * @Braden Tink
 * 
 */
//Public class stats 
//Two private variables an array: grades and int count
public class Stats {
	private int grades[];
	private int count;
	
	//Contructor for stats creating an array with a length of 100
	//count gets initlized to 0 
	public Stats() {
		grades = new int[100];
		count = 0;
	}

	//Add number method
	//Method takes in one argument 
	//Adds the value to the array then iterates the count
	//Method returns nothing 
	public void add(int number) {
		this.grades[this.count] = number;
		this.count ++;		
	}
	
	//Pulbic method getMean
	//Takes in no arguments
	//Returns a double being the mean value of the array 
	public double getMean (){
		double mean = 0.0;
		//Parses through the array and calculates the total value
		for( int i = 0; i < count ;i++) {
			mean = mean + grades[i];
		}
		mean = mean / count;
		return mean;
	}
	
	//Public method get Median 
	//Takes in no arguments
	//Returns a double being the Median
	public double getMedian() {
		double medianValue = 0.0;
		//If statment that checks the modulus of the count by 2 
		//If there is a remainder than we have an odd number 
		//else even numberr
		if (count % 2 == 0) {
			//find median with an even count
			medianValue = (grades[(count/2) - 1] + grades[count/2]) / 2;
		}
		else {
			//fid median with an odd count
			medianValue = (grades[((count+1)/2)-1]);
		}
		
		return medianValue;
	}
	//Public Method toString
	//Take sin no arguments
	//Returns all the calcualted values call other methods inside
	public String toString() {
		String arrayToString = "";
		int tempArray[]; 
		//Create a temp array which we can display as the grades array is 100 in length
		tempArray = new int[count];
		
		for (int i = 0; i < count; i++) {
			tempArray[i] = grades[i];
		}
		
		grades = tempArray;
		//call sort method
		this.sort();
		//set arrayToString equal a long string that call multiple methods for the output
		arrayToString = ("values: " + Arrays.toString(grades).replace("[", "").replace("]","").replace(",", "") + "\n") + ("mean = " + this.getMean() + "\n") + ("Median " + this.getMedian() + "\n");
		return arrayToString;
	}
	
	/**S
	 * 
	 * Sorts the first count elements of grades array with Bubble sort.
	 * 
	 * Bubble sort adapted
	 * from 5.2 Try-this: Sorting an array 
	 * in Java, a beginner's guide 9th ed 
	 * 
	 */
	//Public sort method 
	//Takes in no arguments
	//Sorts the grades array 
	//Returns nothing 
	public void sort() {
		int a, b, t;
		
		for(a=1; a<count; a++) {
			for(b=count-1;b>=a;b--) {
				if(grades[b-1]>grades[b]) {
					//exchange elemetns
					t = grades[b-1];
					grades[b-1] = grades[b];
					grades[b] = t;
				}
			}
			
		}
	}
}
