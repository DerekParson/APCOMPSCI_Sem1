import java.util.Scanner;
public class Lab_05_1
{
	public static String condition = "";
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		//EXAMPLE_01
		System.out.println("Enter your grade for Class 1");
		String grade1 = kb.next();
		System.out.println("Enter your grade for Class 2");
		String grade2 = kb.next();
		System.out.println("Enter your grade for Class 3");
		String grade3 = kb.next();
		System.out.println("Enter your grade for Class 4");
		String grade4 = kb.next();
		System.out.println("Enter your grade for Class 5");
		String grade5 = kb.next();
		System.out.println("Enter your grade for Class 6");
		String grade6 = kb.next();
		System.out.println("Enter your grade for Class 7");
		String grade7 = kb.next();
		
		double totalGrades = calcPoints(grade1) + calcPoints(grade2) + calcPoints(grade3) + calcPoints(grade4) + calcPoints(grade5) + calcPoints(grade6) + calcPoints(grade7);
		double gpa = totalGrades / 7;
		System.out.println("Your GPA is " + gpa + ".");
		
	
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
	//EXAMPLE_01
	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		else if (grade.equals("B"))
			return 3.0;
		else if (grade.equals("C"))
			return 2.0;
		else if (grade.equals("D"))
			return 1.0;
		else if (grade.equals("F"))
			return 0.0;
		else
			return 0.0;
		
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