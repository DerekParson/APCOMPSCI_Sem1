public class RetMethods
{
	public static void main(String[]args)
	{
		RetMethods volCube = new RetMethods();
		int side1 = 3;
		System.out.println(volCube.cube(side1));
		
		RetMethods average = new RetMethods();
		int n1 = 3;
		int n2 = 2;
		int n3 = 45;
		double avg = average.calcAvg(n1, n2, n3);
		System.out.printf("the volume of the cube is %10.2f\n" + avg);
	}
	
	public int cube(int side)
	{
		return side*side*side;
	}
	public double calcAvg(int one, int two, int three)
	{
		return (one+two+three)/3.0;
	}
}