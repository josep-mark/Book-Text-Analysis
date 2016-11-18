import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will find the letter frequency in a given text
 * @author Joseph
 *
 */
public class LetterFrequency {
	private ArrayList<String> bookText;
	private HashMap<Integer, String> bookMap;
	private char[] alphabet;
	private int[] letterCountV1;
	private char[] topTenChar;
	private int[] topTenCount;
	private HashMap<String, Integer> letterCountV2;
	
	public LetterFrequency(HashMap<Integer, String> bookTextMap){
		String letters = "abcdefghijklmnopqrstuvwxyz";
		alphabet = letters.toCharArray();
		bookMap = bookTextMap;
	} 
	
	public LetterFrequency(ArrayList<String> book){
		bookText = book;
		String letters = "abcdefghijklmnopqrstuvwxyz";
		alphabet = letters.toCharArray();
		letterCountV1 = new int[26];
		topTenChar = new char[10];
		topTenCount = new int[10];
		removeSpaces();
		countLetters();
		getTopTenV1();
	}

	/**
	 * This method removes spaces in the string of the book text (ArrayList)
	 */
	
	private void removeSpaces(){
		for (String s: bookText){
			s.toLowerCase();
			s.trim();
			s.replace(" ", "");
		}
	}
	
	/**
	 * This method counts the occurence of letters in the book Array List
	 */
	
	private void countLetters(){
		for (String s : bookText){
			for (int i = 0; i < s.length(); i ++){
				char text = s.charAt(i);
				for (int j = 0; j < 26; j++){
					char test = alphabet[j];
					if (text == test){
						int value = letterCountV1[j];
							value ++;
							letterCountV1[j] = value; 						
					}
				}
			}
		}
	}
	
	/**
	 * This method finds the top ten characters in the text and re
	 */
	private void getTopTenV1(){
		for (int i = 0; i < 26; i++){
			for (int j = i + 1; j < 26; j++){
				int val1 = letterCountV1[i];
				int val2 = letterCountV1[j];
				if (val2 > val1){
					letterCountV1[i] = val2;
					letterCountV1[j] = val1;
					char val3 = alphabet[i];
					char val4 = alphabet[j];
					alphabet[i] = val4;
					alphabet[j] = val3;
				}
			}
		}
	}
	
	public char[] getTopTenChar(){
		return alphabet;
	}
	
	public int[] getTopTenCount(){
		return letterCountV1;
	}
	
	public char[] getAlphabet(){
		return alphabet;
	}
	
	public int[] getCount(){
		return letterCountV1;
	}
	
}