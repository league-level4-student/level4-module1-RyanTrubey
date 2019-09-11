package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac zodiac) {
		switch(zodiac) {
		case ARIES:
			JOptionPane.showMessageDialog(null, "Aries");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, "Taurus");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Gemini");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Cancer");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Leo");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Virgo");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Scroprio");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "sagittarius");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "capricorn");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Aquarius");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Pisces");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Default");
			break;
		}
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		horoscope(Zodiac.LIBRA);
	}
}
