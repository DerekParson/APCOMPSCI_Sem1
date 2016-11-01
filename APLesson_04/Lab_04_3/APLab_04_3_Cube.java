import java.util.Scanner;
public class APLab_04_3_Cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter side length");
		double side = kb.nextDouble();
		print(side, calcSurf(side));
	}
	public static double calcSurf(double side)
	{
		return side*side*6;
	}
	public static void print(double side, double sa)
	{
		System.out.printf("The surface area of a cube whose sides are %.5f in length is %.5f", side, sa);
	}
}
