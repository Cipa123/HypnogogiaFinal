import java.io.IOException;

public class Main
{
	private static GameFrame game;
	private static Player player;

	public static void main(String[] args) throws IOException
	{
		player = new Player(10,10, 10, 10,10);
		game = new GameFrame(player);
		GameKeyListener listener = new GameKeyListener(game);
		game.addKeyListener(listener);
		
	}
}

