public abstract class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		this.name = "";
		this.count = 0;
	}
	public int getCount()
	{
		return count;
	}
	public String setName()
	{
		this.name = n;
	}
	public int setCount()
	{
		this.count = c;
	}	
	public Toy(String n, int c)
	{
		this.name = n;
		this.count = c;
	}
	public String getName();
	{
		return name;
	}

	public abstract String getType();
	{
		return "Name: " + name + ".\tCount: " + count + ".";
	}
}