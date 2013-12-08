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
		if(yDir)
			yVelocity = 10;
		snake = new LinkedList<SnakeNode>();
		snake.add(new SnakeNode(xPosition, yPosition, xVelocity, yVelocity));
	}
	
	/**
	 * method that lengthens the snake when it eats an object
	 */
	public void addNode(int xPosition, int yPosition, int xVelocity, int yVelocity){
		snakeLength++;
		snake.add(new SnakeNode(xPosition, yPosition, xVelocity, yVelocity));
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
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
