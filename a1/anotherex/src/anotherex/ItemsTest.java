package anotherex;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ItemsTest {
	
	
	@Test
	public void isDeliveryAddressValidTest(){
		DatabaseMock mockdb = new DatabaseMock();
		Item singleItemTest;
		for(int i = 0; i < mockdb.singleItems.size(); i++){
			singleItemTest = mockdb.singleItems.get(i);
			System.out.println(singleItemTest);
			System.out.println(singleItemTest.isValid());
			assertTrue(singleItemTest.isValid());
		}			
	}


}
