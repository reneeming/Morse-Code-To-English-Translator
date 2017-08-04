/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MsgChar.java
Parent class for char
*/

public abstract class MsgChar {
	/**
	 * The char value.
	 */
	private String charValue;

	/**
	 * Param constructor
	 * @param string
	 */
	MsgChar(String string) {
		charValue = string;
	}

	/**
	 * return the char value
	 * @return
	 */
	public String getChar() {
		return charValue;
	}

	/**
	 * Translate the char
	 * @return
	 */
	public abstract String convert();

}
