/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MorseInputBuffer.java
Generates the class MorseInputBuffer extends from class InputBuffer
get the string MorseInputBuffer from parent class InputBuffer
*/

public class MorseInputBuffer extends InputBuffer {
	/**
	 * Param constructor 
	 * @param string
	 */
	MorseInputBuffer(String string) {
		super(string);
		getReader().useDelimiter("\n");
	}

	/**
	 * Generates the private string variable previousToken
	 */
	private String previousToken;
	
	/**
	 * Generates the private boolean variable endOfWord
	 */
	private boolean endOfWord;
	
	/**
	 * Generates the private boolean variable endOfSentence
	 */
	private boolean endOfSentence;
	
	/**
	 * Return the char
	 */
	public MsgChar getChar() {
		String token = getReader().next().trim();
		if (!"".equals(token) && endOfSentence) {
			previousToken = token;
			endOfSentence = false;
			endOfWord = false;
			return null;
		} else if (token.equals("") && "".equals(previousToken)) {
			endOfSentence = true;
			endOfWord = false;
		} else if ("".equals(previousToken) && !"".equals(token)) {
			endOfWord = true;
			endOfSentence = false;
		} else {
			endOfSentence = false;
			endOfWord = false;
		}
		if (previousToken == null) {
			previousToken = token;
			return null;
		}
		MsgChar res = new MorseChar(previousToken);
		previousToken = token;
		return res;
	}

	/**
	 * generates the boolean for isEndOfWord
	 * return @endOfWord
	 */
	public boolean isEndOfWord() {
		return endOfWord;
	}

	/**
	 * generates the boolean for isEndOfSentence
	 * return @endOfSentence
	 */
	public boolean isEndOfSentence() {
		return endOfSentence;
	}

}
