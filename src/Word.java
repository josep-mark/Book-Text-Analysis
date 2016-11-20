/**
 * This class holds the count and
 * @author Joseph
 *
 */
public class Word {
	private String theWord;
	private int count;
	
	public Word(String s){
		theWord = s;
		count = 1;
	}
	
	/**
	 * Method checks if a string equals the word
	 * @param s string to check
	 * @return boolean match
	 */
	
	public boolean equals(String s){
		boolean match = false;
		if (s.equalsIgnoreCase(theWord)){
			match = true;
		}
		return match;
	}
	
	/**
	 * Accessor for the words
	 * @return the word
	 */
	
	public String getWord(){
		return theWord;
	}
	
	/**
	 * Accessor for the count
	 * @return count
	 */
	
	public int getCount(){
		return count;
	}
	
	public void addOne(){
		count = count + 1;
	}

}
