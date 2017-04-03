public class Toyota implements Location
{
	private double[] location;
	public Toyota()
	{
		location = new double[2];
	}
	public Toyota(String sp)
	{
		location = new double[2];
		String[] locS = sp.split(", ");
		location[0] = Double.parseDouble(locS[0]);
		location[1] = Double.parseDouble(locS[1]);
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