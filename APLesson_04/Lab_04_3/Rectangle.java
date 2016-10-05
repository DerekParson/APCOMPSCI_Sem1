import java.util.Scanner;
public class Rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter length");
		double length = kb.nextDouble();
		System.out.println("Enter height");
		double height = kb.nextDouble();
		System.out.println("Enter length2");
		double length2 = kb.nextDouble();
		System.out.println("Enter height2");
		double height2 = kb.nextDouble();
		print(calcPerim(length, height));
		print(calcPerim(length2, height2));
	}
	public static double calcPerim(double l, double h)
	{
		return 2*l + 2*h;
	}
	public static void print(double perimeter)
	{
		System.out.printf("Your rectangle is %.5f ft around", perimeter);
	}
}
