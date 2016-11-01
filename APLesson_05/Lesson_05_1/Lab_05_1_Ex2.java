import java.util.Scanner;
public class Lab_05_1_Ex2
{
	public static String condition = "";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//EXAMPLE_02
		System.out.println("\nPlease enter your height in inches.");
		double height = kb.nextDouble();
		System.out.println("Height Recorded as " + height + " inches.\nPlease enter your weight in pounds.");
		double weight = kb.nextInt();
		System.out.println("Weight Recorded as " + weight + " pounds.");
		double bmi = 703 * weight / (height * height);
		calcCond(bmi);
		System.out.printf("Your BMI is %4.2f", bmi);
		System.out.println("\nYour condition is " + condition + ".");	
	}	
	//EXAMPLE_02
	public static String calcCond(double b)
	{
		if(b > 39.9)
			condition = "Morbidly Obese";
		else if(b > 35)
			condition = "Very Obese";
		else if(b > 29.9)
			condition = "Obese";
		else if(b >25 )
			condition = "Overweight";
		else if(b > 18.5)
			condition = "Normal";
		else 
			condition = "Underweight";
		return condition;
	}
	
}