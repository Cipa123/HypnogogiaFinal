import java.awt.Rectangle;
import java.awt.geom.Point2D;

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
  
  //int coordinates of the the edges of the player model

 

 private Point2D playerPositionTopLeft;
 private Point2D playerPositionTopRight;
 private Point2D playerPositionBottomLeft;
 private Point2D playerPositionBottomRight;
  
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
  
  public Player (int lucidity, int panic, int amtMare, int amtStatic, int amtUpper) 
  {
	  
	  
	  this.lucidity = lucidity;
	  this.panic = panic;
	  this.amtMare = amtMare;
	  this.amtStatic = amtStatic;
	  this.amtUpper = amtUpper;

	  

	 this.playerTestModel.setBounds(0,0,100,200);
	
	 
	 this.playerPositionTopLeft.setLocation(0, 0);
	 this.playerPositionTopRight.setLocation(100, 0);
	 this.playerPositionBottomLeft.setLocation(0, 200);
	 this.playerPositionBottomRight.setLocation(100, 200);
	  
	  
	  
	  
	  
  }
  
  //varibales for player position and bounds********************************************************************

 
	 
	  public Point2D getPlayerPositionTopLeft() 
	  {
	  	return playerPositionTopLeft;
	  }
	
	  public void setPlayerPositionTopLeft(int x, int y) 
	  {
	  	 (this.playerPositionTopLeft).setLocation(x,y);
	  }
	
	  public Point2D getPlayerPositionTopRight()
	  {
	  	return playerPositionTopRight;
	  }
	
	  public void setPlayerPositionTopRight(int x, int y)
	  {
		  (this.playerPositionTopRight).setLocation(x,y);
	  }
	
	  public Point2D getPlayerPositionBottomLeft()
	  {
	  	return playerPositionBottomLeft;
	  }
	
	  public void setPlayerPositionBottomLeft(int x, int y)
	  {
		  (this.playerPositionBottomLeft).setLocation(x,y);
	  }
	
	  public Point2D getPlayerPositionBottomRight()
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
  
}
