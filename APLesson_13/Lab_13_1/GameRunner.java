import java.util.Scanner;
public class GameRunner
{
	public static void main(String[]args)
	{
		XBox xbox1 = new XBox("Xbox One");
		PC dell = new PC("Dell Inspiron PC");
		XBox xbox = new XBox("DirectX Box");
		Playstation ps4 = new Playstation("PS4");
		Playstation ps1 = new Playstation("PS1");
		PC bestGaming = new PC("Google Servers");
		PC wiiEmulator= new PC("Raspberry Pi 3");
		
		System.out.println(xbox1);
		System.out.println(xbox);
		System.out.println(ps1);
		System.out.println(ps4);
		System.out.println(dell);
		System.out.println(wiiEmulator);
		System.out.println(bestGaming);
	}
}