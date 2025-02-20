//Enkhbaatar Idersaikhan 3112121
package griffith;

public class Word {

	//attribute
	private char[] letters;
	
	//constructor that makes sure letters is never null
	public Word(char[]letters) {
		if(letters == null) {
			this.letters = new char[0];
		}else {
			this.letters = letters;
		}
	}
	//Returns true if the letters array contains the given char
	public boolean contains(char symbol) {
		for(char letter : letters) {
			if(letter == symbol) {
				return true;
			}
		}
		return false;
	}
	//Returns the number of letters
	public int length() {
		return letters.length;
	}
	//returns the letters array
	public char[] getLetters() {
		return letters;
	}
	
}
