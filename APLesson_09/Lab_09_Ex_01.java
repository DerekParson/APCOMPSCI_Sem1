import java.util.Scanner;
public class Lab_09_Ex_01
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
		System.out.println("In order");
		for(String word : words)
		{
			System.out.print(word + " ");
		}
		System.out.println("\nIn reverse");
		reverse(words);
	}
	public static void reverse(String[]rev)
	{
		for(int i = (rev.length - 1); i>=0; i--)
		{
		System.out.print(rev[i] + " ");
		}
	}
}