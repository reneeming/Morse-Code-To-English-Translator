/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: Translator.java
Translator
*/


public class Translator {
	/**
	 * The boolean decide if translating to morse code
	 */
	private boolean toMorse;
	
	/**
	 * The input buffer.
	 */
	private InputBuffer inputBuffer;
	
	/**
	 * The output buffer.
	 */
	private OutputBuffer outputBuffer;

	/**
	 * Param constructor
	 * @param string
	 */
	Translator(String string) {
		if (string.endsWith(".mor")) {
			toMorse = false;
			inputBuffer = new MorseInputBuffer(string);
			outputBuffer = new EnglishOutputBuffer(string);
		} else if (string.endsWith(".eng")) {
			toMorse = true;
			inputBuffer = new EnglishInputBuffer(string);
			outputBuffer = new MorseOutputBuffer(string);
		} else {
			System.out.println("File type not supported...");
		}
	}

	/**
	 * Do the trasnlation job
	 */
	public void translate() {
		while (!inputBuffer.endOfBuffer()) {
			MsgChar get = inputBuffer.getChar();
			if (get == null) continue;
			if (inputBuffer.isEndOfSentence()) {
				outputBuffer.markEndOfSentence();
			} else if (inputBuffer.isEndOfWord()) {
				outputBuffer.markEndOfWord();
			} else {
				outputBuffer.putChar(get.convert());
			}
		}
		inputBuffer.getReader().close();
		outputBuffer.close();
	}

}
