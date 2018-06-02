package anotherex;

import static org.junit.Assert.*;
import org.junit.Test;


public class AddressTest {

	@Test
	public void isDeliveryAddressValidTest(){
		DatabaseMock mockdb = new DatabaseMock();
		DeliveryAddress address;
		
		for(int i = 0; i < mockdb.addresses.size(); i++){
			address = mockdb.addresses.get(i);
			System.out.println(address);
			System.out.println(address.isValid());
			assertTrue(address.isValid());
		}			
	}
}
