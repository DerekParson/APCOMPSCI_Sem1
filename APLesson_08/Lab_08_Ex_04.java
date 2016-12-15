import java.util.Scanner;
public class Lab_08_Ex_04
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a word");
		String word = kb.next();
		int stop = word.length();
		System.out.println(tree(word, 0, stop));
	}

	public static String tree(String w, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.printf("\n%20s", w.substring(0, start));
			start++;
			return tree(w, start, stop);
		}
		else
			return " ";
	}
}