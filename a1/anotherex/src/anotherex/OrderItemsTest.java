package anotherex;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class OrderItemsTest {
	

	
	@Test
	public void isDeliveryAddressValidTest(){
		DatabaseMock mockdb = new DatabaseMock();
		OrderItems orderItemsTest;
		for(int i = 0; i < mockdb.addresses.size(); i++){
			orderItemsTest = mockdb.items.get(i);
			System.out.println(orderItemsTest);
			System.out.println(orderItemsTest.isValid());
			assertTrue(orderItemsTest.isValid());
		}			
	}

}
