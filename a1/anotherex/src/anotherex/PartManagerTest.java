package anotherex;

import static org.junit.Assert.*;

import org.junit.Test;

import anotherex.PARTMANAGER.PartResponse;

public class PartManagerTest {


	@Test
	public void isDeliveryAddressValidTest(){
		DeliveryAddress address = new DeliveryAddress();
		
		PartManagerMock mock1 = new PartManagerMock(1111,1111, address);
		PartManagerMock mock2 = new PartManagerMock(2222,2222, address);
		PartManagerMock mock3 = new PartManagerMock(234,3, address);
		PartResponse response1 = mock1.SubmitPartForManufactureAndDelivery(mock1.getPartNumber(), mock1.getQuantity(), mock1.getAddress());
		PartResponse response2 = mock1.SubmitPartForManufactureAndDelivery(mock2.getPartNumber(), mock2.getQuantity(), mock2.getAddress());
		PartResponse response3 = mock1.SubmitPartForManufactureAndDelivery(mock3.getPartNumber(), mock3.getQuantity(), mock3.getAddress());
		
		assertEquals(response1, PartResponse.OUT_OF_STOCK);
		assertEquals(response2, PartResponse.NO_LONGER_MANUFACTURED);
		assertEquals(response3, PartResponse.Success);	
	}
	
	
}
