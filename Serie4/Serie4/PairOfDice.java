/**********************************************************************
 *
 *
 *   Zwahlen Christian, 18-113-324, 96-710-249 patrick ryf
 *
 *****************************************************************
 */
package Serie4;

public class PairOfDice {
	
	private Dice dice1;
	private Dice dice2;
	
	/*
	 * Konstruktor nimmt 2 Dice Objekte entgegen und weist diese zu
	 */
	
	public PairOfDice()
	{
		this.dice1 = new Dice();
		this.dice2 = new Dice();
	}
	
	/*
	 * Getter/Setter
	 */
	
	/*
	 * Hier kann man die Punkte des Würfels setzen
	 * Als Parameter wird die Punktzahl angegeben und auch welcher Würfel gemeint ist
	 */
	
	public void setPointsDice1(int points)
	{
		dice1.setPoints(points);
	}
	
	public void setPointsDice2(int points)
	{
		dice2.setPoints(points);
	}
	
	
	
	public int getPointsDice1()
	{
		return dice1.getPoints();
	}
	
	public int getPointsDice2()
	{
		return dice2.getPoints();
	}
	
	public void toDiceBoth()
	{
		dice1.roll();
		dice2.roll();
	}
	
	public int getSum()
	{
		return dice1.getPoints() + dice2.getPoints();
	}
	
	public String toString()
	{
		return "Würfel1:" + dice1.getPoints() + " Würfel2:" + dice2.getPoints();
	}
		
}
