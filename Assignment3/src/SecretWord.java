/**
 * @Braden Tink
 *SecretWord class that a user must try entering values into the GUI inorder to find the
 *Secretword
 */
public class SecretWord {
	private String secretWord;
	private String displayedWord;

	//SecretWord constructor that has a varialb secretword that is set before running the 
	//program. 
	//Displayed word is assinged to the replace chars method with 2 args to change all 
	//chars to a '*'
	public SecretWord(){
		secretWord = "eclipse";
		//secretWord = "hello";
		displayedWord = replaceChars(secretWord, '*');	
	}
	
	
	//ReplaceChars method takes in two arguments a string and a character
	//method then replaces all the characters with the passed in character
	//using a stringbuilder.
	//Method then returns the displayedword
	public String replaceChars(String s1, char ch){
		StringBuilder builder = new StringBuilder(this.secretWord);
		// replace all characters of the word with *
		for (int i=0; i<builder.length(); i++) {
			builder.setCharAt(i,  '*');
		}
		this.displayedWord = builder.toString();
		return this.displayedWord;
		
	}
	//ReplaceChars method that takes in three arguments two strings and a character 
	//The strings are the dispalyedword and the secretword and the char is the 
	//users guess.
	//method then loops through the secretword by index if it matches the character replaces\
	//the character in the displayed word by index using a stringbuilder
	public String replaceChars(String s1, String s2, char ch){
		
		displayedWord = s1;
		secretWord = s2;
		//Creation of two string builders passing in both the secret and dispalyed word
		StringBuilder builder = new StringBuilder(secretWord);
		StringBuilder builder2 = new StringBuilder(displayedWord);
		
		String tmp;
		int index = 0;
		//set char to a string 
		tmp = Character.toString(ch);
		//System.out.println("Entered Replace Char");
			
		//loop through secretword by index
		for(int x=0; x<builder.length(); x++) {
			//System.out.println("Loop thtoughsecret word");
			//System.out.println();
			//set the index varaiable equal to the index of the letter if found
			//if not found indexOf returns -1
			index = builder.indexOf(tmp, x);

			//if index is greater than or equal to 0 replace character by index
			if ( index >= 0 ) {
				builder2.setCharAt(index, ch);
			}
			
		}
		//set displayed word to the new stringbuilder2 object and return value
		displayedWord = builder2.toString();
		return displayedWord;
	}
	

	//Make guess method takes in a character and returns a boolean
	//Methdo then checks if the character is in the word 
	//If character exsits then call replace characters
	//else return fasle 
	public boolean makeGuess(char ch) {
		
		//check for char
		if (secretWord.contains(String.valueOf(ch))) {
			//call replacechars passing the displayed and secretword and the guess character
			this.displayedWord = this.replaceChars(this.displayedWord, this.secretWord, ch);
			//System.out.println("Make Guess");
			//System.out.println(this.displayedWord);
			return true;
		}
		else {
			return false;
		}
	}
	
	//getDisplayedword retruns the displayed word 
	public String getDisplayedWord() {
		return this.displayedWord;
	}
	
	//getsecretword returns the secret word
	public String getSecretWord() {
		return this.secretWord;
	}	
}

