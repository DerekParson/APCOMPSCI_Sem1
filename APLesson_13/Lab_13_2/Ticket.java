public abstract class Ticket
{
	private int r;
	public Ticket()
	{
		r = (int)(Math.random()*10000000)+1;
	}
	public int getSerialNo()
	{
		return r;
	}
	public abstract int getPrice();
	public String toString()
	{
		return "Serial #: " + getSerialNo() + "\nPrice: " + getPrice();
	}
}