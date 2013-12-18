import java.awt.*;
import javax.swing.*;

/**
 * class representing each individual node of the snake
 * @author kevinguh
 *
 */
public class SnakeNode {
	private final int SNAKE_NODE_RADIUS = 5;
	private final int SNAKE_NODE_SEPARATION = 10;
	private int xPosition;
	private int yPosition;
	private int xVelocity;
	private int yVelocity;
	private Color nodeColor;
	
	/**
	 * constructor method for a snake node
	 * @param parentSnake snake to which SnakeNode will be concatenated
	 */
	public SnakeNode(Snake parentSnake){
		xPosition = parentSnake.getXPosition();
		yPosition = parentSnake.getYPosition();
		xVelocity = parentSnake.getXVelocity();
		yVelocity = parentSnake.getYVelocity();
		nodeColor = parentSnake.getColor();
	}
	
	/**
	 * method to draw the SnakeNode
	 * @param page Graphics object on which node will be drawn
	 * @return the current SnakeNode node
	 */
	public SnakeNode drawNode(Graphics page){
		SnakeNode node = this;
		page.setColor(nodeColor);
		page.drawOval(xPosition - SNAKE_NODE_RADIUS, yPosition - SNAKE_NODE_RADIUS, 
				2*SNAKE_NODE_RADIUS, 2*SNAKE_NODE_RADIUS);
		return node;
	}
	
	/**
	 * method to update the SnakeNode's x-position
	 * @param deltaX how much the SnakeNode moves in the x-direction
	 */
	public void moveX(int deltaX){
		xPosition += deltaX;
	}
	
	/**
	 * method to update the SnakeNode's y-position
	 * @param deltaY how much the SnakeNode moves in the y-direction
	 */
	public void moveY(int deltaY){
		yPosition += deltaY;
	}
}
