import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class BookAnalysisTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("What book would you like to analyze?");
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		
		TextCollectorV1 books = new TextCollectorV1(input);
		ArrayList<String> book = books.getBook();
		ArrayList<String> stopList = books.getStopList();
		
		
		LetterFrequency test = new LetterFrequency(book);
		ArrayList<Characters> chars = test.getChars();
		
		System.out.println("The top ten characters are: ");
		for (int i = 0; i < 10; i++){
			Characters newChar = chars.get(i);
			System.out.println(newChar.getTheChar() + " " + newChar.getCount());
		}
		System.out.println("============");
		System.out.println();
		System.out.println();
		
		WordFrequency words = new WordFrequency(book);
		ArrayList<Word> wordArray = words.getAllWords();
				
		
		System.out.println("The most frequent words in " + input + "are: ");
		ArrayList<Word> mostFrequentWords = words.getMostFrequentWords();
		for (int i = 0; i < 10; i++){
			Word theWord = mostFrequentWords.get(i);
			System.out.println(theWord.getWord() + " " + theWord.getCount());
		}
		System.out.println("============");
		System.out.println();
		System.out.println();
		
		
		StopListFrequency stopListWords = new StopListFrequency(stopList, wordArray);
		ArrayList<Word> newMostFrequent = stopListWords.getMostFrequent();
		
		System.out.println("The most frequent words excluding stop list words are: ");
		for (int i = 0; i < 10; i++){
			Word next = newMostFrequent.get(i);
			System.out.println(next.getWord() + " " + next.getCount());
		}
		System.out.println("============");
		System.out.println();
		System.out.println();
		
		
		
		QuoteFinder find = new QuoteFinder(book);
		ArrayList<Quote> shorter = find.getShortest();
		ArrayList<Quote> longest = find.getLongest();
//		ArrayList<Quote> quotes = find.getQuotes();
//		for (int i = 0; i < quotes.size(); i ++){
//			System.out.println(quotes.get(i).getQuote());
//		}
		
				
		System.out.println("Shortest Quotes");
		for (Quote q : shorter){
			System.out.println(q.getQuote());
		}
		System.out.println("============");
		System.out.println();
		System.out.println();
		
		System.out.println("Longest Quotes");
		for (Quote p : longest){
			System.out.println(p.getQuote());
		}
		System.out.println("============");
		System.out.println();
		System.out.println();
		
		System.out.println("Wild card to find words ending in a specified prefix");
		System.out.println("Enter your prefix: ");
		String suffix = in.nextLine();
		SuffixFinder descriptive = new SuffixFinder(book, suffix);
		ArrayList<Word> cool = descriptive.getMostFrequent();
		for (int i = 0; i < cool.size(); i++){
			Word the = cool.get(i);
			System.out.println(the.getWord() + " " + the.getCount());
		}
		
		
		
	}		


}
