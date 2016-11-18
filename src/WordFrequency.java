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
	
	/**
	 * The constructor for the word frequency class
	 */
	
	public WordFrequency(ArrayList<String> book){
		bookText = book;
		words = new ArrayList<String>();
		wordCount = new ArrayList<Integer>();
		getWords();
		countWords();
		order();
	}
	
	/**
	 * The method to collect all the words in the book
	 */
	
	private void getWords(){
		for (String s : bookText){
			String[] lineSplit = s.replaceAll("[^a-zA-Z] ", " ").toLowerCase().trim().split(" ");
			
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i];
				words.add(text);
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
	
	private void countWords(){
		for (int i = 0; i < words.size(); i++){
			String word = words.get(i);
			int count = 0;
			for (int j = 0; j < words.size(); j++){
				String test = words.get(j);
				if (test.equalsIgnoreCase(word)){
					count ++;
				}
			}
			wordCount.add(count);
		}
	}
	
	public ArrayList<Integer> getWordCount(){
		return wordCount;
	}
	
	private void order(){
		for (int i = 0; i < wordCount.size(); i++){
			for (int j = i + 1; j < wordCount.size() - 1; j++){
				int count = wordCount.get(i);
				int next = wordCount.get(j);
				if (next > count){
					String temp1 = words.get(i);
					String temp2 = words.get(j);
					wordCount.set(j, count);
					wordCount.set(i, next);
					words.set(j, temp1);
					words.set(i, temp2);
				}
			}
		}	
	}
	
}
