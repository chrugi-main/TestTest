/**********************************************************************
 *
 *
 *   Zwahlen Christian, 18-113-324, 96-710-249 patrick ryf
 *
 *****************************************************************
 */
package Serie4;

/*
 * Kleines Spiel wo die Münze die als erstes 3 Mal hintereinander Kopf geflippt hat gewinnt
 * 
 */

public class CoinRace {

	
	public static void main(String[] args) {
		
		Coin coin1 = new Coin(); 
		Coin coin2 = new Coin();
		
		int sumHeadsCoin1 = 0; // Summe der "Siege" von coin1, wird auf 0 gesetzt falls Zahl geflippt wird und sonst inkrementiert um 1
		int sumHeadsCoin2 = 0; 
		
		/*
		 * Schleife um das Spiel solange auszuführen bis eine der beiden Münzen 3 Mal hintereinander Kopf geflippt hat
		 */
		for(int rounds = 0; sumHeadsCoin1 < 3 && sumHeadsCoin2 <3; rounds++)
		{
			boolean isHeadsCoin1 = coin1.flip();
			boolean isHeadsCoin2 = coin2.flip();
			
		if(coin1.equals(coin2) == false ) // überprüft ob die Münzen auf die gleiche Seite gefallen sind
		{
			sumHeadsCoin1 = (isHeadsCoin1) ?  ++sumHeadsCoin1 : 0; // Addiert 1 zum "Zähler" falls auf Kopf gelandet, sonst auf 0 gesetzt
			
			sumHeadsCoin2 = (isHeadsCoin2) ?  ++sumHeadsCoin2 : 0;
		}
		else
		{
			sumHeadsCoin1 = (isHeadsCoin1) ?  ++sumHeadsCoin1 : 0;// Addiert 1, falls beide auf Kopf gelandet sind, sonst wird der Zähler zurückgesetzt
			
			sumHeadsCoin2 = (isHeadsCoin2) ?  ++sumHeadsCoin2 : 0;
		}
			
		System.out.println("Runde: " + rounds + " " + coin1 + "/" + coin2);
		}
		
		if(sumHeadsCoin1 == sumHeadsCoin2)
		{
			System.out.println("Unentschieden");
		}
		
		else if(sumHeadsCoin2 == 3)
		{
			System.out.println("Münze2 gewinnt");
		}
		else if(sumHeadsCoin1 == 3)
		{
			System.out.println("Münze1 Gewinnt");
		}
		
	}

}
