import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.LinkedList;
/**
 * class for the snake
 * @author kevinguh
 *
 */
public class Snake implements KeyListener{
	LinkedList<SnakeNode> snake;
	protected int snakeLength;
	protected int xPosition;
	protected int xVelocity;
	protected int yPosition;
	protected int yVelocity;
	protected final int X_INIT_VELOCITY;
	protected final int Y_INIT_VELOCITY;
	
	/**
	 * constructor method for the snake
	 * @param xStart randomly generated starting x position
	 * @param yStart randomly generated starting y position
	 * @param xDir randomly generated boolean determining if snake will start with movement in x-direction
	 * @param yDir randomly generated boolean determining if snake will start with movement in y-direction
	 */
	public Snake(int xStart, int yStart, boolean xDir, boolean yDir){
		xPosition = xStart;
		yPosition = yStart;
		snakeLength = 1;
		if(xDir)
			xVelocity = 10;
			yVelocity = 0;
		if(yDir)
			yVelocity = 10;
			xVelocity = 0;
		snake = new LinkedList<SnakeNode>();
		snake.add(new SnakeNode(this));
		X_INIT_VELOCITY = xVelocity;
		Y_INIT_VELOCITY = yVelocity;
	}
	
	/**
	 * method that lengthens the snake when it eats an object
	 */
	public void addNode(int xPosition, int yPosition, int xVelocity, int yVelocity){
		snakeLength++;
		snake.add(new SnakeNode(this));
	}

	/**
	 * method to move the snake in the x-direction
	 * @param deltaX how much the snake should move in the x-direction
	 */
	public void moveSnakeX(int deltaX){
		xPosition += deltaX;
	}
	
	/**
	 * method to move the snake in the y-direction
	 * @param deltaY how much the snake should move in the y-direction
	 */
	public void moveSnakeY(int deltaY){
		yPosition += deltaY;
	}
	
	/**
	 * getter method for xPosition variable
	 * @return xPosition
	 */
	public int getXPosition(){
		return xPosition;
	}
	
	/**
	 * getter method for yPosition variable
	 * @return yPosition
	 */
	public int getYPosition(){
		return yPosition;
	}
	
	/**
	 * getter method for xVelocity variable
	 * @return xVelocity
	 */
	public int getXVelocity(){
		return xVelocity;
	}
	
	/**
	 * getter method for yVelocity variable
	 * @return yVelocity
	 */
	public int getYVelocity(){
		return yVelocity;
	}
	
	/**
	 * instructions for how the game will respond to key presses
	 */
	public void keyPressed(KeyEvent k) {
		int keyValue = k.getKeyCode();
		
		// only change the snake movement when valid
		switch(keyValue) {
			case KeyEvent.VK_UP:
				if(yVelocity == 0) {
					yVelocity = -10;
					xVelocity = 0;
				}
				break;
				
			case KeyEvent.VK_DOWN:
				if(yVelocity == 0) {
					yVelocity = 10;
					xVelocity = 0;
				}
				break;
				
			case KeyEvent.VK_LEFT:
				if(xVelocity == 0) {
					xVelocity = -10;
					yVelocity = 0;
				}
				break;
					
			case KeyEvent.VK_RIGHT:
				if(xVelocity == 0) {
					xVelocity = 10;
					yVelocity = 0;
				}
				break;
		}
			
	}

	@Override
	public void keyReleased(KeyEvent k) { }

	@Override
	public void keyTyped(KeyEvent k) { }
}
