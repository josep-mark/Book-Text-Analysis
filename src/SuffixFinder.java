import java.util.ArrayList;

/**
 * This class finds the words with a specified suffix
 * It also finds the most used words with the suffix
 * @author Joseph
 *
 */
public class SuffixFinder {

	private ArrayList<String> book;
	private ArrayList<Word> words;
	private ArrayList<Word> mostFrequent;
	private String suffix;
	
	public SuffixFinder(ArrayList<String> bookText, String theSuffix){
		book = bookText;
		words = new ArrayList<Word>();
		mostFrequent = new ArrayList<Word>();
		suffix = theSuffix;
		findWords();
		findFrequent();
	}
	
	public void findWords(){
		for (String s : book){
			if (s.isEmpty()){
				continue;
			}
			String[] lineSplit = s.split(" ");
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i].replaceAll("[^a-zA-Z]", "");
				if (text.endsWith(suffix)){
					Word newWord = new Word(text);
//					if (words.size() == 0){
//						words.add(newWord);
//					}
					boolean match = false;
					for (int j = 0; j < words.size(); j++){
						Word w = words.get(j);
						if (w.equals(text)){
							match = true;
							w.addOne();
						}
					}
					if (match == false){
						words.add(newWord);
					}
					
				}
				
			}
		}
	}
	
	public ArrayList<Word> getWords(){
		return words;
	}
	
	private void findFrequent(){
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
	
	public ArrayList<Word> getMostFrequent(){
		return mostFrequent;
	}
}
