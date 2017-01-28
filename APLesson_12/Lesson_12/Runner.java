public class Runner
{
	public static void main(String[]args)
	{
		OOP_Structure object = new OOP_Structure();
		System.out.println("<<<<<<< USER INFO >>>>>>>>");
		System.out.print("Name: " + object.getFirstName() + "\t" + object.getLastName() + "\n" + "User Name: " + object.getUserName() + "\n\n");
		OOP_Structure object2 = new OOP_Structure("Professor", "Handsome", "pHandsome");
		System.out.println("<<<<<<< USER INFO >>>>>>>>");
		System.out.print("Name: " + object2.getFirstName() + "\t" + object2.getLastName() + "\n" + "User Name: " + object2.getUserName() + "\n\n");
		object2.setUserName("profHansizzle");
		System.out.println("<<<<<<< USER INFO >>>>>>>>");
		System.out.print("Name: " + object2.getFirstName() + "\t" + object2.getLastName() + "\n" + "User Name: " + object2.getUserName() + "\n\n");
	}
}