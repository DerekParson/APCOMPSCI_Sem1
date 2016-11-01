import java.util.Scanner;
public class Lab_04_1_Ex1
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
		
		
	}
	public double monthlyPayment(double r, double p, double n, double t)
	{
		return p*(Math.pow(1 + r/n, n*t))/(12 * t);
	}

}