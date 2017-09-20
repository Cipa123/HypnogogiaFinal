
public class Slope
{
	private int xDiff;
	private int yDiff;
	private double slope;
	
	public Slope(int x1,int y1, int x2, int y2)
	{
		this.setXDiff(calculateX(x1,x2));
		this.setYDiff(calculateY(y1,y2));
		
		
	}
	public int calculateX(int x1, int x2)
	{
		return x2-x1;
	}
	public int calculateY(int y1, int y2)
	{
		return y2-y1;
	}
	
	public double calculateSlope(int xDiff, int yDiff)
	{
		return (double)xDiff/yDiff;
	}
	
	public int getXDiff() 
	{
		return xDiff;
	}

	public void setXDiff(int xDiff) 
	{
		this.xDiff = xDiff;
	}

	public int getYDiff()
	{
		return yDiff;
	}

	public void setYDiff(int yDiff)
	{
		this.yDiff = yDiff;
	}

	public double getSlope()
	{
		return slope;
	}

	public void setSlope(double slope) 
	{
		this.slope = slope;
	}
}
