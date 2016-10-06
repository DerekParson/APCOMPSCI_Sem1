import java.util.Random;
import java.util.Scanner;
public class Lab_05
{
	public static void main(String[]args)
	{
		Random dice = new Random();
		Scanner kb = new Scanner(System.in);
		
		int playerRoll = dice.nextInt(7); 
		int compRoll = dice.nextInt(7);
		String winner = rollDice(playerRoll, compRoll);
		
		System.out.println("You rolled a " + playerRoll + ".");
		System.out.println("Computer rolled a " + compRoll + ".");

		System.out.println("The winner is " + winner + ".");
	}
	public static String rollDice(int r1, int r2)
	{
		String out;
		boolean tF = (r1 >= r2);
		if(tF)
		{
			out = "You";
		}
		if(!tF)
		{
			out = "the Computer";
		}
		return out;
	}
}