import java.util.ArrayList;

/**
 * This class finds the
 * @author Joseph
 *
 */
public class QuoteFinder {

	private ArrayList<String> book;
	private ArrayList<String> currentQuote;
	private ArrayList<Quote> bookQuotes;
	private ArrayList<Quote> longest;
	private ArrayList<Quote> shortest;
	
	public QuoteFinder(ArrayList<String> bookText){
		book = bookText;
		currentQuote = new ArrayList<String>();
		bookQuotes = new ArrayList<Quote>();
		longest = new ArrayList<Quote>();
		shortest = new ArrayList<Quote>();
		find();
		findLongest();
		findShortest();
	}
	
	public void find(){
		for (String s : book){
			if (s.isEmpty()){
				continue;
			}
			boolean isQuote = false;
			String[] lineSplit = s.split(" ");
			for (int i = 0; i < lineSplit.length; i++){
				String text = lineSplit[i];
				if (text.isEmpty()){
					continue;
				}
				else if (text.startsWith("'") && text.endsWith("'")){
					isQuote = false;
					currentQuote.add(text);
					concat();
				}
				else if (text.startsWith("'")){
					isQuote = true;
					currentQuote.add(text);
				}
				else if (text.endsWith("'")){
					currentQuote.add(text);
					isQuote = false;
					concat();
					
				}
				else if (isQuote) {
					currentQuote.add(text);
				}
				else {
					continue;
				}
				
			}
		}
	}
	
	private void concat(){
		String quote = "";
		for (int i = 0; i < currentQuote.size(); i++){
			String s = currentQuote.get(i);
			quote = quote + " " + s;
		}
		Quote newQuote = new Quote(quote);
		bookQuotes.add(newQuote);
		currentQuote.clear();
	}
	
	private void findLongest(){
		for (int i = 0; i < 10; i++){
			int largest = 0;
			int index = 0;
			Quote theLongest = new Quote("");
			for (int j = 0; j < bookQuotes.size(); j++){
				int count = bookQuotes.get(j).getSize();
				if (count > largest){
					largest = count;
					index = j;
					theLongest = bookQuotes.get(j);
				}
			}
			longest.add(theLongest);
			if (bookQuotes.size() > 0){
				bookQuotes.remove(index);
			}
		}
	}
	
	private void findShortest(){
		for (int i = 0; i < 10; i++){
			int smallest = 100;
			int index = 0;
			Quote theSmallest = new Quote("");
			for (int j = 0; j<bookQuotes.size(); j++){
				int count = bookQuotes.get(j).getSize();
				if (count < smallest){
					smallest = count;
					index = j;
					theSmallest = bookQuotes.get(j);
				}
			}
			shortest.add(theSmallest);
			if (bookQuotes.size()>0){
				bookQuotes.remove(index);
			}
		}
	}
	
	
	public ArrayList<Quote> getLongest() {
		return longest;
	}

	public ArrayList<Quote> getShortest() {
		return shortest;
	}

	public ArrayList<Quote> getQuotes(){
		return bookQuotes;
	}
	
	public ArrayList<String> getWords(){
		return book;
	}
	
}
