import java.util.Scanner;
public class Lab03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.\nWhat is your name?");
		String name = keyboard.next();
		System.out.println(name + "?!!! Why would anyone name a baby that?\nHow old are you," + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Oooooo!!! " + age + " is getting up there.\nWhat do you do for fun, "+ name + "?");
		String fun = keyboard.next();
		System.out.println("I thought only nerds like to " + fun + "?\nWhat kind of music to you like");
		String music = keyboard.next();
		System.out.println("Boooo!!!! I wouldn't wish the sound of " + music + " on my worst enemy. How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking. What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println("I think you'd have to be smarter to be a " + job + "\n. So, " + name + ", you're " + age + "...\n You like to " + fun + " and listen to " + music + "...\n Good luck becoming a " + job + ".\n I'm only kiddin' " + name + ".");
	
	}
}