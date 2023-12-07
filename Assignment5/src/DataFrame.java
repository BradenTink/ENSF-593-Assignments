import java.util.Arrays;
import java.util.Scanner; 
import java.io.File;
import java.io.IOException;
/**
 * @Braden Tink
 * 
 */

/**
 * 
 * Public class DataFrame
 * Three instance String Array headerNames, 
 * int numOfRows, Double 2DArray all data
 *
 */
public class DataFrame{
	private String[] headerNames; 
	private int numOfRows = 0;
	private double[][] allData;
	
	/**
	 * 	DataFrame Constructor 
	 * @param filename
	 * @throws IOException
	 */
	public DataFrame(String filename) throws IOException{
		Scanner reader = null;
		
		/**
		 * Try catch statement for creating a new scanner object 
		 * catch prints a trace 
		 */
		try {
			//Create Scanner Object and set first name to the header array
			//The first time we call teh scanner object we will get the number of rows in the file. 
			//Will allow us to define the 2D array variably instead of hardcoding 100
			reader = new Scanner(new File(filename));
			String line = reader.nextLine();
			
			/**
			 * First line of csv file split on ","
			 */
			headerNames = line.split(",");
			
			System.out.println(Arrays.toString(headerNames));
			//Using while find the number of rows in the csv file
			while(reader.hasNextLine()) {
				reader.nextLine();
				numOfRows += 1;	
			}
			
			//Iniztiles scanner object again to loop through and add data to the 
			//2D array 
			reader = new Scanner(new File(filename));
			line = reader.nextLine();
			headerNames = line.split(",");
			
			//Creation of 2D double array with the correct rows and columns
			allData = new double[numOfRows][headerNames.length];
			
			int rowCnt = 0;
			double tempDouble = 0.0;
			//While loop that pareses through the file
			//Innter for statement that does throught the indiviudal lines in the file 
			// This allows us to pase indivual elements entering them into the correct field [][]
			while (reader.hasNextLine()) {
				//Create a String array named Data that will hold lines from the scanner
				//Data is then split on the commas 
				String[] data = reader.nextLine().split(",");
				//Parsing the Data Array and the outer while loop populate allData[][]
				for (int j = 0; j < data.length; j++) {
					tempDouble = Double.parseDouble(data[j]);
					allData[rowCnt][j] = tempDouble;
				}
                
                rowCnt += 1;
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}
			
	}
	
	/**
	 * public method getNumOfRows
	 * @return numOfRows
	 */
	public int getNumOfRows() {
		return numOfRows;
	}
	/**
	 * public method getNumOfCols
	 * @return headerNames.length i.e number of columns
	 */
	public int getNumOfCols() {
		return headerNames.length;
	}
	
	/**
	 * public method getHeaderNanes
	 * @return headerNames in String Array
	 */
	public String[] getHeaderNames() {
		return headerNames;
	}
	/**
	 * public method getColumnByIndex
	 * @param int col
	 * @return DataSeries object 
	 */
	public DataSeries getColumnByIndex(int col) {
		//return dataseries x
		
		DataSeries series = new DataSeries(headerNames[col]);
		for (int i = 0; i < numOfRows; i++) {
			series.add(allData[i][col]);
		}
		return series;
	}
	
	
	/**
	 * public toString method
	 * Creates the correct string output for the dataframe object
	 * Output is limited after ten rows  
	 */
	@Override
	public String toString() {
		String tempStr = "";
		String rowStr = ""; 
		double tempDbl = 0.0;
		//this grabs headers
		
		for (int N = 0; N < headerNames.length; N++) {
			tempStr = tempStr + "|" + headerNames[N];
		}
		tempStr = tempStr + "|";
		tempStr = tempStr + "\n" + "------------------";
		//Need to parse through all the rows or no more than 10
		int i = 0;
		int i2 = 5;
		if (numOfRows > 10) {
			while(i<5) {
				rowStr = "";
				for (int j = 0; j < headerNames.length; j++) {
					tempDbl = allData[i][j];
					rowStr = rowStr + "|" + tempDbl;
				}
				rowStr = rowStr + "|";
				tempStr = tempStr + "\n" + rowStr;
				if (i == 4 && numOfRows > 10) {
					tempStr = tempStr + "\n" + "." + "\n" + "." + "\n" + ".";
				}
				i+=1;
			}
			while(i2>0) {
				rowStr = "";
				for (int j = 0; j < headerNames.length; j++) {
					tempDbl = allData[numOfRows-i2][j];
					rowStr = rowStr + "|" + tempDbl;
				}
				rowStr = rowStr + "|";
				tempStr = tempStr + "\n" + rowStr;
				i2-=1;
			}
		}else {
			while(i<numOfRows) {
				rowStr = "";
				for (int j = 0; j < headerNames.length; j++) {
					tempDbl = allData[i][j];
					rowStr = rowStr + "|" + tempDbl;
				}
				rowStr = rowStr + "|";
				tempStr = tempStr + "\n" + rowStr;
				i+=1;
			}
		}
		
		return tempStr;
	
	}

}
