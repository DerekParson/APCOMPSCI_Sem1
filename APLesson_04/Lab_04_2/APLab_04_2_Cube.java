import java.util.Scanner;
public class APLab_04_2_Cube
{
	static double side;
	static double sa;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter side length");
		side = kb.nextDouble();
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = side*side*6;
	}
	public static void print()
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in length is %.5f", side, sa);
	}
}