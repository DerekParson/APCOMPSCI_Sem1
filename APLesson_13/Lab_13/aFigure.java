public class aFigure extends Toy
{
	private String name;
	private int count;
	
	public aFigure()
	{
		super();
	}
	public aFigure(String n, int c)
	{
		super(n,c);
		
	}
	public String getType()
	{
		return "Action Figure ";
	}
	public String toString()
	{
		return "Type:" + getType() + super.toString();
	}
}