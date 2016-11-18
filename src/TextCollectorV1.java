import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This class takes in a text and creates an ArrayList of each line of the text
 * @author Joseph
 *
 */
public class TextCollectorV1 {
	ArrayList<String> bookText;
	String file;
	
	/**
	 * The constructor takes in a file and calls the read file method
	 * @param file
	 */
	public TextCollectorV1(String newFile){
		bookText = new ArrayList<String>();
		file = newFile;
		readFile();
	}
	
	/**
	 * The readfile takes the file and parses it into an arrayList
	 */
	private void readFile(){
		
		try {
			File inputFile = new File(file); 
			Scanner in = new Scanner(inputFile);
				
			while (in.hasNextLine()) { 
				String line = in.nextLine();
				bookText.add(line);
			}
				
			in.close(); 			 
		
		}
		catch(FileNotFoundException f){
			System.out.println("Thats not a book!");
		}
		
	}
	
	/**
	 * The getter method for the book arraylist
	 * @return bookText
	 */
	
	public ArrayList<String> getBook(){
		return bookText;
	}

}
