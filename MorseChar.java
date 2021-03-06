/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MorseChar.java
Generates the class MorseChar extends MsgChar
*/

import java.util.HashMap;
import java.util.Hashtable;

public class MorseChar extends MsgChar {
	
	/**
	 * define the HasMap translated from MorseCode to EnglishChar
	 */
	HashMap<String, String> conversionTable;
	
	/**
	 * Param constructor ana initilize the hashmap  
	 */
	MorseChar(String string) {
		super(string);
		conversionTable = new HashMap<String, String>();
		conversionTable.put(".-","a");
		conversionTable.put("-...", "b");
		conversionTable.put("-.-.", "c");
		conversionTable.put("-..", "d");
		conversionTable.put(".", "e");
		conversionTable.put("..-.", "f");
		conversionTable.put("--.", "g");
		conversionTable.put("....", "h");
		conversionTable.put("..", "i");
		conversionTable.put(".---", "j");
		conversionTable.put("-.-", "k");
		conversionTable.put(".-..", "l");
		conversionTable.put("--", "m");
		conversionTable.put("-.", "n");
		conversionTable.put("---", "o");
		conversionTable.put(".--.", "p");
		conversionTable.put("--.-", "q");
		conversionTable.put(".-.", "r");
		conversionTable.put("...", "s");
		conversionTable.put("-", "t");
		conversionTable.put("..-", "u");
		conversionTable.put("...-", "v");
		conversionTable.put(".--", "w");
		conversionTable.put("-..-", "x");
		conversionTable.put("-.--", "y");
		conversionTable.put("--..", "z");
		conversionTable.put(".-.-.-", ".");
		conversionTable.put("--..--", ",");
		conversionTable.put("-...-", "-");
		conversionTable.put(".----.", "'");
		conversionTable.put("..--..", "?");
	}

	/**
	 * Return the converted string
	 */
	public String convert(){
		MorseCodePlayer.play(getChar());
		MorseCodeFlasher.play(getChar());
		return conversionTable.get(getChar());
	}
}
