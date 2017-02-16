import java.util.ArrayList;
public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ArrayList<ToyStore> ts = new ArrayList<ToyStore>();
		System.out.println(ts);
		System.out.println("Your most frequent toy: " + getMostFrequentToy());
		System.out.println("Your most frequent type of toy: " + getMostFrequentType());
	}
}