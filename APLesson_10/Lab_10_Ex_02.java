import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab_10_Ex_02
{
	public static void main (String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an equation.");
		String userEq = kb.nextLine();
		ArrayList<String> eq = new ArrayList<>(Arrays.asList(userEq.split(" ")));
		System.out.println(doEquation(eq));
	}
	public static ArrayList<String> doEquation(ArrayList<String> eq)
	{
		int i = 0;
		while(i < eq.size())
		{
			if(i < eq.size() && (eq.get(i).equals("*") || eq.get(i).equals("/")))
			{
				if (eq.get(i).equals("*"))
				{
					eq.set(i,"" + (Integer.parseInt(eq.get(i-1))* (Integer.parseInt(eq.get(i+1)))));
					eq.remove(i-1);
					eq.remove(i);
				}
				else
				{
				eq.set(i,"" + (Integer.parseInt(eq.get(i-1))/ (Integer.parseInt(eq.get(i+1)))));	
				eq.remove(i-1);
				eq.remove(i);
				}
			}
			else
				i++;
		}	
		i=0;		
		while(i < eq.size())		
		{	
			if (i < eq.size() && (eq.get(i).equals("+") || (eq.get(i).equals("-"))))
			{
				if (eq.get(i).equals("+"))
				{
					eq.set(i,"" + (Integer.parseInt(eq.get(i-1))+ (Integer.parseInt(eq.get(i+1)))));
					eq.remove(i-1);
					eq.remove(i);	
				}
				else
				{
					eq.set(i,"" + (Integer.parseInt(eq.get(i-1))- (Integer.parseInt(eq.get(i+1)))));
					eq.remove(i-1);
					eq.remove(i);			
				}

			}	
			else
			{
				i++;
			}	
		}
		return eq;
	}
}