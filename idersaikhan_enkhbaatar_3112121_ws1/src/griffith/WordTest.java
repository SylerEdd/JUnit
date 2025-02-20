//Enkhbaatar Idersaikhan 3112121
package griffith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordTest {

	@Test
	public void testContains() {
		
		//word contains the char
		char[] letters1 = {'h','e','l','l','o'};
		Word word1 = new Word(letters1);
		assertTrue(word1.contains('e'));
		
		//word doesn't contains the char
		char[] letters2 = {'w','o','r','l','d'};
		Word word2 = new Word(letters2);
		assertFalse(word2.contains('e'));
		
		//char repeated multiple times
		char[] letters3 = {'m','o','o','n'};
		Word word3 = new Word(letters3);
		assertTrue(word3.contains('o'));
	}
	
	@Test
	public void testLength() {
		
		//testing normal word
		char[]letters1 = {'m','o','n','g','o','l','i','a'};
		Word word1 = new Word(letters1);
		assertEquals(8,word1.length());
		
		//testing 1 letter
		char[]letters2 = {'f'};
		Word word2 = new Word(letters2);
		assertEquals(1,word2.length());
		
		//testing empty array
		char[]letters3 = {};
		Word word3 = new Word(letters3);
		assertEquals(0,word3.length());
	}
	
	@Test
	public void testNotNull() {
		
		//normal letters array
		char[] letters1 = {'t','e','s','t'};
		Word word1 = new Word(letters1);
		assertNotNull(word1.getLetters());
		
		//passing a null should still result in a non-null letters array
		Word word2 = new Word(null);
		assertNotNull(word2.getLetters());
		
		//empty array
		char[] letters3 = {};
		Word word3 = new Word(letters3);
		assertNotNull(word3.getLetters());	
	}
}
