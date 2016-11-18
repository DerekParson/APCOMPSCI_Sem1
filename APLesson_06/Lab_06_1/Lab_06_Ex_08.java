public class Lab_06_Ex_08
{
	public static void main(String[]args)
	{
		String word1 = "Na";
		int toRepeat1 = 4;
		String word2 = "Hey";
		int toRepeat2 = 3;
		String word3 = "Goodbye!";
		int toRepeat3 = 1;
		sing(word1, toRepeat1);
		sing(word1, toRepeat1);
		sing(word2, toRepeat2);
		sing(word3, toRepeat3);
	}
	public static void sing(String lyric, int repetition)
	{
		for(int i = 0; i < repetition; i++)
			System.out.print(lyric + " ");
		System.out.println("\n");
		}
}