import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameFrame extends JFrame 
{
	private GameGraphics g;
	private Player player;
	
	public GameFrame(Player p)
	{
		
		super("Hypnogogia");
		
		
		
		this.setSize(1920, 1080);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setVisible(true);
		
		
		JPanel masterPanel = new JPanel();
		this.add(masterPanel);
		
		player = p;
		GameGraphics g = new GameGraphics(this,player);
		
		
		
	}
}
