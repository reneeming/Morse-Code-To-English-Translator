/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: EnglishInputBuffer.java
Generates the class EnglishInputBuffer extends InputBuffer
*/

public class EnglishInputBuffer extends InputBuffer {
	private String currentToken;
	private int currentPosition;
	private boolean endOfWord;
	private boolean endOfSentence;

	/**
	 * Parameterized constructor
	 * @param string
	 */
	EnglishInputBuffer(String string) {
		super(string);
		getReader().useDelimiter("\n");
	}

	/**
	 * Return the char
	 */
	@Override
	public MsgChar getChar() {
		if (currentToken == null) {
			if (getReader().hasNext()) {
				currentToken = getReader().next().trim();
			}
			currentPosition = 0;
			return null;
		} else if (currentPosition == currentToken.length()) {
			if (getReader().hasNext()) {
				currentToken = getReader().next().trim();
			} else {
				currentToken = null;
			}
			currentPosition = 0;
			endOfWord = false;
			endOfSentence = true;
			return new EnglishChar("");
		}
		char c = currentToken.charAt(currentPosition++);

		if (c == ' ') {
			endOfWord = true;
			endOfSentence = false;
		} else {
			endOfWord = false;
			endOfSentence = false;		
		}
		return new EnglishChar(String.valueOf(c));
	}
	
	/**
	 * return if end of buffer
	 */
	public boolean endOfBuffer() {
		return !getReader().hasNext() && currentToken == null;
	}
	
	/**
	 * return if end of word
	 */
	public boolean isEndOfWord() {
		return endOfWord;
	}

	/**
	 * return if end of sentence
	 */
	public boolean isEndOfSentence() {
		return endOfSentence;
	}
}
