import javax.swing.JFrame;

public class GameFrame extends JFrame 
{
	public GameFrame()
	{
		super("Hypnogogia");
		this.setSize(1920, 1080);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setUndecorated(true);
		this.setVisible(true);
	}
}
