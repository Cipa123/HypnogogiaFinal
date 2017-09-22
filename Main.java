public class Main
{
	private static GameFrame game;
	private static GameKeyListener listener; 
	public static void main(String[] args)
	{
		game = new GameFrame();
		GameKeyListener listener = new GameKeyListener(game);
		game.addKeyListener(listener);
		
	}
}

