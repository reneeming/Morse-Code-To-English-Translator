/**
@author Ming Ni
@version 1.0

COP5007 Project #: 3
File Name: MorseCodePlayer.java
*/

import javax.sound.sampled.*;

/**
 * Generates different sounds corresponding to dots and dashes in Morse Code
 * @author beddy
 *
 */
public class MorseCodePlayer {

  public static float SAMPLE_RATE = 8000f;
  
  /**
   * Generates the tone for a dot
 * @throws LineUnavailableException
 */
public static void dot() 
     throws LineUnavailableException 
  {
     tone(1000, 75);
  }
  
  /**
   * Generates the tone for a dash
 * @throws LineUnavailableException
 */
public static void dash() 
     throws LineUnavailableException 
  {
     tone(1000, 225);
  }

  /**
   * Generates a tone given hz and the number of msecs to play
 * @param hz the number of samples per second
 * @param msecs the length of time to play the tone
 * @throws LineUnavailableException
 */
public static void tone(int hz, int msecs)
      throws LineUnavailableException 
  {
    byte[] buf = new byte[1];
    AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);      
    SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
    sdl.open(af);
    sdl.start();
    for (int i=0; i < msecs*8; i++) {
      double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
      buf[0] = (byte)(Math.sin(angle) * 127.0 * 1);
      sdl.write(buf,0,1);
    }
    sdl.drain();
    sdl.stop();
    sdl.close();
  }
  
  /**
   * Takes in the encoded Morse code character and plays each dot and dash
 * @param morseChar encoded String representation for Morse character
 */
public static void play(String morseChar)
  {
	  try
	  {
		  for (int i = 0; i < morseChar.length(); ++i)
		  {
			  if(Character.toString(morseChar.charAt(i)).equals("."))
				  dot();
			  else
				  dash();
		  }
	  }
	  catch(LineUnavailableException ex)
	  {
		  System.out.println("Error when attempting to play file.");
	  }
  }
}