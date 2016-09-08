public class Lab_02
{
	public static void main(String[]args)
	{
		int first = 337;
		int second = 1677;
		int mult = first * second;
		
		System.out.println(first + " multiplied by " + second + " is " + mult);
	
		String name = "Joe Smith";
		int addressNum = 1234;
		String addressName = "Easy Street";
		String city = "Suburbia";
		int zip = 12345;
		
		System.out.println("\n" + name + "\n" + addressNum + " " + addressName + "\n" + city + "\n" + zip);
		
		int length = 1940;
		int height = 145;
		int width = 1337;
		int total = (length * width * 2) + (height * width * 2) + (length * height * 2);
		System.out.println("\n The surface area of your rectangle is " + total);
	}

}