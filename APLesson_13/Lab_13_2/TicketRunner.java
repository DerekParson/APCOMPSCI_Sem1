public class TicketRunner
{
	public static void main(String args[])
	{
		atTheDoor atDoor = new atTheDoor();
		Advance advance = new Advance();
		StudentAdvance studAdv = new StudentAdvance();
		
		System.out.println("Receipt:\n" + atDoor + "\n");
		System.out.println("Receipt:\n" + advance + "\n");
		System.out.println("Receipt:\n" + studAdv + "\n");
	}
}