import java.util.ArrayList;

/**
 * This class finds the most frequent words in a book, excluding stop list words
 * @author Joseph
 *
 */
public class StopListFrequency {
	
	private ArrayList<String> stopList;
	private ArrayList<Word> words;
	private ArrayList<Word> mostFrequent; 
	
	public StopListFrequency(ArrayList<String> s, ArrayList<Word> w){
		stopList = s;
		words = w;
		mostFrequent = new ArrayList<Word>();
		findTop();
	}
	
	public void findTop(){
		for (int i = 0; i < 10; i ++){
			int highest = 0;
			Word largest = new Word("kwbckjweb");
			int index = 0;
			for (int j = 0; j < words.size(); j ++){
				Word test = words.get(j);
				int count = test.getCount();
				boolean goOn = true;
				for(int p = 0; p < stopList.size(); p++){
					if (test.getWord().equalsIgnoreCase(stopList.get(p))){
						goOn = false;
					}
				}
				if (goOn == true && count > highest){
						highest = count;
						index = j;
						largest = test;
				}
				
			}
			mostFrequent.add(largest);
			words.remove(index);
		}
	}
	
	public ArrayList<Word> getMostFrequent(){
		return mostFrequent;
	}
	
	private void removeStopList(){
		for (String s : stopList){
			int index = 100000;
			for (int i = 0; i < words.size(); i++){
				Word word = words.get(i);
				if (s.equalsIgnoreCase(word.getWord())){
					index = i;
				}
			}
			words.remove(index);
		}
	}

}
