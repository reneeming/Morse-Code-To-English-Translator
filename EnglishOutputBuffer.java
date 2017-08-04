/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: EnglishOutputBuffer.java
Generates the class EnglishOutputBuffer extends OutputBuffer
*/

public class EnglishOutputBuffer extends OutputBuffer {
	EnglishOutputBuffer(String string) {
		super(string.substring(0, string.indexOf(".mor")) + ".eng");
	}

	/**
	 * Set the char from input string
	 */
	public void putChar(String string) {
		getWriter().append(string);
	}

	/**
	 * Set the empty space of end word
	 */
	public void markEndOfWord() {
		getWriter().write(" ");	
	}

	/**
	 * Set the new line for end of sentence
	 */
	public void markEndOfSentence() {
		getWriter().write("\n");	
	}
}
