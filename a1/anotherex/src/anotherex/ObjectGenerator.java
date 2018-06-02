package anotherex;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ObjectGenerator {
	
	File file;
	Order order;
	Dealer dealer;
	OrderItems items;
	DeliveryAddress address;
	
	public ObjectGenerator(){
		file = new File("mocks/order1.xml");
		order = getOrder(file);
		dealer = order.dealer;
		items = order.orderItems;
		address = order.deliveryAddress;
		
	}
	
	public static Order getOrder(File file){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
			System.out.println("SUCCESSFULLY CREATED ORDER OBJECT");
			Unmarshaller orderXML = jaxbContext.createUnmarshaller();
			Order order = (Order) orderXML.unmarshal(file);
			//System.out.println(order);
			return order;
			
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return null;
	}
}
