/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MorseOutputBuffer.java
Generates the class MorseOutputBuffer extends from parent class OutputBuffer
*/

public class MorseOutputBuffer extends OutputBuffer {
	/**
	 * Param constructor 
	 * @param string, file path
	 */
	MorseOutputBuffer(String string) {
		super(string.substring(0, string.indexOf(".eng")) + ".mor");

	}

	/**
	 * Generates the tone for putChar
	 */
	public void putChar(String string) {
		getWriter().append(string + "\n");
	}

	/**
	 * Set the new line for end word
	 */
	@Override
	public void markEndOfWord() {
		getWriter().write("\n");		
	}

	/**
	 * Set two new line for end sentence
	 */
	@Override
	public void markEndOfSentence() {
		getWriter().write("\n\n");		
	}

}
