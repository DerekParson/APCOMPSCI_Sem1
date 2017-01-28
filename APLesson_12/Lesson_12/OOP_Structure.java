public class OOP_Structure
{
	private String userName, firstName, lastName;
	
public OOP_Structure()
   {
       userName = "";
       firstName = "";
       lastName = "";
   }
public OOP_Structure(String uName, String fName, String lName)
{
	userName = uName;
	firstName = fName;
	lastName = lName;
}
public void setUserName(String uName)
{
	userName = uName;
}
public String getUserName()
{
	return userName;
}
public String getFirstName()
{
	return firstName;
}
public String getLastName()
{
	return lastName;
}
}