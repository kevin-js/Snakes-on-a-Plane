import java.awt.*;
import javax.swing.*;

/**
 * main class file for the 2 player snake game
 * @author kevinguh
 *
 */

public class Game extends Canvas implements Runnable {
	public static final int WIDTH = 400, HEIGHT = 300, SCALE = 2;
	
	public Game(){
		setSize(WIDTH * 2, HEIGHT * 2);
		setVisible(true);
	}

	public void updateGameState(){
		
	}
	
	/**
	 * execute the game
	 * @param args
	 */
	public static void main(String [] args){
		Game run = new Game();
		Dimension dim = new Dimension(WIDTH *2, HEIGHT * 2);
		run.setPreferredSize(dim);
		run.setMaximumSize(dim);
		run.setMinimumSize(dim);
		
		JFrame frame = new JFrame("Snakes on a Plane");
		frame.setSize(dim);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(true);
		frame.add(run);

		// the content pane for the game
		JPanel myContentPanel = new JPanel(new BorderLayout());

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
