/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: EnglishChar.java
*/

import java.util.HashMap;
import java.util.Hashtable;

/**
 * generates the class EnglishChar extends MsgChar
 */
public class EnglishChar extends MsgChar {
	/**
	 * Define the HashMap translated from EnglishChar to MorseCode 
	 */
	HashMap<String, String> conversionTable;

	EnglishChar(String string) {
		super(string);
		conversionTable = new HashMap<String, String>();
		conversionTable.put("a",".-");
		conversionTable.put("b", "-...");
		conversionTable.put("c", "-.-.");
		conversionTable.put("d", "-..");
		conversionTable.put("e", ".");
		conversionTable.put("f", "..-.");
		conversionTable.put("g", "--.");
		conversionTable.put("h", "....");
		conversionTable.put("i", "..");
		conversionTable.put("j", ".---");
		conversionTable.put("k", "-.-");
		conversionTable.put("l", ".-..");
		conversionTable.put("m", "--");
		conversionTable.put("n", "-.");
		conversionTable.put("o", "---");
		conversionTable.put("p", ".--.");
		conversionTable.put("q", "--.-");
		conversionTable.put("r", ".-.");
		conversionTable.put("s", "...");
		conversionTable.put("t", "-");
		conversionTable.put("u", "..-");
		conversionTable.put("v", "...-");
		conversionTable.put("w", ".--");
		conversionTable.put("x", "-..-");
		conversionTable.put("y", "-.--");
		conversionTable.put("z", "--..");
		conversionTable.put(".", ".-.-.-");
		conversionTable.put(",", "--..--");
		conversionTable.put("-", "-...-");
		conversionTable.put("'", ".----.");
		conversionTable.put("?", "..--..");
	}

	/**
	 * Return the converted string
	 */
	@Override
	public String convert(){
		String morseCode = conversionTable.get(getChar());
		MorseCodePlayer.play(morseCode);
		MorseCodeFlasher.play(morseCode);
		return morseCode;
	}
}
