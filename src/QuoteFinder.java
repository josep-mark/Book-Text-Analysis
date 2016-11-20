import java.util.ArrayList;

/**
 * This class finds the
 * @author Joseph
 *
 */
public class QuoteFinder {

	private ArrayList<String> book;
	private ArrayList<String> currentQuote;
	private ArrayList<String> bookQuotes;
	
	public QuoteFinder(ArrayList<String> bookText){
		book = bookText;
		currentQuote = new ArrayList<String>();
		bookQuotes = new ArrayList<String>();
		find();
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
		bookQuotes.add(quote);
		System.out.println(quote);
		currentQuote.clear();
	}
	
	
	public ArrayList<String> getQuotes(){
		return bookQuotes;
	}
	
	public ArrayList<String> getWords(){
		return book;
	}
	
}
