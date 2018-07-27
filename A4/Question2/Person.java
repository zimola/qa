public class Person
{
	private String name;
	private PhoneNumber phoneNumber;
	private Credentials credentials;

	public Person(String name)
	{
		this.name = name;
		phoneNumber = new PhoneNumber();
		credentials = new Credentials();
	}

	public void SetAreaCode(String areaCode)
	{
		this.phoneNumber.areaCode = areaCode;
	}
	
	public String GetAreaCode()
	{
		return phoneNumber.areaCode;
	}
	
	public void SetPhoneNumber(String phoneNumber)
	{
		this.phoneNumber.number = phoneNumber;
	}
	
	public String GetPhoneNumber()
	{
		if (this.phoneNumber.areaCode != null && this.phoneNumber.areaCode != "")
		{
			return "(" + phoneNumber.areaCode + ") " + phoneNumber.number; 
		}
		return phoneNumber.number;
	}

	public void SetLoginCredentials(String userName, String password)
	{
		this.credentials.userName = userName;
		this.credentials.password = password;
	}
	
	public boolean AuthenticateUser()
	{
		return (credentials.userName.equals(this.name) && credentials.password.equals("joepass"));
	}
}