import java.util.Scanner;
public class Lab_09_Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter 5 words");
		String[] words = new String[5];
		for(int i = 0; i < words.length; i++)
		{
			words[i] = kb.next();
		}
		first(words);
	}
	public static void first(String[]arr)
	{
		for(String val:arr)
		{
			System.out.println(val.substring(0,1));
		}
	}
}