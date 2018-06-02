package anotherex;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import anotherex.PARTMANAGER.PartResponse;

public class Controller{
	
	public static Order getOrder(File file){
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
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
	

	public static void main(String args[]){
		
		/* THE FILE PATH CAN BE CHANGED TO ANY NUMBER BETWEEN 1 and 12 */
		/* THE XML'S COVER INVALID AND VALID CASES */
		
		File file = new File("mocks/order1.xml");
		Order order = getOrder(file);
		String s = order.orderResponse(order);

	}
}
