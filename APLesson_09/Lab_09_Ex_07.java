import java.util.Scanner;
public class Lab_09_Ex_07
{
	public static String[] words;
	public static void main(String[]args)
	{
		words = new String[5];
		fillArray();
		System.out.println("For the words ");
		printArray();
		System.out.println(" " + hasZs() + "contain(s) the letter z.");
	}
	public static void fillArray()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
	}
	public static void printArray()
	{
		for(String word:words)
		{
			System.out.print(word + ", ");
		}
	}
	public static String hasZs()
	{
		String zs = "";
		for(String word:words)
		{
			if(word.contains("z"))
			{
				zs += word + ", ";
			}
			else
			{
				zs = "None ";
			}
		}
		return zs;
	}
}