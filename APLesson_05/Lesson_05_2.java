import java.util.Scanner;
public class Lesson_05_2
{
	public static void main(String[]args)
	{
		int number = 7;
		Scanner kb = new Scanner(System.in);		
		if(number > 4)
		{
			if(number <= 10)
			{
				System.out.println("Both of the conditions are met");
			}
			else
				System.out.println("One of the conditions are met");
		}
		else
			System.out.println("None of the conditions are met");
		

		System.out.println("Would you like to..." +
							"\n 1. Do a Math Problem" + 
							"\n 2. Answer a question");
		int mathOrWords = kb.nextInt();
		if(mathOrWords == 1)
		{
			System.out.println("What is 2x2?");
			int mathAnswer = kb.nextInt();
			if(mathAnswer == 4)
			{
				System.out.println("Correct");
			}
			else
				System.out.println("Incorrect");
		}
		else
		{
			System.out.println("Who said the phrase \"Whatever you are, be a good one\"");
			kb.nextLine();
			String wordAnswer = kb.nextLine();
			if(wordAnswer.equals("Abe Lincoln"))
				System.out.println("Correct");
			else
				System.out.println("Incorrect");
		}
	}
}