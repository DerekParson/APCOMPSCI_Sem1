public class Lab_09_Ex_06
{
	public static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\n The biggest one is: " + getBiggest());
	}
	public static void fillArray()
	{
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*101);
		}
	}
	public static void printArray()
	{
		for(int numEntry:numbers)
		{
			System.out.print(numEntry + " ");
		}
	}
	public static int getBiggest()
	{
		int max = 0;
		for(int num:numbers)
		{
			if(num > max)
			{
				max = num;
			}
		}
		return max;
	}
}