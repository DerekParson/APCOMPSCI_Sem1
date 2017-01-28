import java.util.Scanner;
public class InvRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter item name to lookup:");
		String name = kb.nextLine();
		System.out.println("Enter manufacturer:");
		String manu = kb.nextLine();
		System.out.println("Will you be entering category and price information? Y/N");
		String choice = kb.next();
		if(choice.equals("Y")||choice.equals("y"))
		{
			System.out.println("Enter the category:");
			String cat = kb.nextLine();
			kb.nextLine();
			System.out.println("Enter the price:");
			Double price = kb.nextDouble();
			Inv item1 = new Inv(manu, name, cat, price);
			System.out.println(item1);
		}
		else if(choice.equals("N")||choice.equals("n"))
		{
			Inv item1 = new Inv(manu, name);
			System.out.println(item1);
		}
		else
			System.out.println("You did not enter Y or N.");
	}
}