public class Lab_09_Ex_05
{
	public static int[] numbers;
	public static void main(String[]args)
	{
		numbers = new int[10];
		fillArray();
		System.out.println("For the following numbers...");
		printArray();
		System.out.println("\n Odds are: " + getOdds());
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
			System.out.print(numEntry + ", ");
		}
	}
	public static String getOdds()
	{
		String odds = "";
		for(int num:numbers)
		{
			if(num % 2 == 1)			
			{
				odds += num + ", ";
			}
		}
		return odds;
	}
}