package anotherex;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement( name = "order" )
@XmlAccessorType(XmlAccessType.FIELD)
public class Order implements PARTMANAGER{

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	//constructors
	public Order() {
		super();
	}

	public Order(Dealer dealer, OrderItems orderItems, DeliveryAddress deliveryAddress) {
		super();
		this.dealer = dealer;
		this.orderItems = orderItems;
		this.deliveryAddress = deliveryAddress;
	
	}
	
	public PartResponse SubmitPartForManufactureAndDelivery(
			int partNumber, //666
			int quantity,
			DeliveryAddress deliveryAddress
		){
		Item item = new Item(partNumber, quantity);
		if(partNumber == 1111){
			return PartResponse.OUT_OF_STOCK;
			
		}else if(partNumber == 2222){
			return PartResponse.NO_LONGER_MANUFACTURED;
		}else
		return PartResponse.Success;
	}
	
	public static String orderResponse(Order order){
		
		if(order.isValid()){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
			Marshaller response = jaxbContext.createMarshaller();
			response.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			System.out.println("SUCCESSFULLY CREATED ORDER RESPONSE OBJECT");
			response.marshal(order, System.out);
			return "Valid Order";
			

		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if dealer is not authorized -->works
		}else if(!order.dealer.isValid()){
			try {
				order.orderItems=null;
				order.deliveryAddress=null;
				order.dealer.setDealerid(null);
				order.dealer.setDealeraccesskey(null);
				JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
				Marshaller response = jaxbContext.createMarshaller();
				order.dealer.setResult("failure");
				order.dealer.setError("Not Authorized");
				response.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				response.marshal(order, System.out);
				return "Dealer Not Valid";

			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//if orderitems are not correct
		}else if(!order.orderItems.isValid()){
			try {
				
				for(int i=0; i< order.orderItems.items.size(); i++){
					if(!order.orderItems.items.get(i).isValid()){

						order.orderItems.items.get(i).setResult("faliure");
					
					if(order.orderItems.items.get(i).getPartNumber() <= 0){
						order.orderItems.items.get(i).setErrorMessage("invalid part");
					}else if(order.orderItems.items.get(i).getPartNumber() == 1111){
						order.orderItems.items.get(i).setErrorMessage("out of stock");
					}else if(order.orderItems.items.get(i).getPartNumber() == 2222){
						order.orderItems.items.get(i).setErrorMessage("no longer manufactured");
					}
					
				   }
				}
				
				order.dealer = null;
				order.deliveryAddress=null;
				JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
				Marshaller response = jaxbContext.createMarshaller();

				response.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				response.marshal(order, System.out);
				return "Order Item not Valid";

			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			
			//if deliveryaddress is not valid
		}else if(!order.deliveryAddress.isValid()){
			try {
				order.orderItems=null;
				order.dealer=null;
				order.deliveryAddress=null;
				order.setResult("failure");
				order.setError("invalid order");
				order.setErrorMessage("invalid delivery address");
				JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
				Marshaller response = jaxbContext.createMarshaller();
				response.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				response.marshal(order, System.out);
				return "Address Not Valid";

			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "Unknown Exception";
		
	}
	
	
	public Boolean isValid(){
	
		
		if(Order.this.deliveryAddress.isValid()==false){
			return false;
			}
		else if(Order.this.orderItems.isValid()==false){
			return false;
			}
		else if(Order.this.dealer.isValid()==false){
			return false;
			}

		return true;
	}
	
	
	//getters and setters
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}

	public OrderItems getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItems orderItems) {
		this.orderItems = orderItems;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}
	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}


	@XmlElement(name="dealer")    
	public Dealer dealer;
	
	@XmlElement(name="orderitems")    
	public OrderItems orderItems;
	
	@XmlElement(name="deliveryaddress")    
	public DeliveryAddress deliveryAddress;
	
	@XmlElement(name="result")
	public String result;

	@XmlElement(name="error")
	public String error;
	
	@XmlElement(name="errormessage")
	public String errorMessage;
	
	
	
	//tostring
	@Override
	public String toString() {
		return "Order [dealer=" + dealer + ", orderItems=" + orderItems + ", deliveryAddress=" + deliveryAddress + "]";
	}
	
	
}
