public class Canada extends Country implements ICountryGDPReport
{
	
	Canada(){
		agriculture = "150,000,000";
		manufacturing = "200,000,000";
	}
	
	
	public void PrintCountryGDPReport()
	{
		System.out.println("- Canada:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Manufacturing: " + getManufacturing());
	}
	
}

