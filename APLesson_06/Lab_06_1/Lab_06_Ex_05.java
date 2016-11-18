import java.util.Scanner;
public class Lab_06_Ex_05
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the number to count by");
		int countBy = kb.nextInt();
		System.out.println("Enter the number to count until");
		int countUntil = kb.nextInt();
		for(int i = 0; i <= countUntil; i+=(countBy))
			System.out.println(i + "\t");
	}
}