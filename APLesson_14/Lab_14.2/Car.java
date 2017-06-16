public class Car implements Location
{
	private double[] location = new double[2];
	public int ID;
	public Car()
	{

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
