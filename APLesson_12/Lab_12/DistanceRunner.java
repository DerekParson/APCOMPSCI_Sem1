import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter first x-coordinate:");
		int xCoord1 = kb.nextInt();
		System.out.println("Enter second y-coordinate:");
		int yCoord1 = kb.nextInt();
		System.out.println("Enter first x-coordinate:");
		int xCoord2 = kb.nextInt();
		System.out.println("Enter second y-coordinate:");
		int yCoord2 = kb.nextInt();
		Distance object = new Distance(xCoord1, yCoord1, xCoord2, yCoord2);
		object.setValues(xCoord1, yCoord1, xCoord2, yCoord2);
		System.out.println("The distance between (" + xCoord1 + "," + yCoord1 + ") and ("+xCoord2+","+yCoord2+") is "+object.getDist() + ".");
	}
}