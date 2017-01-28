import java.util.Scanner;
public class HumanRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your hair color:");
		String hair = kb.nextLine();
		System.out.println("Enter your eye color:");
		String eyes = kb.nextLine();
		System.out.println("Enter your skin color:");
		String skin = kb.nextLine();
		Human object = new Human(hair, eyes, skin);
		System.out.println("My info...");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
		
		System.out.println("\nEnter your friend's hair color:");
		hair = kb.nextLine();
		System.out.println("Enter your friend's eye color:");
		eyes = kb.nextLine();
		System.out.println("Enter your friend's skin color:");
		skin = kb.nextLine();
		object.setHuman(hair, eyes, skin);
		System.out.println("\nFriend's info...");
		System.out.println("Hair: " + object.getHair() + "\nEyes: " + object.getEyes() + "\nSkin: " + object.getSkin());
	}
}