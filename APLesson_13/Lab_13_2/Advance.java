public class Advance extends Ticket
{
	private int days;
	public Advance()
	{
		super();
	}
	public Advance(int m)
	{
		super();
	}
	public int getPrice()
	{
		if(days >=10)
		{
			return 30;
		}
		else
		{
			return 40;
		}
	}
	
}