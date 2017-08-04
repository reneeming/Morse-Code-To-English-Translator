
public class Main {

	/**
	 * For fast check the results, please disable the sound player
	 * and visual display.
	 * 
	 * To disable them, please comment the code in MorseChar.java and EnglishChar
	 *  #63 and #64 lines code
	 */
	public static void main(String[] args)
	{
		Translator translator = new Translator("test.mor");
		translator.translate();
	}
}
