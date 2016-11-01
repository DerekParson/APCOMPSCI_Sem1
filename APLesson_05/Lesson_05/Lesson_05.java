import java.util.Random;
import java.util.Scanner;
public class Lesson_05
{
	public static void main(String[]args)
	{
		int num = 10;
		if(num == 10)
		{
			System.out.println("num equals 10");
		}
		
		if (num == 3)
		{
			System.out.println("num equals 6");
		}
		
		boolean tf = true;
		if(tf)
		{
			System.out.println("True");
		}
		
		if(!tf)
		{
			System.out.println("False");
		}
				
		int num2 =(int) (1+Math.random()*100);
		System.out.println(num2);
		
		Random r = new Random();
		int num3 = r.nextInt(10);
		
		System.out.println(num3);
		
		Scanner kb = new Scanner(System.in);
		System.out.println("enter a number");
		int num4 = kb.nextInt();
		System.out.println("enter a number");
		int num5 = kb.nextInt();
		boolean even = (one + two) %2 == 0;
		
		if(even)
		{
			System.out.println("Your number " + num4 + num5 " is even.")
		}
		if(!even)
		{
			System.out.println("Your number " + num4 + num5 " is odd.")	
		}
		
		
	}
	public static boolean tf()
	{
		return false;
	}
}