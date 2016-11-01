import java.util.Scanner;
public class Rectangle
{
	static double length;
	static double width;
	static double perimeter;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter width");
		width = kb.nextDouble();
		System.out.println("Enter length");
		length = kb.nextDouble();
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = length*2 + width*2;
	}
	public static void print()
	{
		System.out.printf("Your rectangle is %.5f feet around", perimeter);
	}
}