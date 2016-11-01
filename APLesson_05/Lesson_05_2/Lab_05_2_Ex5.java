import java.util.Scanner;
public class Lab_05_2_Ex5
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		
		//EXERCISE_05
		System.out.println("Which class do you want to be? Mage or Warrior?");
		String spec = kb.next();
		if(spec.equals("Mage"))
		{
			System.out.println("You have picked Mage. Do you want a Wand of Frost or Flame?");
			String wand = kb.next();
			if (wand.equals("Frost"))
			{	
			System.out.println("You see a skeleton. Use your wand? Y/N");
				String atkSkeleton = kb.next();
				if(atkSkeleton.equals("Y"))
					System.out.println("You froze the skeleton, but it didn't stop him from killing you. \nYou lose.");					
				else if(atkSkeleton.equals("N"))
					System.out.println("You chose to run from the skeleton, but you fell into a pit of spikes. \nYou lose");
			}
			else if (wand.equals("Flame"))
			{	
				System.out.println("You see a tapestry. Set it on fire to check for a secret door? Y/N");
				String setFire = kb.next();
				if(setFire.equals("Y"))
					System.out.println("You burn the tapestry and see a chest of gold behind it. \nYou now have 500 gold coins. You win.");
				else if(setFire.equals("N"))
					System.out.println("You decide to forfeit the treasure and walk away, but a spear trap was concealed in the tapestry. \nYou lose.");
			}
		}
		else if(spec.equals("Warrior"))
		{
			System.out.println("You have picked Warrior. Do you want a Broadsword or a Dagger?");
			String weapon = kb.next();
			if(weapon.equals("Broadsword"))
			{
				System.out.println("You pick up the broadsword but it is too heavy. How many coins do you drop to empty your pack?");
				int dropCoins = kb.nextInt();
				if(dropCoins >= 50)
					System.out.println("You drop enough coins to hold the broadsword. \nYou clear out the rest of the dungeon with ease. You win");
				else
					System.out.println("You haven't dropped enough coins and you quickly get exhausted and slain by a goblin.\nYou lose.");
			}
			else if (weapon.equals("Dagger"))
			{
				System.out.println("You pick up the dagger. Do you want to try to pick the lock on a chest? Y/N");
				String pickLock = kb.next();
				if(pickLock.equals("Y"))
					System.out.println("While you are trying to pick the lock, a wraith sneaks up on you and absorbs your soul.\nYou lose.");
				else if (pickLock.equals("N"))
					System.out.println("You decide to leave without the treasure and make it out of the dungeon safely.\nYou win.");
			}
		}
	}
}