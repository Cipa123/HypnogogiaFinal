
public class Player{
  
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
  
  private Boolean activeMenu;
  private Boolean inLabratory;
  private Boolean isAwake;
  private Boolean playerLeft;
  private Boolean playerRight;
  private Boolean playerUp;
  private Boolean playerDown;
  
  
  public Player (){}
  
  public Player (int lucidity, int panic, int amtMare, int amtStatic, int amtUpper) {
	  
	  this.lucidity = lucidity;
	  this.panic = panic;
	  this.amtMare = amtMare;
	  this.amtStatic = amtStatic;
	  this.amtUpper = amtUpper;
	  
	  
	  
	  
	  
	  
	  
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
public int getLucidity() {
	return lucidity;
}
public void setLucidity(int lucidity) {
	this.lucidity = lucidity;
}
public int getPanic() {
	return panic;
}
public void setPanic(int panic) {
	this.panic = panic;
}
public int getAmtMare() {
	return amtMare;
}
public void setAmtMare(int amtMare) {
	this.amtMare = amtMare;
}
public int getAmtStatic() {
	return amtStatic;
}
public void setAmtStatic(int amtStatic) {
	this.amtStatic = amtStatic;
}
public int getAmtUpper() {
	return amtUpper;
}
public void setAmtUpper(int amtUpper) {
	this.amtUpper = amtUpper;
}
public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
public int getMareXP() {
	return mareXP;
}
public void setMareXP(int mareXP) {
	this.mareXP = mareXP;
}
public int getUpperXP() {
	return upperXP;
}
public void setUpperXP(int upperXP) {
	this.upperXP = upperXP;
}
public int getStaticXP() {
	return staticXP;
}
public void setStaticXP(int staticXP) {
	this.staticXP = staticXP;
}
public int getHealth() {
	return Health;
}
public void setHealth(int health) {
	Health = health;
}
public int getInDreamHealth() {
	return inDreamHealth;
}
public void setInDreamHealth(int inDreamHealth) {
	this.inDreamHealth = inDreamHealth;
}
public Boolean getActiveMenu() {
	return activeMenu;
}
public void setActiveMenu(Boolean activeMenu) {
	this.activeMenu = activeMenu;
}
public Boolean getInLabratory() {
	return inLabratory;
}
public void setInLabratory(Boolean inLabratory) {
	this.inLabratory = inLabratory;
}
public Boolean getIsAwake() {
	return isAwake;
}
public void setIsAwake(Boolean isAwake) {
	this.isAwake = isAwake;
}
public Boolean getPlayerLeft() {
	return playerLeft;
}
public void setPlayerLeft(Boolean playerLeft) {
	this.playerLeft = playerLeft;
}
public Boolean getPlayerRight() {
	return playerRight;
}
public void setPlayerRight(Boolean playerRight) {
	this.playerRight = playerRight;
}
public Boolean getPlayerUp() {
	return playerUp;
}
public void setPlayerUp(Boolean playerUp) {
	this.playerUp = playerUp;
}
public Boolean getPlayerDown() {
	return playerDown;
}
public void setPlayerDown(Boolean playerDown) {
	this.playerDown = playerDown;
}
  
}
