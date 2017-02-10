import java.util.Scanner;
import java.util.ArrayList;
public class ToyRun
{
	public static void main(String[]args)
	{
		ArrayList<Toy> list = new ArrayList<Toy>();
		list.add(new aFigure("Robot", 1));
		list.add(new Car("Octane", 1));
		System.out.println(list.toString() + "\n");
	}


}