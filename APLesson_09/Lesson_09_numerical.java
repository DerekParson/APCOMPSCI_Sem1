import java.util.Scanner;
public class Lesson_09_numerical
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[] numbers = new int[10];
		
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*100)+ 1;
		}
		for(int num : numbers)
		{
			System.out.print(num + " ");
		}
		System.out.println("
		\nThe sum of the numbers is " + sums(numbers));
	}
	public static int sums(int[] n)
	{
		int sum = 0;
		for(int num : n)
		{
			sum += num;
		}
		return sum;
	}
	
}