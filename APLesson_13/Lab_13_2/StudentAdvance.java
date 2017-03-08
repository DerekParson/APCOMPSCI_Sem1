public class StudentAdvance extends Advance
{
	public StudentAdvance()
	{
		super();
	}
	public int getPrice()
	{
		return super.getPrice()/2;
	}
	public String toString()
	{
		return super.toString() + "\nStudent ID Required.";
	}
}