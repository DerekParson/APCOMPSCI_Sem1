public class Lab_09_Ex_03
{
	public static void main(String[]args)
	{
		int[] numbers = new int[10];
		for(int i = 0; i < numbers.length; i++)
		{
			numbers[i] = (int)(Math.random()*101);
		}
		System.out.println("Numbers:");
		for(int num:numbers)
		{
			System.out.print(num + " ");
		}
		System.out.print("\nThe average of the above numbers is " + average(numbers) + ".");
		
	}
	public static int average(int[] arr)
	{
		int avg = 0;
		for(int num:arr)
		{
			avg += num;
			
		}
		return (avg/10);
	}
}