import java.util.Scanner;
public class Lesson_06
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		for(int i = 2; i <= 10; i+=2)
			System.out.print(i + " ");
		String word = "COMPSCI";
		System.out.println("\n" + word.length());
		System.out.println("\n" + word.indexOf("S"));
		System.out.println("\n" + word.charAt(6));
		System.out.println("\n" + word.substring(0, 4));
		System.out.println("\n" + word.substring(4));
		System.out.println("Enter a word");
		String word2 = kb.next();
		for(int i2 = 0; i2 <= word2.length(); i2++)
		{
			System.out.println(word2.substring(0, i2));
		}
		
		System.out.println("Enter the number of cookies");
		int cookies = kb.nextInt();
		int batch = 0;
		for (int needed = cookies; needed > 0; needed -= 25)
		{
			System.out.println("Cookies needed:" + needed);
			System.out.println("Batch #: " + batch);
			batch ++;
		}
	}
}