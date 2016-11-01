import java.util.Random;
import java.util.Scanner;
public class Lab_05_Ex1
{
	public static void main(String[]args)
	{
		Random dice = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int playerRoll = dice.nextInt(7); 
		int compRoll = dice.nextInt(7);
		String winner = rollDice(playerRoll, compRoll);
		
		System.out.println("You rolled a " + playerRoll + ".");
		System.out.println("Computer rolled a " + compRoll + ".");

		System.out.println("The winner is " + winner + ".");
	}
	public static String rollDice(int playerRoll, int compRoll)
	{
		String winner = "";
		if(playerRoll > compRoll)
			winner = "You";
		if(playerRoll < compRoll)
			winner = "the Computer";
		if(playerRoll == compRoll)
			winner = "nobody. It's a tie..";
		
		return winner;
	}
}