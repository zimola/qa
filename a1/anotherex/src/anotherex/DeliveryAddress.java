package anotherex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement( name = "deliveryaddress" )
@XmlAccessorType(XmlAccessType.FIELD)
public class DeliveryAddress {
	
	@XmlElement(name="name")    
	public String name;
	
	@XmlElement(name="street")    
	public String street;
	
	@XmlElement(name="city")    
	public String city;
	
	@XmlElement(name="province")    
	public String province;
	
	@XmlElement(name="postalcode")    
	public String postalCode;
	
	@XmlElement(name="error")
	public String error;
	
	@XmlElement(name="errormessage")
	public String errorMessage;
	
	//constructors
	public DeliveryAddress() {
		super();
	}

	public DeliveryAddress(String name, String street, String city, String province, String postalCode) {
		super();
		this.name = name;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
	}
	
	//class methods
	public boolean isValid(){
		if (name == null || street ==null || city == null || province ==null || postalCode ==null){
			return false;
			}
		else if( name.trim().isEmpty() || street.trim().isEmpty()|| city.trim().isEmpty() || province.trim().isEmpty() || postalCode.trim().isEmpty()){
			return false;
			}

		else 
			return true;
	}
	/*
	public Boolean isValid(DeliveryAddress deliveryaddress){
		//method to check is items in delivery address are not empty or null
		
		
		String name = deliveryaddress.name;
		String street = deliveryaddress.street;
		String city = deliveryaddress.city;
		String province = deliveryaddress.province;
		String postalCode = deliveryaddress.postalCode;
		
		if( name == "" || street =="" || city == "" || province =="" || postalCode ==""){
			return false;
			}
		else if (name == null || street ==null || city == null || province ==null || postalCode ==null){
			return false;
			}
		else 
			return true;
	}
	
	
	public Boolean isValid(String name, String street, String city, String province, String postalCode){
		//method to check is items in delivery address are not empty or null
		
		this.name = name;
		this.street = street;
		this.city = city;
		this.province = province;
		this.postalCode = postalCode;
		
		if( name == "" || street =="" || city == "" || province =="" || postalCode ==""){
			return false;
			}
		else if (name == null || street ==null || city == null || province ==null || postalCode ==null){
			return false;
			}
		else 
			return true;
	}
	

*/
	//getters and setters	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	//toString
	@Override
	public String toString() {
		return "DeliveryAddress [name=" + name + ", street=" + street + ", city=" + city + ", province=" + province
				+ ", postalCode=" + postalCode + "]";
	}
	

}
