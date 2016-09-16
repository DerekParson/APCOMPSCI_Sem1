import java.util.Scanner;

public class Lab_04
{
	public static void main(String[]args)
	{
		Lab_04 form = new Lab_04();
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter item 1");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price1 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 2");
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		keyboard.nextLine();
		
		System.out.println("Please enter item 3");
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();
		keyboard.nextLine();
		
		form.format(item1, price1, item2, price2, item3, price3);
	}
	
	public void format(String item1, double price1, String item2, double price2, String item3, double price3)
	{
		
		System.out.printf("%41s","^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		System.out.printf("%40s","\n\t\t\t\t Receipt \t\t\t\t");
		
	}
}