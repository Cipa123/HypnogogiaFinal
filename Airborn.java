public class Airborn extends Enemy
{
	public Airborn(int h, int baseAttack)
	{
		this.setHealth(h);
		this.setAlive(true);
		this.setIsMoving(true);
		this.setSawPlayer(false);
		this.setBaseAttackDamage(baseAttack);
	}
	
	public void die()
	{
		//will do more stuff of course
		this.setSawPlayer(false);
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}


}
