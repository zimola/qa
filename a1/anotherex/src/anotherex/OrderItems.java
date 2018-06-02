package anotherex;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement( name = "orderitems" )
@XmlAccessorType(XmlAccessType.FIELD)
public class OrderItems {

	@XmlElement(name="item")    
	public ArrayList<Item> items;
	
	//constructors
	public OrderItems() {
		super();
	}
	
	public OrderItems(ArrayList<Item> items) {
		super();
		this.items = items;
	}
	
	//class methods
	public Boolean isValid(){
		//checks is items exist, or is null
		//TODO do a item.isvalid
		Item item;
		for (int i=0; i < this.items.size(); i++){
			item = this.items.get(i);
			if (item.isValid()==false){return false;}
		}
		
		if(items == null || items.size() == 0){return false; }
		else 
			return true;
	}
	

	//getters and setters
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
	//toString
	@Override
	public String toString() {
		return "OrderItems [items=" + items + "]";
	}

}
