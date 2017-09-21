
public abstract class Npc implements movable
{
	
	
	private boolean isMoving;
	
	private boolean isAlive;
	
	private int health;
	
	public void setIsMoving(boolean b)
	{
		isMoving = b;
	}
	
	public boolean getIsMoving()
	{
		return isMoving;
	}
	
	public boolean isAlive() 
	{
		return isAlive;
	}

	public void setAlive(boolean isAlive) 
	{
		this.isAlive = isAlive;
	}
	
	public int getHealth()
	{
		return health;
	}

	public void setHealth(int health) 
	{
		this.health = health;
	}
	
	
	
	abstract public void interact();
	
	abstract public void die();

	

}
