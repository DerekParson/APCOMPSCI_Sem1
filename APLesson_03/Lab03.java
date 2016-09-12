import java.util.Scanner;
public class Lab03
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//EX_01
		System.out.println("Hi, my name is RudeAI.\nI'd like to ask you a few questions.\nWhat is your name?");
		String name = keyboard.nextLine();
		System.out.println(name + "?!!! Why would anyone name a baby that?\nHow old are you, " + name + "?");
		int age = keyboard.nextInt();
		System.out.println("Oooooo!!! " + age + " is getting up there.\nWhat do you do for fun, "+ name + "?");
		String fun = keyboard.next();
		System.out.println("I thought only nerds like to " + fun + "?\nWhat kind of music do you like?");
		String music = keyboard.next();
		System.out.println("Boooo!!!! I wouldn't wish the sound of " + music + " on my worst enemy. How many siblings do you have?");
		int siblings = keyboard.nextInt();
		System.out.println(siblings + "? Wow, I hope the rest of your family is better looking. What do you want to be when you grow up?");
		String job = keyboard.next();
		System.out.println("I think you'd have to be smarter to be a " + job + ". \nSo, " + name + ", you're " + age + "...\nYou like to " + fun + " and listen to " + music + "...\nGood luck becoming a " + job + ".\nI'm only kiddin' " + name + ".");
	
		//EX_02
		System.out.println("\nHello. Please input your height to the nearest tenth of a meter.");
		double height = keyboard.nextDouble();
		System.out.println("Height Recorded as " + height + " meters.\nPlease input your weight to the nearest kilogram.");
		int weight = keyboard.nextInt();
		System.out.println("Weight Recorded as " + weight + "kilograms. Calculating BMI.");
		double bmi = weight / (height * height);
		System.out.println("Your BMI is " + bmi);
		
		//EX_03
		System.out.println("\nEnter a temperature in Celcius");
		double celcius = keyboard.nextDouble();
		double fahrenheit = (celcius * 1.8) + 32;
		System.out.println("The equivalent temperature in Fahrenheit is " + fahrenheit);
	}
}