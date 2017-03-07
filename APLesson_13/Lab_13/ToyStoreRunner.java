public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore toySt = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List: " + toySt);
		System.out.println("\nYour most frequent toy: " + toySt.getMostFrequentToy());
		System.out.println("Your most frequent type of toy: " + toySt.getMostFrequentType());
	}
}