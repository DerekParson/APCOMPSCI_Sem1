import java.util.Scanner;
public class UserRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your first name.");
		String n1 = kb.next();
		System.out.println("Enter your last name.");
		String n2 = kb.next();
		System.out.println("Do you want a public avatar? Y/N");
		String answer = kb.next();
		if(answer.equals("Y")||answer.equals("y"))
		{
			System.out.println("Enter your avatar:");
			String avatar = kb.next();
			User object = new User(n1, n2, avatar);
			System.out.println(object);
		}
		else if(answer.equals("N")||answer.equals("n"))
		{
			User object = new User(n1, n2);
			System.out.println(object);
		}
		else
		{
			System.out.println("You did not enter Y or N.");
		}
	}
}