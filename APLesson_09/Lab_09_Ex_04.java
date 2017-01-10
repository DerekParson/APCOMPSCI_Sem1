import java.util.Scanner;
public class Lab_09_Ex_04
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number:");
		int start = kb.nextInt();
		System.out.println("Please enter your sequence size:");
		int seqSize = kb.nextInt();
		int[] seq = new int[seqSize];
		for(int i = 0; i < seqSize; i++)
		{
			if(i == 0 || i == 1)
			{
				seq[i] = start;
			}
			else
			{
				seq[i] = seq[i-2] + seq[i-1]; 
			}
			System.out.print(seq[i] + " ");
		}
	}
}