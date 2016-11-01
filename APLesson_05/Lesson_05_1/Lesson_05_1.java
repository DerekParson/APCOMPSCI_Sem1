import java.util.Scanner;
public class Lesson_05_1
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your target: ");
		int target = kb.nextInt();
		int enemyLoc = (int)(Math.random()*10)+1;
		
		if (target == enemyLoc)
			System.out.println("It's a hit!");
		else
			System.out.println("Keep trying");
		}
		
		String name = "Joe Smith";
		int units = 12;
		String category = "";
		
		if (units >= 10)
			category = "Ten or more";
		else if (units >= 7)
			category = "Seven or more";
		else if (units >= 5)
			category = "Five or more";
		else (units < 5)
		category = "Not greater than five";
		
		
	
	}	
}