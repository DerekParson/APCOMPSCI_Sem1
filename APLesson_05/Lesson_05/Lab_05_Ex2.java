import java.util.Scanner;
public class Lab_05_Ex2
{
	public static double discount;
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter item 1");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price1 = keyboard.nextDouble();
		System.out.println("Please enter item 2");
		keyboard.nextLine();
		String item2 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price2 = keyboard.nextDouble();
		System.out.println("Please enter item 3");
		keyboard.nextLine();
		String item3 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price3 = keyboard.nextDouble();
		System.out.println("Please enter item 4");
		keyboard.nextLine();
		String item4 = keyboard.nextLine();
		System.out.println("Please enter the price");
		double price4 = keyboard.nextDouble();
		
		double subtotal = price1 + price2 + price3 + price4;
		discount(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;
		format(item1, price1, item2, price2, item3, price3, item4, price4, subtotal, discount, tax, total);
	}
	public static double discount(double num)
	{
		boolean greater2k = (num >= 2000);
		if(greater2k)
			discount = num * 0.15;
		if(!greater2k)
			discount = 0;
		return discount;
	}
	public static void format(String i1, double p1, String i2, double p2, String i3, double p3, String i4, double p4, double st, double dis, double tx, double tot)
	{
		System.out.printf("\n%-10s:\t.\t.    . %6.2f", i1, p1);
		System.out.printf("\n%-10s:\t.\t.    . %6.2f", i2, p2);
		System.out.printf("\n%-10s:\t.\t.    . %6.2f", i3, p3);	
		System.out.printf("\n%-10s:\t.\t.    . %6.2f",i4, p4);	
		System.out.printf("\n\nSubtotal\t.\t.\t.    . %6.2f",st);
		System.out.printf("\nDiscount\t.\t.\t.    . %6.2f",dis);		
		System.out.printf("\nTax\t.\t.\t.\t.    . %6.2f", tx);
		System.out.printf("\nTotal\t.\t.\t.    . %6.2f", tot);
		System.out.printf("\n___________________________________");
		System.out.printf("\n____________Thank you!_____________");
	}
}