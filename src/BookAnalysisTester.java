import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

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
//		ArrayList<String> wordList = words.getAllWords();
//		System.out.println(wordList);
		
		ArrayList<String> themWords = words.getMostFrequentWords();
		ArrayList<Integer> count = words.getCounts();
		
//		for (int i = 0; i < wordList.size(); i++){
//			System.out.println(wordList.get(i));
//		}
		for (int i = 0; i < 10; i++){
			System.out.println(themWords.get(i) + " : " + count.get(i));
		}
//		System.out.println(themWords);
//		System.out.println(count);
//		System.out.println(themWords);
//		System.out.println(count);
//		
//		ArrayList<String> bookText = new ArrayList<String>();
//		String file = "alice-in-wonderland.txt";
//		
//		try {
//			File inputFile = new File(file); 
//			Scanner in = new Scanner(inputFile);
//				
//			while (in.hasNextLine()) { 
//				String line = in.nextLine();
//				String[] words = line.split(" ");
//				for (int i = 0; i < words.length; i ++){
//					String s = words[i].replaceAll("[^a-zA-Z]", "");
//					bookText.add(s);
//				}
//			}
//				
//			in.close(); 			 
//		
//		}
//		catch(FileNotFoundException f){
//			System.out.println("Thats not a book!");
//		}
		
//		for (int i = 0; i < bookText.size(); i++){
//				String s = bookText.get(i);
//				s = s.replaceAll("^[a-zA-Z]", "");
//				s = s.replace("!", "");
//				s = s.replace("?", "");
//				s = s.replace(".", "");
//				s = s.replace(":", "");
//				s = s.replace(";", "");
//				s = s.replace("(", "");
//				s = s.replace(")", "");
//				s = s.replace("*", "");
//				s = s.replace(" ", "");
//				s = s.replace("  ", "");
//				s = s.replace("\n", "");
//				s = s.toLowerCase();
//				if (s.startsWith("\'") | s.endsWith("'")){
//					s = s.replace("\'", "");
//				}
//				bookText.set(i, s);
//				if (s.isEmpty()){
//					i = i + 1;
//					bookText.remove(i - 1);
//				}
//				else if (s.startsWith(" ")){
//					i = i + 1;
//					bookText.remove(i - 1);
//				}
//		}
		
//		for (int i = 0; i < bookText.size(); i++){
//			System.out.println(bookText.get(i));
//		}
		
//		System.out.println('c' - 'a');
		
	}

}
