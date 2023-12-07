
/**
 * @Braden Tink
 *
 */
/**
 * public class TextAnalyzer
 * two instance varialbes 
 * private int numOfSentences
 * private int numOfWords
 *
 */
public class TextAnalyzer {
	//Constructor get passed in a string object 
	//Constuctor does the work to find all the sentences and words
	private int numOfSentences;
	private int numOfWords;
	
	/**
	 * TextAnalyzer constuctor one arguments String sentence
	 * @param sentence
	 * takes the string argument and assigns it to tempSentence
	 * Then performs string operations to clean the sentence before 
	 * using a plit to find number of words and sentences
	 */
	TextAnalyzer(String sentence){
		sentence = sentence.trim();
		sentence = sentence.replace("\n"," ");
		sentence = sentence.replace("  ", " ");
		
		
		numOfWords = sentence.split("\\s").length;
		numOfSentences = sentence.split("[.!?]").length;
				
	}
	
	/**
	 * public toString method no argument
	 * reutrns the numOfWords and numOfSentences
	 */
	public String toString(){
		return "Number of words: " + numOfWords + " Number of Sentences: " + numOfSentences;
	}

}
