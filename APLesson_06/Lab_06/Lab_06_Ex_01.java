import java.util.Scanner;
public class Lab_06_Ex_01
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		String input = kb.next();
		for(int i = 1; i <= input.length(); i++)
			System.out.println(input);
	}
}