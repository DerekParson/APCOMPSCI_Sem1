import java.util.Scanner;
public class Lab_11_Ex_05
{
	static int bulletCount;
	static int clipSize = 16;
	static int shotCount;
	static String[] clip;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		bulletCount = 96;
		shotCount = 0;
		clip = new String[clipSize];
		resetClip();
		while(bulletCount > 0 || shotCount > 0)
		{
			System.out.println("Action:");
			String action = kb.next();
			if(action.equals("r")||action.equals("R"))
			{
				reload();
			}
			if(action.equals("s")||action.equals("S"))
			{
				System.out.println(shoot());
			}
			printClip();
		}
		System.out.println("Out of Bullets!");
	}
	public static void resetClip()
	{
		for(int i = 0; i < clipSize;i++)
		{
			clip[i] = "[]";
		}
	}
	public static String shoot()
	{
		if(shotCount > 0)
		{
			clip[shotCount-1] = " []";
			shotCount--;
			return "\nBOOM!";
		}
		else
		{
			return "\nReload!";
		}
	}
	public static void reload()
	{
		if(bulletCount >= clipSize)
		{
			bulletCount -= clipSize;
			shotCount = clipSize;
		}
		else
		{
			shotCount = bulletCount;
			bulletCount = 0;
		}
		resetClip();
		for(int i = 0; i < shotCount; i++)
		{
			clip[i] = " * ";
		}
	}
	public static void printClip()
	{
		String output = "";
		output =  "Bullets:\t" + bulletCount + "\nClip:\t";
		for(int i = 0; i < clipSize;i++)
		{
			output += clip[i];
		}
		System.out.println(output);
	}
}
