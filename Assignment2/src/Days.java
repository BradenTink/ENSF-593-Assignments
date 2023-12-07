
/**
 * 
 * TODO: add JavaDoc
 * 
 * @Braden Tink 
 *public class days 
 *1 method that takes and int for the argument which will spit out the number of days
 */
public final class Days {
	
	//static method 
	//
	static int howManyDaysInMonth(int number) {
		int i = number;
		int toalDays = 0;
		
		if (i == 2){
			//System.out.println("28 Days in month " + i);
			toalDays = 28;
		}
		else if (i < 8) {
			i = (i % 2);
			if (i == 0) {
				//System.out.println("30 Days in month " + i);
				toalDays = 30;
			}
			else {
				//System.out.println("31 Days in month " + i);
				toalDays = 31;
			}
		}
		else {
			i = (i % 2);
			if (i == 0) {
				//System.out.println("31 Days in month " + i);
				toalDays = 31;
			}
			else {
				//System.out.println("30 Days in month " + i);
				toalDays = 30;
			}
		}
		return toalDays;
	}
	
	/**
	 * Days cannot be instantiated, has static methods only.
	 */
	private Days() {}

}
