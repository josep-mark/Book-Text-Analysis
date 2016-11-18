import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookAnalysisTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TextCollectorV1 books = new TextCollectorV1("alice-in-wonderland.txt");
		ArrayList<String> book = books.getBook();
		
//		LetterFrequency test = new LetterFrequency(book);
//		char[] chars = test.getAlphabet();
//		int[] counts = test.getCount();
//		
//		
//		System.out.println("The top ten characters are: ");
//		for (int i = 0; i < 10; i++){
//			System.out.println(chars[i] + " " + counts[i]);
//		}
		
		WordFrequency words = new WordFrequency(book);
		ArrayList<String> themWords = words.getAllWords();
		ArrayList<Integer> count = words.getWordCount();
		for (int i = 0; i < 10; i++){
			System.out.println(themWords.get(i) + " : " + count.get(i));
		}
		
	}

}
