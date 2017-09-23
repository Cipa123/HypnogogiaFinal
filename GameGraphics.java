import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class GameGraphics
{
	
	private Graphics g;
	private Player player;
	
	public GameGraphics (GameFrame a,Player p)
	{
		g = a.getGraphics();
		
	
		
		g.setColor(Color.BLACK);
		g.drawString("Hypnogogia", 450, 100);
		
		
		player = p;
		g.drawImage(player.getPlayerUpImage(), 100, 200, null);
	}
	

	
}
