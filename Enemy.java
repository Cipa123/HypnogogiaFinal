
public abstract class Enemy implements movable
{
	private int baseAttackDamage;

	private boolean isMoving;
	
	private boolean isAlive;
	
	private boolean sawPlayer;
	
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
	
	public boolean isSawPlayer()
	{
		return sawPlayer;
	}

	public void setSawPlayer(boolean sawPlayer)
	{
		this.sawPlayer = sawPlayer;
	}
	
	public int getBaseAttackDamage()
	{
		return baseAttackDamage;
	}

	public void setBaseAttackDamage(int baseAttackDamage)
	{
		this.baseAttackDamage = baseAttackDamage;
	}
	
	abstract public void attack();
	
	abstract public void die();

	
}
