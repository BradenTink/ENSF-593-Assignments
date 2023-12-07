
/**
 * @Braden Tink 
 *This code compares 3 objects that are defined in the Tile constructor
 *Objects are compared based on the Letter and the value
 *THen will print the output what each tile is and then if tile 1 or 2 equals tile 0 
 *three variables defined result letter value
 */
public class Tile {
	char letter;
	int value;
	String resultStr;
	//boolean bRet; 
	
	/*
	*Define the tile constructor 
	*two arguments letter and value
	*/
	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}
	
	/*
	 *From the Tile Object convert the two arguments to 
	 *a string value of letter[value]
	 *result is then stored in the string named Str 
	 */
	public String toString(){
		this.resultStr = this.letter + "[" + this.value + "]";
		return this.resultStr;
	}
	/*
	 * Equals method that check if the base object is equal 
	 * to the variable object that is passed in
	 * result is then stored in the string named bRet
	 */
	boolean equals(Tile TileX){
		if (this.value == TileX.value && this.letter == TileX.letter) {
			//this.bRet = true;
			return true;
		}
		else {
			//this.bRet = false;
			return false;
		}
	}
	
	/*
	 * Main function which defines three objects from the Tile constructor 
	 * Then prints the three tiles content using the toString() method
	 * Compares Til0 to Tile1 and Tile0 to Tile2 using the equals() method
	 * print the results of the compare
	 */
	public static void main(String[] args) {
		
		Tile Tile0 = new Tile('A', 1);
		Tile Tile1 = new Tile('A', 1);
		Tile Tile2 = new Tile('Z', 10);
		
		Tile0.toString();
		System.out.println("Tile 0: " + Tile0.resultStr);
		Tile1.toString();
		System.out.println("Tile 1: " + Tile1.resultStr);
		Tile2.toString();
		System.out.println("Tile 2: " + Tile2.resultStr);
		
		Tile0.equals(Tile1);
		System.out.println("Tile 0 is equal to Tile 1 is " + Tile0.equals(Tile1));
		Tile0.equals(Tile2);
		System.out.println("Tile 0 is equal to Tile 1 is " + Tile0.equals(Tile2));
		//didnt need to use bRet justhad to pass out the return of equals method then this would
		//of been correct 
		
	}
}
