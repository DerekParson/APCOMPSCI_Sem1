public class Lab_11_Ex_03
{
	public static void main(String[]args)
	{
		String[][] xO = new String[4][4];
		int pick = 0;
		for(int i =0; i<xO.length; i++)
		{
			for(int j = 0; j < xO[i].length;j++)
			{
				pick = (int)(Math.random()*2);
				if(pick == 0)
				{
					xO[i][j] = "x";
				}
				else if(pick == 1)
				{
					xO[i][j] = "o";
				}
			}
		}
		for(int i =0; i<xO.length; i++)
		{
			for(int j = 0; j < xO[i].length;j++)
			{
				System.out.print(xO[i][j] + "\t");
			}
			System.out.println();
		}	
	}
}