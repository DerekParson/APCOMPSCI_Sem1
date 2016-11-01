import java.util.Scanner;
public class Lab_05_2_Ex6
{
	static Scanner kb;
	public static void main(String[]args)
	{
		kb = new Scanner(System.in);
		//EXERCISE_06
		passwordProgram();
	}
	public static void passwordProgram()
	{
		System.out.println("Enter your Username");
		String inputUsername = kb.next();
		String storedUsername = "user1234";
		System.out.println("Enter your Password");
		String inputPassword = kb.next();
		String storedPassword = "password1234";
		boolean usernameEquals;
		boolean passwordEquals;
		
		if(inputUsername.equals(storedUsername))
			usernameEquals = true;
		else 
			usernameEquals = false;
		if(inputPassword.equals(storedPassword))
			passwordEquals = true;
		else 
			passwordEquals = false;
	
		if(!(usernameEquals || passwordEquals))
		{
			System.out.println("Your username and password are incorrect");
			passwordProgram();
		}
		else if (usernameEquals || passwordEquals)
		{
			if(usernameEquals == false)
			{
				System.out.println("Your username is false");
				passwordProgram();
			}
			else if(passwordEquals == false)
			{
				System.out.println("Your password is false");
				passwordProgram();
			}
			else
				System.out.println("You are granted access.");
		}
	}
}
