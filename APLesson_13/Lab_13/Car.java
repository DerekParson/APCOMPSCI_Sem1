public class Car extends Toy
{
	private String name;
		private int count;
	public Car()
	{
		super();
	}
	public Car(String n, int c)
	{
		super(n,c);
	}
	public String getType()
	{
		return "Car";
	}
	public String toString()
	{
		return "Type: " + getType() + super.toString();
	}	
}