public class Lab_11_Ex_01
{
	public static void main(String[]args)
	{
		int[][] rand = new int[4][4];
		
		for(int i =0; i<rand.length; i++)
		{
			for(int j = 0; j < rand[i].length;j++)
			{
				rand[i][j] = (int)(Math.random() * 100);
				
			}
		}
		for(int i =0; i<rand.length; i++)
		{
			for(int j = 0; j < rand[i].length;j++)
			{
				System.out.print(rand[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}