public class Airborn extends Enemy
{
	public Airborn(int h, int baseAttack)
	{
		setHealth(h);
		setAlive(true);
		setIsMoving(true);
		setSawPlayer(false);
		setBaseAttackDamage(baseAttack);
	}
	
	public void die()
	{
		//will do more stuff of course
		setAlive(false);
	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}


}
