package anotherex;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import anotherex.PARTMANAGER.PartResponse;


@XmlRootElement( name = "item" )
@XmlAccessorType(XmlAccessType.FIELD)
public class Item {

	@XmlElement(name="partnumber")
	public int partNumber;
	
	@XmlElement(name="quantity")
	public int quantity;
	
	@XmlElement(name="result")
	public String result;
	
	@XmlElement(name="errormessage")
	public String errorMessage;
	
	//constructors
	public Item() {
		super();
	}

	public Item(int partNumber, int quantity) {
		super();
		this.partNumber = partNumber;
		this.quantity = quantity;
	}

	//class methods
	public Boolean isValid(){
		if(quantity <= 0 || partNumber <=0 || partNumber == 1111 || partNumber == 2222){return false;}
		else
			return true;
	}
	
	//getters and setters
	public int getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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
		return "Item [partNumber=" + partNumber + ", quantity=" + quantity + "]";
	}

	
}
