import java.util.Scanner;
public class Lab_04_1
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		//EX_01
		
		Lab_04_1 loan = new Lab_04_1();
		
		System.out.println("Enter interest rate");
		double interestRate = keyboard.nextDouble();
		System.out.println("Enter principal amount");
		double principal = keyboard.nextDouble();
		System.out.println("Enter the compound frequency");
		double compound = keyboard.nextDouble();
		System.out.println("Enter the length of the loan");
		double years = keyboard.nextDouble();
		
		System.out.printf("Your total monthly payment is %10.2f\n", loan.monthlyPayment(interestRate, principal, compound, years));
		
		//EX_02
		
		Lab_04_1 subwoofer = new Lab_04_1();
		
		System.out.println("Enter height");
		double height = keyboard.nextDouble();
		System.out.println("Enter length");
		double length = keyboard.nextDouble();
		System.out.println("Enter width");
		double width = keyboard.nextDouble();
		
		System.out.printf("The volume of your Subwoofer in cubic feet is %-10.2f\n", subwoofer.calcVol(height, length, width));
		
	}
	public double monthlyPayment(double r, double p, double n, double t)
	{
		return p*(Math.pow(1 + r/n, n*t))/(12 * t);
	}
	public double calcVol(double h, double l, double w)
	{
		return ((l*w*h)/1728);
		
	}
}