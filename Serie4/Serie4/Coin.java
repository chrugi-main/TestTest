/**********************************************************************
 *
 *
 *   Zwahlen Christian, 18-113-324, 96-710-249 patrick ryf
 *
 *****************************************************************
 */
package Serie4;
import java.util.Random;
import java.util.random.*;

/*
 * Representiert eine Münze die geflippt werden kann
 */

public class Coin {
	
	// Gibt an ob die Münze auf Kopf oder Zahl instanziert wurde
	
	private boolean isHead;
	
	
	/*
	 * Konstruktor ruft Methode auf um eine Seite der Münze zufällig zu generieren und instanziert diesen Wert 
	 * als boolean
	 */
	
	public Coin()
	{
		this.flip();
		
	}
	
	/*
	 * Gibt zurück ob die Münze auf Kopf/Zahl gelandet ist
	 * 
	 * true=Kopf,false=Zahl
	 */
	
	public boolean getIsHead()
	{
		return this.isHead;
	}
	
	/*
	 * Wirft die Münze und gibt zurück ob die Münze auf Kopf/Zahl gelandet ist und weist dies der Instanzvariable zu
	 */
	
	public boolean flip()
	{
		Random randomiser = new Random();	
		
		int coinSide = randomiser.nextInt(2);
		
		if(coinSide == 1)
		{
			
			return this.isHead = true;
		}
		
		else
		{
			
			return this.isHead = false;
		}
	}
	
	/*
	 * Überprüft ob die Seiten der beiden Münzen identisch sind und gibt dies als boolean zurück
	 */
	
	public boolean equals(Coin otherCoin)
	{
		return (this.isHead == otherCoin.getIsHead()) ? true : false;
	}
	
	public String toString()
	{
		return (this.isHead) ? "Kopf" : "Zahl"; 
	}
	

}
