/**
 * This class holds the quote and the size
 * For the size I use characters
 * @author Joseph
 *
 */
public class Quote {
	
	private String theQuote;
	private int size;
	
	public Quote(String s){
		theQuote = s;
		findSize();
	}
	
	
	private void findSize(){
		char[] arr = theQuote.toCharArray();
		size = arr.length;
	}
	
	public int getSize(){
		return size;
	}
	
	public String getQuote(){
		return theQuote;
	}

}
