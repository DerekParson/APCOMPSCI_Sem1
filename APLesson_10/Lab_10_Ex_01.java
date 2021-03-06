import java.util.Arrays;
import java.util.ArrayList;
public class Lab_10_Ex_01
{
	public static void main(String[]args)
	{
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,79,77};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Out of the numbers:\n" + nums);
		System.out.println("Only " + removePrimes(nums) + " are composite.");
		
	}
	public static int gFactor(int n)
	{
		int a = 0;
		for (int i = 2; i < n; i ++)
		{
			if (n%i == 0)
			{
				a += 1;
			}
		}
		if (a > 0)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}
	
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> a)
	{
		for (int i = 0; i < a.size(); i++)
		{
			if (gFactor(a.get(i)) == 0)
			{
				a.remove(i);
				i --;
			}
		}
		return a;
	}
}
