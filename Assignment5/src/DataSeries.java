import java.util.Arrays;

/**
 * @Braden 
 *Public DataSeries class that implements IBasicStats
 *Creates three instance variables 
 *Private String label
 *Private double data[]
 *private int count initilizing it to 0
 */
public class DataSeries implements IBasicStats {
	private String label; 
	private double data[];
	private int count = 0;
	

	/**
	 * Constuctor for the Dataseries takes in one argument String label
	 * @param label public 
	 * Creates a double array with a length of 100
	 */
	public DataSeries(String label) {
		this.label = label;
		data  = new double[100];
	}
	
	/**
	 * public void method add takes in one argument double val
	 * @param val
	 * sets the index value of current count to the val 
	 * Iterates the count after the set 
	 */
	public void add(double val) {
		data[count] = val;
		count += 1;
	}
	
	/**
	 * public method size no arguments
	 * @return count(int) i.e the size
	 */
	public int size() {
		return count;
	}
	
	/**
	 * public method getMin no arguments
	 * @returns the minValue
	 * Parses through all the values in data 
	 * to find the lowest value  
	 */
	@Override
	public double getMin() {
		double minValue = data[0];
		
		for (int i = 0; i < (count - 1); i++) {	
			if (minValue <= data[i+1]) {
				
			}else {
				minValue = data[i+1];
			}
		}
		return minValue;
	}
	/**
	 * public method getMax no arguments 
	 * @returns double getMax 
	 * Parses through all the values in data 
	 * to find the max value 
	 */
	@Override
	public double getMax() {
		double maxValue = data[0];
	
		for (int i = 0; i < (count - 1); i++) {	
			if (maxValue <= data[i+1]) {
				maxValue = data[i+1];
			}else {
				
			}
		}
		return maxValue;
	}
	/**
	 * public method getSum no arguments
	 * @returns double getSum
	 * Method parses through data array summing all values
	 * value is then set to a string formatted and then back
	 * to a double and returned 
	 * 
	 */
	@Override
	public double getSum() {
		
		double getSum = 0;
		
		for (int i=0;i<(count);i++) {
			getSum = getSum + data[i];
		}
		
		getSum = Double.parseDouble(String.format("%.2f", getSum));
	
		return getSum;
	}
	
	/**
	 * public getMean no arguments 
	 * @returns double getMean
	 * Method parses through the data array and then 
	 * divides by count to get mean 
	 * value si then turend into a string fomratted 
	 * then back to a dobule and returned
	 * 
	 */
	@Override
	public double getMean() {
		double getMean = 0;
		getMean = getSum() / count;
		getMean = Double.parseDouble(String.format("%.2f", getMean));
		return getMean;
	}
	/**
	 * public method toString no arguments
	 * @returns a String repersentation of the series 
	 * If the series is larger than or equal to 10 then adjust 
	 * to show last and first 5 value of the series
	 * else just show all values 
	 * 
	 */
	@Override
	public String toString() {
		String tempStr = "";
		double[] resizedArray = new double[this.count];
	    System.arraycopy(data, 0, resizedArray, 0, count);
	    
	    if (count > 10) {
	    	for (int i = 0; i < 5; i++) {
	    		if (i == 9) {
	    			tempStr = tempStr + String.valueOf(resizedArray[i]);
	    		}else {
	    			tempStr = tempStr + String.valueOf(resizedArray[i]) + ", ";
	    		}
	    		if(i == 4) {
	    			tempStr = tempStr + ". . . ";	
	    		}		
	    	}
	    	for (int i2 = 5; i2 > 0; i2--) {
	    		if (i2 == 1) {
	    			tempStr = tempStr + String.valueOf(resizedArray[count-i2]);
	    		}else {
	    			tempStr = tempStr + String.valueOf(resizedArray[count-i2]) + ", ";
	    		}		
	    	}
	    }else {
	    	tempStr = Arrays.toString(resizedArray);
	    }
	    tempStr = "[" + tempStr + "]";
		return label + " " + tempStr;
	}

}
