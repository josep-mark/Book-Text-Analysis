import java.util.ArrayList;

/**
 * This class will find the word frequency of a given book
 * @author Joseph
 *
 */
public class WordFrequency {
	private ArrayList<String> bookText;
	private ArrayList<String> words;
	private ArrayList<Integer> wordCount;
	private ArrayList<String> mostFrequent;
	private ArrayList<Integer> mostFrequentCount;
	
	/**
	 * The constructor for the word frequency class
	 */
	
	public WordFrequency(ArrayList<String> book){
		bookText = book;
		words = new ArrayList<String>();
		wordCount = new ArrayList<Integer>();
		mostFrequent = new ArrayList<String>();
		mostFrequentCount = new ArrayList<Integer>();
		getWords();
		countWords();
		order();
	}
	
	/**
	 * The method to collect all the words in the book
	 */
	
	private void getWords(){
		for (String s : bookText){
			String[] lineSplit = s.split(" ");
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i].replaceAll("[^a-zA-Z]", "");
				if (text.equals("")){
					continue;
				}
				else {
					words.add(text);
				}
			}	
		}
	}
	/**
	 * Getter method for all words
	 * @return words
	 */
	public ArrayList<String> getAllWords(){
		return words;
	}
	
	/**
	 * This method counts the words in the word list
	 */
	
	private void countWords(){
		for (int i = 0; i < words.size(); i++){
			String word = words.get(i);
			int count = 0;
			if (isFirst(i)){
				for (int j = 0; j < words.size(); j++){
					String test = words.get(j);
					if (test.equalsIgnoreCase(word)){
						count ++;
					}
				}
			}
			wordCount.add(count);
		}
	}
	
	private boolean isFirst(int i){
		boolean firstOccurence = true;
		for (int j = 0; j < i; j++){
			if (words.get(j).equalsIgnoreCase(words.get(i))){
				firstOccurence = false;
			}
		}
		return firstOccurence;
		
	}
	
	/**
	 * Accessor method for the word list
	 * @return word count Array List of Integers
	 */
	
	public ArrayList<Integer> getWordCount(){
		return wordCount;
	}
	
	/**
	 * This method orders the wordCount and words lists by size
	 * In descending order
	 */
	
	private void order(){
		int q = 0;
		while (q < 10){
			String largestWord = "";
			int largestNum = 0;
			int index = 1000000;
			for (int i = 0; i < wordCount.size(); i++){
				boolean greatest = true;
				String word = words.get(i);
				int count = wordCount.get(i);
				for (int j = 0; j < wordCount.size(); j++){
					int next = wordCount.get(j);
					if (next > count){
						greatest = false;
					}
				}
				if (greatest == true){
					largestWord = word;
					largestNum = count;
					words.remove(i);
					wordCount.remove(i);
				}
			}
			mostFrequent.add(largestWord);
			mostFrequentCount.add(largestNum);
//			words.remove(index);
//			wordCount.remove(index);
			q++;
		}
	}
	
	public ArrayList<String> getMostFrequentWords(){
		return mostFrequent;
	}
	
	public ArrayList<Integer> getCounts(){
		return mostFrequentCount;
	}
}
