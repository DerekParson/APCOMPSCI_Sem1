import java.util.ArrayList;
import java.util.Arrays;
public class Lab_10_Ex_02
{
	public static void main(String[]args)
	{
		Integer[] numbers = {2,6,8,9,10,12,13,15,17,24,55,66,78,77,79};
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
		System.out.println("Out of the numbers:\n" + nums);
		System.out.println("Only " + removePrimes(nums) + " are composite");
		
	}
	public static int gFactor(int n)
	{
		int ret = null;
		for(int i = 2; i < n; i++)
		{
			if(n%i == 0)
			{
				ret += 1;
		}
		if(ret>0)
			return 0;
		else
			return 1;
	}
	public static ArrayList<Integer> removePrimes(ArrayList<Integer> numbs)
	{
		for(int i = 0; i < numbs.size(); i++)
		{
			if(gFactor(numbs.get(i)) == 0)
			{
				numbs.remove(i);
				i--;
			}
		}
		return numbs;
	}
	
}