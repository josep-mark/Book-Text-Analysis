import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class will find the letter frequency in a given text
 * @author Joseph
 *
 */
public class LetterFrequency {
	private ArrayList<String> bookText;
	private ArrayList<String> words;
	private int[] letterCountV1;
	private ArrayList<Characters> characters;
	
	
	public LetterFrequency(ArrayList<String> book){
		bookText = book;
		letterCountV1 = new int[26];
		words = new ArrayList<String>();
		characters = new ArrayList<Characters>();
		removeSpaces();
		countLetters();
		getTopTenV1();
	}

	/**
	 * This method removes spaces in the string of the book text (ArrayList)
	 */
	
	private void removeSpaces(){
		for (String s: bookText){
			String[] lineSplit = s.split(" ");
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i].replaceAll("[^a-zA-Z]", "").toLowerCase();
				if (text.isEmpty()){
					continue;
				}
				else{
					words.add(text);
				}
			}
		}
	}
	
	/**
	 * This method counts the occurence of letters in the book Array List
	 */
	
	private void countLetters(){
		for (String s : words){
			for (int i = 0; i < s.length(); i ++){
				char text = s.charAt(i);
				int check = text - 'a';
				int temp = letterCountV1[check] + 1;
				letterCountV1[check] = temp;
			}
		}
	}
	
	/**
	 * This method finds the top ten characters in the text and re
	 */
	private void getTopTenV1(){
		for (int i = 0; i < 10; i++){
			int largest = 0;
			int index = 0;
			for (int j = 0; j < 26; j++){
				if (letterCountV1[j] > largest){
					largest = letterCountV1[j];
					index = j;
				}
			}
			Characters newChar = new Characters(index, largest);
			characters.add(newChar);
			letterCountV1[index] = 0;
		}
	}	

	
	
	public ArrayList<Characters> getChars(){
		return characters;
	}
	
}