public class Person
{
	public String name;
	Address address;

	public Person()
	{
		this.name = "Rob";
		address = new Address("Rob street", "Rob city", "Rob province", "Rob postalcode");
	}

	public boolean IsPersonRob()
	{
		return name.equals("Rob") && IsRobsAddress();
	}

	private boolean IsRobsAddress()
	{
		return address.street.equals("Rob street") &&
			address.city.equals("Rob city") &&
			address.province.equals("Rob province") &&
			address.postalCode.equals("Rob postalcode");
	}
}