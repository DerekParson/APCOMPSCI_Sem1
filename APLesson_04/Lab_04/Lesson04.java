import java.util.Scanner;

public class Lesson04
{
	public static void main(String[]args)
	{
		Lesson04 form = new Lesson04();
		
		Lesson04 volCube = new Lesson04();
		int side1 = 1254;
		System.out.println(volCube.cube(side1));
		
		Lesson04 average = new Lesson04();
		int num1 = 12;
		int num2 = 34;
		int num3 = 56;
		double avg = average.calcAvg(num1, num2, num3);
		System.out.println(average.calcAvg);
		
		
		String word1 = "no";
		double number1 = 125.3;
		
		form.format(word1, number1);
		
		String word2 = "lol";
		double number2 = 1234.45;
		
		form.format(word2, number2);
	}
	
	public void format(String word, double number)
	{
		System.out.printf("%n%-10s %10.2f", word, number);
	}
	
	public int cube(int side)
	{
		return side * side * side;
		
	}
	
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
		
	}
	
}	