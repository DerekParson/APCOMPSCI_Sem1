import java.util.Scanner;
public class Lab_11_Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		int[][] numbers = new int[4][4];
		
		for(int i = 0; i<numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length;j++)
			{
				numbers[i][j] = (int)(Math.random() * 100);
				System.out.print(numbers[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Please enter a number.");
		int divisor = kb.nextInt();
		
		int count = 0;
		
		for(int i = 0; i<numbers.length; i++)
		{
			for(int j = 0; j < numbers[i].length;j++)
			{
				if(numbers[i][j] % divisor == 0)
				{
					count++;
				}
			}
		}
System.out.println("There are " + count + " numbers divisible by " + divisor + " in the Array.");		
	}
}