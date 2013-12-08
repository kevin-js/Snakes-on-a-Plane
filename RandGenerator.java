import java.util.Random;

public class RandGenerator extends Random{
	private static final long serialVersionUID = 1L;
	
	/**
	 * static method that determines which direction the snakes will start moving
	 * @return xDir or yDir determining which direction in which snake will start moving
	 */
	public static boolean startDir(){
		Random rand = new Random();
		boolean xDir = rand.nextBoolean();
		boolean yDir;
		
		if(xDir)
			return xDir;
		else
			yDir = true;
			return yDir;
	}
}
