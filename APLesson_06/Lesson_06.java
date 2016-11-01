import java.util.Scanner;
public class Lesson_06
{
	public static void main(String[]args)
	{
		Scabber kb = new Scanner(System.in);
		System.out.println("Enter the number of cookies:");
		int cookies = kb.nextInt();
		int batch = 1
		for(int needed = cookies; needed > 0; needed+=20)
		{
			System.out.println("Cookies needed: " + needed);
			System.out.prinltn("Batch #: " + batch);
			batch ++;
		}
	System.out.println("Order up")
	}
}