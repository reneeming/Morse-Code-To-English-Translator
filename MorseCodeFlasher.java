/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MorseCodeFlasher.java
Generates the class MorseCodeFlasher
*/

import javax.sound.sampled.LineUnavailableException;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class MorseCodeFlasher {
	/**
	 * Takes in the encoded Morse code character and plays each dot and dash
	 * 
	 * @param morseChar
	 *  encoded String representation for Morse character
	 */
	public static void play(String morseChar) {
		JDialog dialog = new JDialog();
		dialog.setUndecorated(true);
		JLabel label = new JLabel(new ImageIcon("img.jpg"));
		dialog.add(label);
		dialog.pack();	
		for (int i = 0; i < morseChar.length(); ++i) {
			if (Character.toString(morseChar.charAt(i)).equals(".")) {
				dot(dialog);
			} else {
				dash(dialog);
			}
			sleep(200);
		}
		dialog.dispose();
	}

	/**
	 * method for sleep
	 * @param mscs
	 * catch InterruptedException e
	 */
	private static void sleep(long mscs) {
		try {
			Thread.sleep(mscs);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * method for dash for a dash
	 * @param dialog
	 */
	private static void dash(JDialog dialog) {
		dialog.setVisible(true);
		sleep(700);
		dialog.setVisible(false);
	}
	
	/**
	 * method for dot for a dash
	 * @param dialog
	 */
	private static void dot(JDialog dialog) {
		dialog.setVisible(true);
		sleep(400);
		dialog.setVisible(false);
	}
}
