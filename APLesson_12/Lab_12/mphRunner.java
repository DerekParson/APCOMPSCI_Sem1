import java.util.Scanner;
public class mphRunner
{
	public static void main(String[]args)
	{
	Scanner kb = new Scanner(System.in);
	System.out.println("Enter distance");
	int distance = kb.nextInt();
	System.out.println("Enter hours");
	int hours = kb.nextInt();
	System.out.println("Enter minutes");
	int minutes = kb.nextInt();
	
	mph object = new mph(distance, hours, minutes);
	object.setValues(distance, hours, minutes);
	System.out.println("If you go " + distance + " miles in " + hours + " hours," + minutes + " minutes, you are going " + object.getMPH() + "mph.");
	
	}
}