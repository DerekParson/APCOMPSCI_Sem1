import java.util.Scanner;
public class Lab_04_Ex2
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		//EX_02
		Lab_04_Ex2 idCard = new Lab_04_Ex2();
		
		System.out.println("Enter your first name");
		String firstName = keyboard.next();
		System.out.println("Enter your last name");
		String lastName = keyboard.next();
		System.out.println("Enter your title");
		String title = keyboard.next();
		System.out.println("Enter your school site");
		keyboard.nextLine();
		String schoolSite = keyboard.nextLine();
		System.out.println("Enter the school year");
		String year = keyboard.next();
		keyboard.nextLine();
		System.out.println("What is your subject?");
		String subject = keyboard.nextLine();
		
		
		System.out.println("*************************************************");
		idCard.format2(schoolSite, year);
		idCard.format2(firstName, lastName);
		idCard.format2(title, subject);
		System.out.println("*************************************************");
	}
	public void format2(String leftHalf, String rightHalf)
	{
		System.out.printf("%n%-2s %15s %15s %2s", "* ", leftHalf, rightHalf, " *\n");
	}
}	
