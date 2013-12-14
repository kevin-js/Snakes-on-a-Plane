import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * class for a player-controlled snake
 * @author kevinguh
 *
 */
public class PlayerSnake extends Snake implements KeyListener{
	
	/**
	 * constructor method for a human-controlled snake
	 * @param game the main game
	 */
	public PlayerSnake(SnakeMain game){
		super(game);
	}
	
	/**
	 * instructions for how the game will respond to key presses
	 */
	public void keyPressed(KeyEvent k) {
		int keyValue = k.getKeyCode();
		flags.add(SnakeFlag.snakeFlagGenerator(this)); // create a flag noting the location at which snake
													   // changes direction of movement
		
		switch(keyValue) {
			case KeyEvent.VK_UP:
				yVelocity -= 2;
				break;
				
			case KeyEvent.VK_DOWN:
				yVelocity += 2;
				break;
				
			case KeyEvent.VK_LEFT:
				xVelocity -= 2;
				break;
					
			case KeyEvent.VK_RIGHT:
				xVelocity += 2;
				break;
		}
			
	}

	public void keyReleased(KeyEvent k) { }
	public void keyTyped(KeyEvent k) { }
}
