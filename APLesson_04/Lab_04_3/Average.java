import java.util.Scanner;
public class Average
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter number 1");
		double num1 = kb.nextDouble();
		System.out.println("Enter number 1");
		double num2 = kb.nextDouble();
		System.out.println("Enter number 1");
		double num3 = kb.nextDouble();
		print(num1, num2, num3, average(num1, num2, num3));
	}
	public static double average(double n1, double n2, double n3)
	{
		return (n1+n2+n3)/3;
	}
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.printf("The average of %.5f, %.5f, and %.5f is %.5f", num1, num2, num3, avg);
	}
}
