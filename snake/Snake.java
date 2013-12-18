import java.awt.*;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Random;

/**
 * class for the snake
 * @author kevinguh
 *
 */
public class Snake {
	LinkedList<SnakeNode> snake;
	LinkedList<SnakeFlag> flags;
	protected Random rand = new Random();
	protected Color snakeColor;
	protected int snakeLength;
	protected int xPosition;
	protected int xVelocity;
	protected int yPosition;
	protected int yVelocity;
	protected boolean isVertical;
	protected final int X_INIT_VELOCITY;
	protected final int Y_INIT_VELOCITY;
	
	/**
	 * constructor method for the snake
	 * @param game the main game
	 */
	public Snake(Game main){
		xPosition = generateRandXPosition(rand, main);
		yPosition = generateRandYPosition(rand, main);
		xVelocity = generateRandVelocity(rand, 10);
		yVelocity = generateRandVelocity(rand, 10);
		snakeColor = Color.GREEN;							// change later to allow user to choose color
		snake = new LinkedList<SnakeNode>();
		snake.add(new SnakeNode(this));
		snakeLength = snake.size();							// should equal 1
		X_INIT_VELOCITY = xVelocity;
		Y_INIT_VELOCITY = yVelocity;
	}
	
	/**
	 * method to generate random velocity
	 * @param random Random object
	 * @return velocity randomly generated velocity
	 */
	public int generateRandVelocity(Random random, int maxVelocity){
		int velocity = random.nextInt(maxVelocity);
		boolean velocityFlip = random.nextBoolean();
		if(velocityFlip)
			velocity = -velocity;
		return velocity;
	}
	
	/**
	 * method for generating random x positions
	 * @param random Random object
	 * @param main the main game
	 */
	public int generateRandXPosition(Random random, Game main){
		int position = random.nextInt(main.getWidth());
		return position;
	}
	
	/**
	 * method for generating random y positions
	 * @param random Random object
	 * @param main the main game
	 */
	public int generateRandYPosition(Random random, Game main){
		int position = random.nextInt(main.getHeight());
		return position;
	}
	/**
	 * method that lengthens the snake when it eats an object
	 */
	public void addNode(int xPosition, int yPosition, int xVelocity, int yVelocity){
		snakeLength++;
		snake.add(new SnakeNode(this));
	}

	/**
	 * method to draw the graphical representation of the snake
	 * @param page Graphics object on which snake will be drawn
	 */
	public void drawSnake(Graphics page){
		for(SnakeNode node : snake){
			node.drawNode(page);
		}
	}
	
	/**
	 * method to move the snake in the x-direction
	 * @param deltaX how much the snake should move in the x-direction
	 */
	public void moveSnakeX(int deltaX){
		xPosition += deltaX;
		for(SnakeNode node : snake){
			node.moveX(deltaX);
		}
	}
	
	/**
	 * method to move the snake in the y-direction
	 * @param deltaY how much the snake should move in the y-direction
	 */
	public void moveSnakeY(int deltaY){
		yPosition += deltaY;
		for(SnakeNode node : snake){
			node.moveY(deltaY);
		}
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
	 * getter method for snakeLength variable
	 * @return snakeLength
	 */
	public int getLength(){
		return snakeLength;
	}
	
	/**
	 * getter method for snakeColor variable
	 * @return snakeColor
	 */
	public Color getColor(){
		return snakeColor;
	}
}
