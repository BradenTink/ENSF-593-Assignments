
/**
 * A class to test the Days class.
 * 
 * Runs through all the months 1 - 12 and prints the number of days.
 * 
 * @Braden Tink 
 *
 */
//Loop through all the 12 months and spit out the correct number of days that it contains
public class DaysTester {

	public static void main(String[] args) {
		// mian will print all the months an there days
		//Months shown as an int from 1-12

		int i = 1;
		int c = 0;
		//while loop that prints a line showing the nubmer days based on the month
		while (i <= 12) {
			if (i == 2){
				System.out.println("28 Days in month " + i);
			}
			else if (i < 8) {
				c = (i % 2);
				if (c == 0) {
					System.out.println("30 Days in month " + i);
				}
				else {
					System.out.println("31 Days in month " + i);
				}
			}
			else {
				c = (i % 2);
				if (c == 0) {
					System.out.println("31 Days in month " + i);
				}
				else {
					System.out.println("30 Days in month " + i);
				}
			}
		
			i++;
		}
		
	}
	
}
