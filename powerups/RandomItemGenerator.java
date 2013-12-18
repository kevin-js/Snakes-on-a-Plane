package powerups;

import java.util.Random;
/**
 * class that randomly generates item during game
 * @author kevinguh
 *
 */
public class RandomItemGenerator {
	private static Random rand = new Random();
	
	/**
	 * method to randomly generate x-coordinate of an item
	 * @return xCoord x-coordinate of item
	 */
	public static int generateXCoordinate(){
		int xCoord = rand.nextInt();
		return xCoord;
	}
	
	/**
	 * method to randomly generate y-coordinate of an item
	 * @return yCoord y-coordinate of item
	 */
	public static int generateYCoordinate(){
		int yCoord = rand.nextInt();
		return yCoord;
	}
	
	
}
