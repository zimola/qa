
public class Country {
	
	public String manufacturing;
	public String agriculture;
	public String tourism;
	
	Country(){
		manufacturing = "0";
		agriculture = "0";
		tourism = "0";
	}
	
	public String getAgriculture()
	{
		return agriculture;
	}

	public String getManufacturing()
	{
		return manufacturing;
	}
	
	
	public String getTourism()
	{
		return tourism;
	}
	
}
