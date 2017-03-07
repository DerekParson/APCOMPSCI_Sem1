public class ToyStoreRunner
{
	public static void main(String[]args)
	{
		ToyStore toyst = new ToyStore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		System.out.println("List:" + toyst);
		System.out.println("\n\nYour most frequent toy: " + toyst.getMostFrequentToy());
		System.out.println("Your most frequent type of toy: " + toyst.getMostFrequentType());
	}
}