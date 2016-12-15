import java.util.Scanner;
public class Lab_07_Ex_03
{
	public static int number;
	public static int rev = 0;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number");
		number = kb.nextInt();
		getReverse();
	}
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			rev *= 10;
			rev += num%10;
			num /=10;
		}
		System.out.println(number + " reversed is " + rev);
	}
}