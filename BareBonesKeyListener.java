import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;


public class BareBonesKeyListener extends Applet implements KeyListener{

	/**
	 * cool
	 */
	private static final long serialVersionUID = 1L;
	private Rectangle rect;
	private ArrayList<Integer> keysDown;
	
	public void init()
	{
		this.addKeyListener(this);
		keysDown = new ArrayList<Integer>();
	     rect = new Rectangle(0,0, 200,100);
	    
	}
	public void paint(Graphics g)
	{
		setSize(1000,1000);
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(rect);
		setBackground(Color.cyan); 
	}
	public void keyPressed(KeyEvent e) {
		
		if(!keysDown.contains(e.getKeyCode()))
		{
			keysDown.add(new Integer(e.getKeyCode()));
		}
		
	//  try {
		moveRect();
//} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
	//	e1.printStackTrace();
	//}
		
		repaint();
	}
	public void moveRect() //throws InterruptedException
	{
		int x = rect.x;
		int y = rect.y;
		if(keysDown.contains(new Integer(KeyEvent.VK_SPACE)))
		{
			 y-=10;
				//Thread.sleep(500)
			}
		if(keysDown.contains(new Integer(KeyEvent.VK_UP)))
			y -= 2;
	    if(keysDown.contains(new Integer(KeyEvent.VK_DOWN)))
			y += 2;
	    if(keysDown.contains(new Integer(KeyEvent.VK_RIGHT)))
			x += 2;
	    if(keysDown.contains(new Integer(KeyEvent.VK_LEFT)))
			x -= 2;
	    rect.setLocation(x,y);
	}
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_SPACE)
		{
			int a = rect.x;
			int b = rect.y + 10;
			rect.setLocation(a,b);
			repaint();
		}
	keysDown.remove(new Integer (e.getKeyCode()));
	
	}
	public void keyTyped(KeyEvent e) {
		
	}
}
