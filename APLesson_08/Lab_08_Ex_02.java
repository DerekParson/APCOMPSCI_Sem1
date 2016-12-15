import java.util.Scanner;
public class Lab_08_Ex_02
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter word 1");
		String word1 = kb.next();
		System.out.println("Enter word 2");
		String word2 = kb.next();		
		System.out.println("Enter word 3");
		String word3 = kb.next();		
		System.out.println(makeCenter(word1));
		System.out.println(makeCenter(word2));
		System.out.println(makeCenter(word3));	
	}
	public static String makeCenter(String word)
	{
		if(word.length() >= 20)
			return word;
		else 
			return makeCenter(" " + word + " ");
	}
}