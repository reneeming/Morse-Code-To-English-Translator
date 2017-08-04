/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: InputBuffer.java
Generates the abstract class InputBuffer
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public abstract class InputBuffer {
	private Scanner reader;

	InputBuffer(String string) {
		File file = new File(string);
		try {
			reader = new Scanner(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * return if end of buffer
	 * @return reaser.hasNext
	 */
	public boolean endOfBuffer() {
		return !reader.hasNext();
	}

	/**
	 * return the reader
	 * @return reader
	 */
	public Scanner getReader() {
		return reader;
	}

	public abstract MsgChar getChar();

	public abstract boolean isEndOfWord();

	public abstract boolean isEndOfSentence();
}
