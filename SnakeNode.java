
/**
 * class representing each individual node of the snake
 * @author kevinguh
 *
 */
public class SnakeNode {
	private int xPosition;
	private int yPosition;
	private int xVelocity;
	private int yVelocity;
	
	/**
	 * constructor method for a snake node
	 * @param parentSnake snake to which SnakeNode will be concatenated
	 */
	public SnakeNode(Snake parentSnake){
		xPosition = parentSnake.getXPosition();
		yPosition = parentSnake.getYPosition();
		xVelocity = parentSnake.getXVelocity();
		yVelocity = parentSnake.getYVelocity();
	}
	
	
}
