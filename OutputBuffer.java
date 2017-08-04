/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: OutputBuffer.java
Parent class for out put buffer
*/

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public abstract class OutputBuffer {
	/**
	 * The writer
	 */
	private PrintWriter writer;
	
	/**
	 * Param constructor
	 * @param string
	 */
	OutputBuffer(String string){
		File file = new File(string);
		try {
			file.createNewFile();
			writer = new PrintWriter(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Return the writer
	 * @return writer
	 */
	public PrintWriter getWriter() {
		return writer;
	}
	
	/**
	 * Close the writer
	 */
	public void close(){
		writer.close();
	}
	
	/**
	 * Write the translated char
	 * @param string
	 */
	public abstract void putChar(String string);
	
	/**
	 * Write the end of word
	 */
	public abstract void markEndOfWord();
	
	/**
	 * Write the end of sentence
	 */
	public abstract void markEndOfSentence();
	
}
