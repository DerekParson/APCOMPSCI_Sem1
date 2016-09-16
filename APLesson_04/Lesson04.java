public class Lesson04
{
	public static void main(String[]args)
	{
		Lesson04 form = new Lesson04();
		
		String word1 = "no";
		double number1 = 125.3;
		
		form.format(word1, number1);
		
		String word2 = "lol";
		double number2 = 1234.45;
		
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("\n%10s %10.2f", word, number);
	}
	
	
	
}