package anotherex;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DealerAuthTest {
	
	
	@Test
	public void isDeliveryAddressValidTest(){
		DatabaseMock mockdb = new DatabaseMock();
		Dealer dealerTest;
		for(int i = 0; i < mockdb.addresses.size(); i++){
			dealerTest = mockdb.dealers.get(i);
			System.out.println(dealerTest);
			System.out.println(dealerTest.isValid());
			assertTrue(dealerTest.isValid());
		}			
	}
	
	@Test
	public void dealerAuthorizationTest(){
		DatabaseMock mockdb = new DatabaseMock();
		Dealer dealerTest;
		for(int i = 0; i < mockdb.addresses.size(); i++){
			dealerTest = mockdb.dealers.get(i);
			System.out.println(dealerTest);
			assertTrue(dealerTest.IsDealerAuthorized(dealerTest.dealerid, dealerTest.dealeraccesskey));
			assertTrue(dealerTest.isValid());
		}	
		
	}

}
