public class User
{
	private String firstName, lastName, avatar;
	private int userID;
	
	public User()
	{
		firstName = "";
		lastName = "";
		avatar = "";
	}
	public User(String name1, String name2)
	{
		firstName = name1;
		lastName = name2;
		avatar = "";
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public User(String name1, String name2, String av)
	{
		firstName = name1;
		lastName = name2;
		avatar = av;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public void setValues(String name1, String name2, String av)
	{
		firstName = name1;
		lastName = name2;
		avatar = av;
		userID = (int)(Math.random() * 10000000) + 1;
	}
	public String toString()
	{
	return "Customer Info...\nFirst Name: " + firstName +
                           "\nLast Name: " + lastName +
                           "\nAvatar: " + avatar +
                           "\nUser ID#: " + userID;
	}


}