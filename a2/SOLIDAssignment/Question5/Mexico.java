public class Mexico extends Country implements ICountryGDPReport
{

	Mexico(){
		agriculture = "5,000,000,000";
		tourism = "200,000,000";
	}
	
	public void PrintCountryGDPReport()
	{
		System.out.println("- Mexico:\n");
		System.out.println("   - Agriculture: " + getAgriculture());
		System.out.println("   - Tourism: " + getTourism());
	}
	
	
	public static void main(String args[]){
		Mexico mex = new Mexico();
		mex.PrintCountryGDPReport();

	}
}
