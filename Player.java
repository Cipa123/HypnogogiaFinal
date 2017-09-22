import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

public class Player
{
  
 private int lucidity;
 private int panic;
 private int amtMare;
 private int amtStatic;
 private int amtUpper;
 private int level;
 private int mareXP;
 private int upperXP;
 private int staticXP;
 private int Health;
 private int inDreamHealth;
 
 private Image playerUpImage;
  
  //int coordinates of the the edges of the player model

 

 private Point playerPositionTopLeft;
 private Point  playerPositionTopRight;
 private Point  playerPositionBottomLeft;
 private Point playerPositionBottomRight;
  
 private Rectangle playerTestModel;
  
 private Boolean activeMenu;
 private Boolean inLabratory;
 private Boolean isAwake;
 private Boolean playerLeft;
 private Boolean playerRight;
 private Boolean playerUp;
 private Boolean playerDown;
  
 
  
  public Player ()
  {
	  
  }
  
  public Player (int lucidity, int panic, int amtMare, int amtStatic, int amtUpper) throws IOException 
  {
	  
	  
	  this.lucidity = lucidity;
	  this.panic = panic;
	  this.amtMare = amtMare;
	  this.amtStatic = amtStatic;
	  this.amtUpper = amtUpper;

	  
	 playerTestModel = new Rectangle(100,200);
	 this.playerTestModel.setBounds(0,0,100,200);
	
	 
	 playerPositionTopLeft= new Point(0,0);
	 playerPositionTopRight= new Point(100, 0);
	 playerPositionBottomLeft= new Point(0, 200);
	 playerPositionBottomRight= new Point(100, 200);
	 
	 playerUpImage = null;
	 playerUpImage = ImageIO.read(new File("C:/Users/mykolas/workspace/HYpnogogiaFinal/src/playerup.png"));
	  
	  
	  
	  
  }
  
  //varibales for player position and bounds********************************************************************

 
	 
	  public Point getPlayerPositionTopLeft() 
	  {
	  	return playerPositionTopLeft;
	  }
	
	  public void setPlayerPositionTopLeft(int x, int y) 
	  {
	  	 (this.playerPositionTopLeft).setLocation(x,y);
	  }
	
	  public Point getPlayerPositionTopRight()
	  {
	  	return playerPositionTopRight;
	  }
	
	  public void setPlayerPositionTopRight(int x, int y)
	  {
		  (this.playerPositionTopRight).setLocation(x,y);
	  }
	
	  public Point getPlayerPositionBottomLeft()
	  {
	  	return playerPositionBottomLeft;
	  }
	
	  public void setPlayerPositionBottomLeft(int x, int y)
	  {
		  (this.playerPositionBottomLeft).setLocation(x,y);
	  }
	
	  public Point getPlayerPositionBottomRight()
	  {
	  	return playerPositionBottomRight;
	  }
	
	  public void setPlayerPositionBottomRight(int x, int y)
	  {
		  (this.playerPositionBottomRight).setLocation(x,y);
	  }
	
	  public Rectangle getPlayerTestModel()
	  {
	  	return playerTestModel;
	  }
	
	  public void setPlayerTestModel(int x, int y)
	  {
	  	this.playerTestModel.setLocation(x,y);
	  }
 
  
//variables for player stats***********************************************************************************************
	public int getLucidity() 
	{
		return lucidity;
	}
  	
	public void setLucidity(int lucidity)
	{
		this.lucidity = lucidity;
	}
	
	public int getPanic()
	{
		return panic;
	}
	
	public void setPanic(int panic) 
	{
		this.panic = panic;
	}
	
	//Variables for percentage of next dream *******************************************************************************************************
	
	public int getAmtMare()
	{
		return amtMare;
	}
	
	public void setAmtMare(int amtMare)
	{
		this.amtMare = amtMare;
	}
	
	public int getAmtStatic() 
	{
		return amtStatic;
	}
	
	public void setAmtStatic(int amtStatic)
	{
		this.amtStatic = amtStatic;
	}
	
	public int getAmtUpper()
	{
		return amtUpper;
	}
	
	public void setAmtUpper(int amtUpper) 
	{
		this.amtUpper = amtUpper;
	}
	
	//XP related stuff *******************************************************************************************************
	
	public int getLevel()
	{
		return level;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	
	public int getMareXP() 
	{
		return mareXP;
	}
	public void setMareXP(int mareXP)
	{
		this.mareXP = mareXP;
	}
	
	public int getUpperXP()
	{
		return upperXP;
	}
	
	public void setUpperXP(int upperXP)
	{
		this.upperXP = upperXP;
	}
	
	public int getStaticXP() 
	{
		return staticXP;
	}
	
	public void setStaticXP(int staticXP) 
	{
		this.staticXP = staticXP;
	}
	
	//health *******************************************************************************************************
	
	public int getHealth() 
	{
		return Health;
	}
	
	public void setHealth(int health)
	{
		Health = health;
	}
	
	public int getInDreamHealth() 
	{
		return inDreamHealth;
	}
	
	public void setInDreamHealth(int inDreamHealth) 
	{
		this.inDreamHealth = inDreamHealth;
	}
	
	public Boolean getActiveMenu() 
	{
		return activeMenu;
	}
	
	//menu stuff *******************************************************************************************************
	
	public void setActiveMenu(Boolean activeMenu) 
	{
		this.activeMenu = activeMenu;
	}
	
	public Boolean getInLabratory()
	{
		return inLabratory;
	}
	
	public void setInLabratory(Boolean inLabratory)
	{
		this.inLabratory = inLabratory;
	}
	
	public Boolean getIsAwake() 
	{
		return isAwake;
	}
	
	public void setIsAwake(Boolean isAwake) 
	{
		this.isAwake = isAwake;
	}
	
	// player direction *******************************************************************************************************
	
	public Boolean getPlayerLeft()
	{
		return playerLeft;
	}
	
	public void setPlayerLeft(Boolean playerLeft)
	{
		this.playerLeft = playerLeft;
	}
	
	public Boolean getPlayerRight()
	{
		return playerRight;
	}
	
	public void setPlayerRight(Boolean playerRight)
	{
		this.playerRight = playerRight;
	}
	
	public Boolean getPlayerUp() 
	{
		return playerUp;
	}
	
	public void setPlayerUp(Boolean playerUp)
	{
		this.playerUp = playerUp;
	}
	
	public Boolean getPlayerDown()
	{
		return playerDown;
	}
	
	public void setPlayerDown(Boolean playerDown) 
	{
		this.playerDown = playerDown;
	}

	public Image getPlayerUpImage()
	{
		return playerUpImage;
	}

	public void setPlayerUpImage(Image img)
	{
		this.playerUpImage = img;
	}
}
