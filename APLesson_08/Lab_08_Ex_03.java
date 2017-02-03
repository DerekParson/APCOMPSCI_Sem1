import java.util.Scanner;
public class Lab_08_Ex_03
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = kb.nextInt();
		System.out.println("There are " + luck(number) + " 7s in the number.");
	}
	public static int luck(int number)
	{
		if(number > 0)
		{
			if(number%10 == 7)
			{
				return(1 + luck(number/10));
			}
			else
			{
				return(0 + luck(number/10));
			}
		}
		else 
			return 0;
	}
}