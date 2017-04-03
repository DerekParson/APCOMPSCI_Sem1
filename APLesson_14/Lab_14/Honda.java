public class Honda implements Location
{
	private double[] location;
	public Honda(double[] loc)
	{
		location = loc;
	}
	public int getID()
	{
		return (int)(Math.random() * 1000000) + 1;
	}
	public void move(double xI, double yI)
	{
		location[0] += xI;
		location[1] += yI;
	}
	public double[] getLoc()
	{
		return location;
	}
}