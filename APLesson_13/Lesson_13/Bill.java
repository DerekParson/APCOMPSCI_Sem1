public class Bill extends Money
{
	private String face;
	private String name;
	private double value;
	
	public Bill()
	{
		super();
		this.face = "";
	}
	public Bill(String n, String f, double v)
	{
		super(n,v);
		this.face = f;
	}
	public String scan()
	{
		return face;
	}
	public String toString()
	{
		return "Face: " + face + "\n" + super.toString();
		
	}
}