import java.util.Scanner;
public class Lab_06_Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer");
		int integer = kb.nextInt();
		System.out.println("Enter the size of the table");
		int tableSize = kb.nextInt();
		System.out.println("_________");
		for(int i = 1; i <= tableSize; i++)
		{
			System.out.printf("\n|%3s|%3s|", i, (i*integer));
		}			
		System.out.println("\n_________");
	}
}