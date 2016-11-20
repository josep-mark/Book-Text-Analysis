import java.util.ArrayList;

/**
 * This class will find the word frequency of a given book
 * @author Joseph
 *
 */
public class WordFrequency {
	private ArrayList<String> bookText;
	private ArrayList<Word> words;
	private ArrayList<Word> mostFrequent;
	
	/**
	 * The constructor for the word frequency class
	 */
	
	public WordFrequency(ArrayList<String> book){
		bookText = book;
		words = new ArrayList<Word>();
		mostFrequent = new ArrayList<Word>();
		getWords();
		findTop();
	}
	
	/**
	 * The method to collect all the words in the book
	 */
	
	private void getWords(){
		for (String s : bookText){
			if (s.isEmpty()){
				continue;
			}
			String[] lineSplit = s.split(" ");
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i].replaceAll("[^a-zA-Z]", "");
				if (text.isEmpty()){
					continue;
				}
				boolean match = false;
				Word newWord = new Word(text);
				for (int j = 0; j < words.size(); j++){
					Word test = words.get(j);
					if (words.size() == 0){
						words.add(newWord);
					}
					else if (test.equals(text)){
						test.addOne();
						match = true;
					}
				}
				if (match == false){
					words.add(newWord);
				}
			}
		}
	}
	
	private void findTop(){
		for (int i = 0; i < 10; i++){
			Word largest = new Word("cwjbklwjebl");
			int highest = 0;
			int index = 0;
			for (int j = 0; j < words.size(); j++){
				Word value = words.get(j);
				int count = value.getCount();
				if (count > highest){
					largest = value;
					highest = count;
					index = j;
				}
			}
			mostFrequent.add(largest);
			words.remove(index);
		}
	}
	/**
	 * Getter method for all words
	 * @return words
	 */
	public ArrayList<Word> getAllWords(){
		return words;
	}
	
	public ArrayList<String> getText(){
		return bookText;
	}
	
		
	public ArrayList<Word> getMostFrequentWords(){
		return mostFrequent;
	}
	
}
