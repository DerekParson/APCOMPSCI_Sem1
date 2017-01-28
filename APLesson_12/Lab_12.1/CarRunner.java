import java.util.Scanner;
public class CarRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your car color:");
		String color = kb.nextLine();
		System.out.println("Enter your interior type:");
		String interior = kb.nextLine();
		System.out.println("Enter your engine type:");
		String engine = kb.nextLine();
		System.out.println("Enter your tire type:");
		String tire = kb.nextLine();

		Car object = new Car(color, interior, engine, tire);
		System.out.println("Your vehicle is being retrieved from the garage...");
		System.out.println("Paint: " + object.getPaint());
		System.out.println("Interior: " + object.getInterior());
		System.out.println("Engine: " + object.getEngine());
		System.out.println("Tires: " + object.getTires());
		
	}
}