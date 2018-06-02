package anotherex;

import static org.junit.Assert.*;

import org.junit.Test;


public class OrderTest {

	@Test
	public void isDeliveryAddressValidTest(){
		DatabaseMock mockdb = new DatabaseMock();
		Order orderTest;
		for(int i = 0; i < mockdb.addresses.size(); i++){
			orderTest = mockdb.order.get(i);
			System.out.println(orderTest);
			System.out.println(orderTest.isValid());
			assertTrue(orderTest.isValid());
		}			
	}
	
	
	@Test
	public void orderResponseTest(){
		Order order = new Order();
		DatabaseMock mockdb = new DatabaseMock();
		Order order1 = mockdb.order.get(0);
		Order order2 = mockdb.order.get(1);
		Order order3 = mockdb.order.get(2);
		Order order4 = mockdb.order.get(3);
		Order order5 = mockdb.order.get(4);
		assertEquals(order.orderResponse(order1), "Valid Order");
		assertEquals(order.orderResponse(order2), "Valid Order");	
		assertEquals(order.orderResponse(order3), "Dealer Not Valid");
		assertEquals(order.orderResponse(order4), "Dealer Not Valid");
		assertEquals(order.orderResponse(order5), "Dealer Not Valid");
	}

}
