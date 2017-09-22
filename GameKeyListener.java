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
	@Override
	public void keyPressed(KeyEvent e)
	{
		if(e.getKeyCode() == 27 )
		{
			game.setVisible(false);
			game.dispose();
		}
		else if(!keysDown.contains(e.getKeyCode()))
		{
			keysDown.add(new Integer(e.getKeyCode()));
		}
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
