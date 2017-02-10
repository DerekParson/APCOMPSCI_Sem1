public abstract class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		this.name = "";
		this.count = 0;
	}
	public Toy(String n, int c)
	{
		this.name = n;
		this.count = c;
	}
	public abstract String getType();
	public void setName(String n)
	{
		this.name = n;
	}
	public void setCount(int c)
	{
		this.count = c;
	}	
	public int getCount()
	{
		return count;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return " Name: " + name + "  Count: " + count;
	}
}