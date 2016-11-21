
public class Characters {

	private char indexChar;
	private int count;
	private int index;
	
	public Characters(int theIndex, int theCount){
		index = theIndex;
		count = theCount;
		getChar();
	}
	
	private void getChar(){
		switch(index){
		case 0: indexChar = 'a';
			break;
		case 1: indexChar = 'b';
			break;
		case 2: indexChar = 'c';
			break;
		case 3: indexChar = 'd';
			break;
		case 4: indexChar = 'e';
			break;
		case 5: indexChar = 'f';
			break;
		case 6: indexChar = 'g';
			break;
		case 7: indexChar = 'h';
			break;
		case 8: indexChar = 'i';
			break;
		case 9: indexChar = 'j';
			break;
		case 10: indexChar = 'k';
			break;
		case 11: indexChar = 'l';
			break;
		case 12: indexChar = 'm';
			break;
		case 13: indexChar = 'n';
			break;
		case 14: indexChar = 'o';
			break;
		case 15: indexChar = 'p';
			break;
		case 16: indexChar = 'q';
			break;
		case 17: indexChar = 'r';
			break;
		case 18: indexChar = 's';
			break;
		case 19: indexChar = 't';
			break;
		case 20: indexChar = 'u';
			break;
		case 21: indexChar = 'v';
			break;
		case 22: indexChar = 'w';
			break;
		case 23: indexChar = 'x';
			break;
		case 24: indexChar = 'y';
			break;
		case 25: indexChar = 'z';
			break;
		}
		
	}

	public char getTheChar() {
		return indexChar;
	}

	

	public int getCount() {
		return count;
	}

	
	
	
	
}
