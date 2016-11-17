import java.io.FileNotFoundException;
import java.util.ArrayList;

public class BookAnalysisTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> alice = new ArrayList<String>();
		
		try{
		FileReader file = new FileReader("alice-in-wonderland.txt");
		alice = file.getLines();
		
		}
		catch(FileNotFoundException f){
			System.out.println("Thats not a book");
		}
		
		System.out.println(alice.get(1));
	}

}
