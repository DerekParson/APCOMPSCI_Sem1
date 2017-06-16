public class Toyota extends Car
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
}