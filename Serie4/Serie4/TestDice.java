/**********************************************************************
 *
 *
 *   Zwahlen Christian, 18-113-324, 96-710-249 patrick ryf
 *
 *****************************************************************
 */
package Serie4;

/**
 * Testklasse für mich um zu schauen ob die Klasse pairOfDice so funktioniert wie sie sollte
 * @param args
 */

public class TestDice {

	
	public static void main(String[] args) {
		
		PairOfDice pair = new PairOfDice();
		
		System.out.println(pair.getPointsDice1());
		System.out.println(pair.getPointsDice2());
		
		pair.toDiceBoth();
		
		System.out.println(pair.getPointsDice1());
		System.out.println(pair.getPointsDice2());
		
		System.out.println(pair.getSum());
		
		pair.setPointsDice1(5);
		pair.setPointsDice2(6);
		
		System.out.println(pair.getPointsDice1());
		System.out.println(pair.getPointsDice2());
		
		System.out.println(pair);
		
		
		
		

	}

}
