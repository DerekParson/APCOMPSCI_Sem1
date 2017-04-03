public class GMC implements Location
{
	private double locX, locY;
	public GMC()
	{
		locX = 0;
		locY = 0;
	}
	public GMC(double x, double y)
	{
		locX = x;
		locY = y;
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double xI, double yI)
	{
		locX += xI;
		locY += yI;
	}
	public double[] getLoc()
	{
		double[] location = new double[2];
		location[0] = locX;
		location[1] = locY;
		return location;
	}
}