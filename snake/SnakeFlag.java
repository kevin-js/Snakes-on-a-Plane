/**
 * class whose instances log a snake's coordinates and velocity when its movement changes
 * @author kevinguh
 *
 */
public class SnakeFlag {
	private int xCoord;
	private int yCoord;
	private int xVel;
	private int yVel;

	/**
	 * constructor method for a SnakeFlag
	 * @param snake the snake being tracked
	 */
	private SnakeFlag(Snake snake){
		xCoord = snake.getXPosition();
		yCoord = snake.getYPosition();
		xVel = snake.getXVelocity();
		yVel = snake.getYVelocity();
	}
	
	/**
	 * factory method for generating SnakeFlag objects
	 * @return sFlag a SnakeFlag
	 */
	public static SnakeFlag snakeFlagGenerator(Snake snake){
		SnakeFlag sFlag = new SnakeFlag(snake);
		return sFlag;
	}
}
