import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class GameKeyListener implements KeyListener
{
	//private boolean active;
	private GameFrame game;
	private ArrayList<Integer> keysDown;
	
	public GameKeyListener(GameFrame a)
	{
		game = a;
		keysDown = new ArrayList<Integer>();
		
	}
	
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 27 )//escape
		{
			System.out.println("Escape Pressed");
			game.setVisible(false);
			game.dispose();
		}
		else if(e.getKeyCode() == 39 )
		{
			System.out.println("Right Pressed");
		}
		else if(e.getKeyCode() == 37 )
		{
			System.out.println("Left Pressed");
		}
		else if(e.getKeyCode() == 40 )
		{
			System.out.println("Down Pressed");
		}
		else if(e.getKeyCode() == 38 )
		{
			System.out.println("Up Pressed");	
		}
		else if(!keysDown.contains(e.getKeyCode()))
		{
			keysDown.add(new Integer(e.getKeyCode()));
		}
	}
	


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}


	

}
