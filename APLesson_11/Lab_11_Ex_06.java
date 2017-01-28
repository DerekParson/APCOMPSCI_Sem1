import java.util.Scanner;
public class Lab_11_Ex_06
{
	static String[] health;
	static int HEALTHLOAD = 6;
	static int healthCount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		String turn = "";
		int damage = 0;
		int amount = 0;
		healthCount = 6;
		health = new String[HEALTHLOAD];
		while(!(turn.equals("Q")) && healthCount > 0)
		{
			System.out.println("Your turn! Hit \"a\" when ready: ");
			turn = kb.next();
			damage = (int)(Math.random()*2)+ 1;
			amount = (int)(Math.random()*6)+ 1;
			System.out.println(takeDamage(damage, amount));
			printClip();
		}
		System.out.println("You died!");
	}
	public static String takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthCount -= amt;
			return "Taking "+ amt +" damage!";
		}
		else
		{
			if(healthCount + amt < HEALTHLOAD)
			{
				healthCount += amt;
			}
			else
			{
				healthCount = HEALTHLOAD;
			}
		}
		return "Power up " + amt + "!";
		
	}
	public static void printClip()
	{
		String output = "Health\t";
		for(int i = 0; i < HEALTHLOAD;i++)
		{
			if(i < healthCount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			output += health[i];
		}
		System.out.println(output);
	}	
}