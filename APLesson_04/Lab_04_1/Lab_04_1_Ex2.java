import java.util.Scanner;
public class Lab_04_1_Ex2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		//EX_02
		
		Lab_04_1_Ex2 subwoofer = new Lab_04_1_Ex2();
		
		System.out.println("Enter height");
		double height = keyboard.nextDouble();
		System.out.println("Enter length");
		double length = keyboard.nextDouble();
		System.out.println("Enter width");
		double width = keyboard.nextDouble();
		
		System.out.printf("The volume of your Subwoofer in cubic feet is %-10.2f\n", subwoofer.calcVol(height, length, width));
		
	}
	public double calcVol(double h, double l, double w)
	{
		return ((l*w*h)/1728);
		
	}	
}